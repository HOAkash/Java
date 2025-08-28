import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        int i = 0; 
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++; 
                arr[i] = arr[j];
               
            }
       

        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 4, 5, 5};
        
        System.out.println();
        int newLength = removeDuplicates(arr);
        System.out.println("Array after removing duplicates:");
        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + "_");
        }
        
        
    }
}