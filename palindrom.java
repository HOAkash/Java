  import java.util.Scanner;

public class palindrom {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

       
        originalString = originalString.toLowerCase();

        String reversedString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        if (originalString.equals(reversedString)) {
            System.out.println("it is a palindrome.");
        } else {
            System.out.println("it is not a palindrome.");
        }

       
    }
}

    

