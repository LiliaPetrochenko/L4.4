package Lab4;

import java.util.Scanner;

public class Offset extends University 
{

    public static int i=0;
    private int L = 0;
    
    
    private String[] Offset=new String[35];
    Scanner scan=new Scanner(System.in);
    public Offset()
    {
        this.Create();
    }

    @Override
    public void Create()
    {
        if (i<15)
        {
        System.out.println("¬ведите название зачЄта");
                Offset[L]=scan.nextLine();
                L++;
                i++;
    }
        else
        {
            System.out.println("—оздано максимальное количество зачЄтов");
        }
    }
    
    @Override
    public void Info()
    {
        if (L>0) 
        {
            for (int j=0;j<L;j++) 
            {
                System.out.println(Offset[j]);
            }
        }
    } 
}
