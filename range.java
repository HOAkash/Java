import java.util.Scanner;
public class range {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the start value");
        int start=scanner.nextInt();
        System.out.println("enter the end value");
        int end=scanner.nextInt();
        for(int i=start;i<=end;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        
    }
    
}
