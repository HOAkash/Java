public class jaggedarray {
    public static void main(String[] args) {
        int A[][]=new int[4][];
        A[0]=new int[]{6,4,2};
        A[1]=new int[]{3,3,5,1,6,8};
        A[2]=new int[]{6,4,2};
        A[3]=new int[]{3,3,5,1,6,8};
        System.err.println("the jagged array is:");
        for(int i=0;i<A.length;i++){
          for(int j=0;j<A[i].length;j++){  
            System.out.print(A[i][j]+"");

        }
        System.out.println();
    }
    }
    
}
