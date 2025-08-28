import java.util.Scanner;
public class natf {
    public static void main(String[]args){
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the n value");
        int n = scanner.nextInt();
         if(n<=0){
            System.out.println("enter the possitive numbers only");
         }
         else{
        sum=n*(n+1)/2;
        System.out.println(sum);
         }

    }

    
}
