import java.util.ArrayList;
import java.util.Arrays;

public class ArraysSecondLargest {
    /**
     * Problem Description
     * You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
     *
     *
     * Problem Constraints
     * 1 <= |A| <= 105
     *
     * 0 <= A[i] <= 109
     *
     *
     *
     * Input Format
     * The first argument is an integer array A.
     *
     *
     *
     * Output Format
     * Return the second largest element. If no such element exist then return -1.
     *
     *
     *
     * Example Input
     * Input 1:
     *
     *  A = [2, 1, 2]
     * Input 2:
     *
     *  A = [2]
     *
     *
     * Example Output
     * Output 1:
     *
     *  1
     * Output 2:
     *
     *  -1
     *
     *
     * Example Explanation
     * Explanation 1:
     *
     *  First largest element = 2
     *  Second largest element = 1
     * Explanation 2:
     *
     *  There is no second largest element in the array.
     * */
    public int solve(ArrayList<Integer> A) {
        int max = 0;
        int max2 = 0;
        for(Integer a: A){
            if(a > max) max = a;


        }
        for(Integer a : A){
            if(max != a && a > max2) max2 = a;
        }
        return max2 == 0 ? -1 : max2;
    }

    public static void main(String[] args) {
        Integer[] A ={2, 1, 2};

        System.out.println(new ArraysSecondLargest().solve(new ArrayList<>(Arrays.asList(A))));
         // output : 1
        Integer[] B ={ 2};

        System.out.println(new ArraysSecondLargest().solve(new ArrayList<>(Arrays.asList(B))));
        //output : -1
    }
}
