import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        int[] nums = {2,2,3,3, 3, 3, 5, 7,  9, 9};
        int[] nums2 = {1,2,3,7,5,6};
        var a = new ArrayProblems(nums);
        System.out.println(a.remDup());
        //a.remDupNaive();

        /*a.lRotateOne();
        for (int x:
             nums2) {
            System.out.println(x);
        }*/

    }
}
