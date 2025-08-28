import java.util.Scanner;
 public class pos { 
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    if(num>0){
        System.out.println("number is possitive");
    }
    else if(num<0){
        System.out.println("number is nagative");
    }
    else{
        System.out.println("number is zero");
    }


    }
    
}
