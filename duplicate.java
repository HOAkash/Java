import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 1, 1, 3, 4, 5, 5, 6, 8, 9};
         int b[]=new int[];
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(a[i]==a[j]){
                   a[j]=-1;

                }

            }
        }
    }
}
