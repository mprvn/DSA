import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Problem Description
 * You are given a constant array A.
 *
 * You are required to return another array which is the reversed form of the input array.
 *
 *
 *
 * Problem Constraints
 * 1 <= A.size() <= 10000
 *
 * 1 <= A[i] <= 10000
 *
 *
 *
 * Input Format
 * First argument is a constant array A.
 *
 *
 *
 * Output Format
 * Return an integer array.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [1,2,3,2,1]
 * Input 2:
 *
 * A = [1,1,10]
 *
 *
 * Example Output
 * Output 1:
 *
 *  [1,2,3,2,1]
 * Output 2:
 *
 *  [10,1,1]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Reversed form of input array is same as original array
 * Explanation 2:
 *
 * Clearly, Reverse of [1,1,10] is [10,1,1]
 * */
public class ArraysReverseWholeArray {
    public ArrayList<Integer> solve(final List<Integer> A) {

        int s = 0;
        int e = A.size()-1;
        int temp;
        while(s < e){
            temp = A.get(s);
            A.set(s, A.get(e));
            A.set(e, temp);
            s++;
            e--;
        }
        return new ArrayList<>(A);
    }

    public static void main(String[] args) {
        Integer[] A = {1, 2, 3, 2, 1 };

        System.out.println(new ArraysReverseWholeArray().solve(new ArrayList<>(Arrays.asList(A))));
        // output [1,2,3,2,1]
        Integer[] B = {1,1,10 };

        System.out.println(new ArraysReverseWholeArray().solve(new ArrayList<>(Arrays.asList(B))));
        // output [10, 1, 1]
    }

}
