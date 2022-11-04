import java.util.ArrayList;
import java.util.Arrays;

public class ArraysNestedArray {
/**
 * Problem Description
 * You are given an integer array A of length N.
 * You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
 * For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
 * More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 *
 *
 *
 * Problem Constraints
 * 1 <= N, M <= 103
 * 1 <= A[i] <= 105
 * 1 <= L <= R <= N
 *
 *
 * Input Format
 * The first argument is the integer array A.
 * The second argument is the 2D integer array B.
 *
 *
 * Output Format
 * Return an integer array of length M where ith element is the answer for ith query in B.
 *
 *
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * B = [[1, 4], [2, 3]]
 * Input 2:
 *
 * A = [2, 2, 2]
 * B = [[1, 1], [2, 3]]
 *
 *
 * Example Output
 * Output 1:
 * [10, 5]
 * Output 2:
 *
 * [2, 4]
 *
 *
 * Example Explanation
 * Explanation 1:
 * The sum of all elements of A[1 ... 4] = 1 + 2 + 3 + 4 = 10.
 * The sum of all elements of A[2 ... 3] = 2 + 3 = 5.
 * Explanation 2:
 *
 * The sum of all elements of A[1 ... 1] = 2 = 2.
 * The sum of all elements of A[2 ... 3] = 2 + 2 = 4.
 * */
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> output = new ArrayList<>();
        for(ArrayList<Integer> b: B){
            output.add(sum(A, b.get(0),b.get(1)));
        }

        return output;
    }

    private int sum(ArrayList<Integer> A, int start , int end) {
        int sum = 0;
        int reminder;
        if(end > A.size()){
            reminder = end % A.size();
            end = A.size();
            for ( int j = 0;j < reminder; j++){
                sum += A.get(j);

            }
        }
        for(int i = start-1; i< end; i++) {
            sum += A.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] A= {1, 2, 3, 4, 5};
        Integer[] b = {1, 4};
        Integer[] c = {2,3};
        ArrayList<ArrayList<Integer>> nested = new ArrayList<>();
        nested.add(new ArrayList<>(Arrays.asList(b)));
        nested.add(new ArrayList<>(Arrays.asList(c)));
        System.out.println(new ArraysNestedArray().solve(new ArrayList<>(Arrays.asList(A)), nested));
        //output : [10, 5]
    }
}
