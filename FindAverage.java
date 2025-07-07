public class FindAverage {
    public static void main(String[] args) {
        int[]numbers={15,25,35,45,55};
        int sum=0;
        for(int num : numbers){
            sum += num;
        }
        double averege = (double)sum/numbers.length;
        System.out.println("average " + averege);
    }
    
    
}
