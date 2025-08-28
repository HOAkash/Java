import java.util.Scanner;
 public class buffer {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String src=sc.nextLine().toLowerCase();
        int vowels=0;
        // for(int i=0;i<=src.length();i++){
        //     if(src[i]=='a'||src.[i]=='e'||src.charAt(i)=='i'||src.charAt(i)=='o'||src.charAt(i)=='u'){
        //         vowels++;
        //     }
        // }
        for (char c : src.toCharArray()) {
  if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                vowels++;
            }
        }
        System.out.println(vowels);
    }
    
}
