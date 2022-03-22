import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {2,0,0,0, 3, 3, 0, 7,  0, 9};//2,3,3,7,9,0,0,0,0
        int[] nums2 = {1,0,3,0,5};
        var a = new ArrayProblems(nums);
        a.moveZerosToEndNaive();
        System.out.println(Arrays.toString(nums));

    }
}
