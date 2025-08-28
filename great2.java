import java.util.Scanner;
public class great2 {
    public static void main(String[]args){
         Scanner scanner=new Scanner(System.in);
        System.out.println("enter the num1 value");
        int num1=scanner.nextInt();
        System.out.println("enter the num2 number");
        int num2=scanner.nextInt();
        if(num1>num2){
            System.out.println("number "+num1+" is greater than number "+ num2);
        }
        else if(num2>num1){
            System.out.println("number "+num2+" is greater than number "+num1);
        }
        else{
            System.out.println("both number are equal");
        }
    }
    
}
