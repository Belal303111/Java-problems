import java.util.*;
public class JavaStaticInitializationBlocks {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int B=s.nextInt();
        int H=s.nextInt();
        if(B<=0 || H<=0) System.out.println("java.lang.Exception: Breadth and height must be positive" );
        else{
            int area=B*H;
            System.out.println(area);
        }
    }
}
