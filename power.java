import java.util.Scanner;

public class power {
         public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("base value");
        double base=sc.nextInt();
        System.out.println("exponent value");
        int exponent=sc.nextInt();
    double result=Math.pow(base, exponent);

        System.out.println(result);

         }   
}
