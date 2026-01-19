
import java.util.Random;
public class Q2_RemoveRandom {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Random r = new Random();
        int index = r.nextInt(arr.length);
        for(int i=0;i<arr.length;i++)
            if(i!=index) System.out.print(arr[i]+" ");
    }
}
