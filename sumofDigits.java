import java.util.Scanner;
public class sumofDigits {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        

        while (num != 0) {
            int digit = num % 10; 
            sum = sum + digit;       
            num = num / 10; 
        }

        System.out.println("Sum of digits: " + sum); 
    }
}