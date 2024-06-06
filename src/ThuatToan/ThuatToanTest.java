package ThuatToan;
import java.util.*;

public class ThuatToanTest {

    public  static void bubbleSort ( int[] arr, int n) {
        int count = 0;

        for(int i= 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count = count+1;
            }
        }

        if(count == 0) {
            return;
        }

        bubbleSort(arr, n-1);

    }

    public static void insertionSort ( int[] arr, int n) {
        for(int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
            }

            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
      int[] number = {1,4,3,2,6,5};
      int n = number.length;

//        bubbleSort(number, n);

        insertionSort(number, n);
        System.out.println("kq:::"+ Arrays.toString(number));
    }
}
