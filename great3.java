import java.util.Scanner;

public class great3 {
     public static void main(String[]args){
         Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number1 value");
        int num1=scanner.nextInt();
        System.out.println("enter the number2 number");
        int num2=scanner.nextInt();
        System.out.println("enter the number3 number");
        int num3=scanner.nextInt();
    if(num1>=num2&&num1>=num3){
        System.out.println("number "+num1+" is greater");
    }
    else if(num2>=num1&&num2>=num3){
        System.out.println("number "+num2+"  is greater");
    }
    else{
        System.out.println("number "+num3+"  is greater");
    }
}
}
