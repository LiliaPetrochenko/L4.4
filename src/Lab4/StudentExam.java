package Lab4;

import java.util.Scanner;

public class StudentExam extends University
{
    public static int i = 0;
    private int k,m=0;
    
    private String[] Stud=new String[30]; 
    
    private String[] Exam=new String[30];
    Scanner scan=new Scanner(System.in);
    public StudentExam()
    {
        this.Create();
    }
    
    
    @Override
    public void Create()
    {
        if (i<30)
        {
        System.out.println("Введите фамилию студента:");
            Stud[k]=scan.nextLine();
            
            if (m<30)
            { 
                System.out.println("Введите название экзамена");
                    Exam[m]=scan.nextLine();
                m++;  
            }
            k++;
            i++;
        }
        else
        {
            System.out.println("Набрано максимальное количество студентов");
        }
    }
    
    
    
    @Override
    public void Info()
    {
        if (k>0) 
        {
            for (int f=0;f<k;f++)
            {
                System.out.println(Stud[f] + " сдаёт " + Exam[f]);
            }
        }
    }
}
