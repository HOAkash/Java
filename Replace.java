import java.util.Arrays;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to be replaced");
          int num1=scanner.nextInt();
           System.out.println("Enter the new number");
          int num2=scanner.nextInt();
        int arr[]={1,2,3,4};
         
       for (int i=0;i<arr.length;i++){
            if(arr[i]==num1){
                   arr[i]=num2;
  
            }
            
        }
          System.out.println(Arrays.toString(arr));

       
    }
    
}
