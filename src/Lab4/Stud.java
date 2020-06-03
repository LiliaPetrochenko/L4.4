package Lab4;

import java.util.ArrayList;
import java.util.Scanner;

class Stud 
{
    private ArrayList<Offset> o = new ArrayList<Offset>();
    private ArrayList<StudentExam> Se = new ArrayList<StudentExam>();
    private ArrayList<Certificate> Ce = new ArrayList<Certificate>();
    private int i = 0;
    private Scanner scan = new Scanner(System.in);

    public void add()
    {
        
    }
    
    public void clear()
    {
        
    }
    
    public void start() 
    {
        while (i != 10) 
        {
            try 
            {
                System.out.println();
                System.out.println("============MENU============");
                System.out.println("Выберите действие");
                System.out.println("1 - Принять студента и назначить ему экзамен");
                System.out.println("2 - Показать всех студентов и экзамены");
                System.out.println("3 - Отчислить всех студентов");
                System.out.println("4 - Добавить аттестацию");
                System.out.println("5 - Показать все аттестации");
                System.out.println("6 - Удалить все аттестации");
                System.out.println("7 - Добавить зачёт");
                System.out.println("8 - Показать все зачёты");
                System.out.println("9 - Удалить все зачёты");
                System.out.println("10 - Выход из программы"); 
                System.out.println("============MENU============");
                System.out.println();
                i = scan.nextInt();
                
                switch (i) 
                {                       
                    case 1:
                        Se.add(new StudentExam());
                        break;
                        
                    case 2:
                        int m = StudentExam.i;
                        System.out.println("Количество студентов :" + m);
                        System.out.println("Студенты и экзамены");
                        for (StudentExam stex : Se)
                        {
                            stex.Info();
                        }
                        break;
                        
                    case 3:
                        Se.clear();
                        System.out.println("Готово!");
                        break;
                        
                    case 4:
                        Ce.add(new Certificate());
                        break;
                        
                    case 5:
                        int k = Certificate.i;
                        System.out.println("Количество аттестаций " + k);
                        System.out.println("Аттестации");
                        for (Certificate ce : Ce)
                        {
                            ce.Info();
                        }
                        break;

                    case 6:
                        Ce.clear();
                        System.out.println("Готово!");
                        break;
                        
                    case 7:
                        o.add(new Offset());
                        break;
                        
                    case 8:
                        int f = Offset.i;
                        System.out.println("Количество зачётов " + f);
                        System.out.println("Зачёты");
                        for (Offset off : o) 
                        {
                            off.Info();
                        }
                        break;
                        
                    case 9:
                        o.clear();
                        System.out.println("Готово!");
                        break;
                        
                    case 10:
                        System.out.println("Программа завершена");
                        break;
                             
                    default:
                        System.out.println("Данного пункта не существует!!!");
                        break;
                        
                }
            } 
            catch (Exception ex) 
            {
                System.out.println("Данного пункта не существует!!!");
                scan.next();
            }
        }
    }
}

