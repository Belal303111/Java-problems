import java.util.*;
public class JavaOutputFormatting {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s=sc.next();
            int x=sc.nextInt();
           // sc.next();
           System.out.print(s);
           for(int j=s.length();j<15;j++)
               System.out.print(" ");
           if(x>=100) System.out.println(x);
           else if(x>=10) System.out.println("0"+x);
           else System.out.println("00"+x);
            //Complete this line
        }
        System.out.println("================================");


    }
}
