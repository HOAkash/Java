import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scanner.nextInt();
        if(num<=0){
            System.out.println("enter the number greater than zero ");
        }
        else if(num%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }

    }
    
}
