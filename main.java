public class main {
    public static int countSubarrays(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i + 1] >= arr[i] && arr[i + 1] >= arr[i + 2]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3};
        System.out.println("Number of subarrays: " + countSubarrays(arr));
    }
}

