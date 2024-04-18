package Code300;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        TwoSum baiTapClass = new TwoSum(new int[]{2, 7, 11, 15}, 9);
       int[] result1 = baiTapClass.twoSum();
        System.out.println("result1::  " + Arrays.toString(result1));

        int[] result2 = baiTapClass.twoSum2();
        System.out.println("result2::  " + Arrays.toString(result2));
    }
}
