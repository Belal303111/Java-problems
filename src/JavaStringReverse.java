import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb=new StringBuilder(A);
        int i=0,j=sb.length()-1;
        char temp;
        while(i<sb.length()/2)
        {
            temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        String B = sb.toString();
        System.out.println("A:"+A+"\nB:"+B);
        if(A.equals(B))System.out.println("Yes");
        else System.out.println("No");
        /* Enter your code here. Print output to STDOUT. */

    }
}



