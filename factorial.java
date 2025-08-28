import java.util.Scanner;
public class factorial {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        
        if(num<0){
            System.out.println("enter valid number");
        }
      
        else{
            int fact=1;
              for(int i=1;i<=num;i++){
               fact*=i;
             
                }
                 System.err.println("factorial of"+num+"is"+fact);  
        }
    }
    
}
