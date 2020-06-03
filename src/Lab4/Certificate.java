package Lab4;

import java.util.Scanner;

public class Certificate extends University 
{

    public static int i=0;
    public int j = 0;
    
    private String[] Certificate=new String[35];
    Scanner scan=new Scanner(System.in);
    public Certificate()
    {
        this.Create();
    }
    
    @Override
    public void Create()
    {
        if (i<15)
        {
        System.out.println("Введите название аттестации");
                Certificate[j]=scan.nextLine();
                i++;
                j++;
    }
        else
        {            
            System.out.println("Создано максимальное количество аттестаций");
        }
    }
    
    @Override
    public void Info()
    {
        if (j>0) 
        {
            for (int k=0;k<j;k++) 
            {
                System.out.println(Certificate[k]);
            }
        }
    }
}
