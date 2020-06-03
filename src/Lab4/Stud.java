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
                System.out.println("�������� ��������");
                System.out.println("1 - ������� �������� � ��������� ��� �������");
                System.out.println("2 - �������� ���� ��������� � ��������");
                System.out.println("3 - ��������� ���� ���������");
                System.out.println("4 - �������� ����������");
                System.out.println("5 - �������� ��� ����������");
                System.out.println("6 - ������� ��� ����������");
                System.out.println("7 - �������� �����");
                System.out.println("8 - �������� ��� ������");
                System.out.println("9 - ������� ��� ������");
                System.out.println("10 - ����� �� ���������"); 
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
                        System.out.println("���������� ��������� :" + m);
                        System.out.println("�������� � ��������");
                        for (StudentExam stex : Se)
                        {
                            stex.Info();
                        }
                        break;
                        
                    case 3:
                        Se.clear();
                        System.out.println("������!");
                        break;
                        
                    case 4:
                        Ce.add(new Certificate());
                        break;
                        
                    case 5:
                        int k = Certificate.i;
                        System.out.println("���������� ���������� " + k);
                        System.out.println("����������");
                        for (Certificate ce : Ce)
                        {
                            ce.Info();
                        }
                        break;

                    case 6:
                        Ce.clear();
                        System.out.println("������!");
                        break;
                        
                    case 7:
                        o.add(new Offset());
                        break;
                        
                    case 8:
                        int f = Offset.i;
                        System.out.println("���������� ������� " + f);
                        System.out.println("������");
                        for (Offset off : o) 
                        {
                            off.Info();
                        }
                        break;
                        
                    case 9:
                        o.clear();
                        System.out.println("������!");
                        break;
                        
                    case 10:
                        System.out.println("��������� ���������");
                        break;
                             
                    default:
                        System.out.println("������� ������ �� ����������!!!");
                        break;
                        
                }
            } 
            catch (Exception ex) 
            {
                System.out.println("������� ������ �� ����������!!!");
                scan.next();
            }
        }
    }
}

