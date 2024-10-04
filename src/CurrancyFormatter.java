import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrancyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat Usformat =NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat Indiaformat =NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        //Create new locate to india such that there isn't default locale to india
        NumberFormat Chinaformat =NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat Franceformat =NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Write your code here.
        // payment.getCurrencyInstance
        System.out.println("US: " +Usformat.format(payment));
        System.out.println("India: " +Indiaformat.format(payment));
        System.out.println("China: " + Chinaformat.format(payment));
        System.out.println("France: " + Franceformat.format(payment));
    }
}
