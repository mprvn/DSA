import java.util.ArrayList;
import java.util.Arrays;

public class ArraysMinimumTimeInSecondsEqual {
/**
 * Problem Description
 * Given an integer array A of size N. In one second, you can increase the value of one element by 1.
 *
 * Find the minimum time in seconds to make all elements of the array equal.
 *
 *
 * Problem Constraints
 * 1 <= N <= 1000000
 * 1 <= A[i] <= 1000
 *
 *
 * Input Format
 * First argument is an integer array A.
 *
 *
 * Output Format
 * Return an integer denoting the minimum time to make all elements equal.
 *
 *
 * Example Input
 * A = [2, 4, 1, 3, 2]
 *
 *
 * Example Output
 * 8
 *
 *
 * Example Explanation
 * We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
 * */
    public int solve(ArrayList<Integer> A) {
        int max = 0;
        for(Integer a: A){
            if(a > max) max = a;
        }
        int count = 0;
        for(Integer a: A){
            count += max-a;
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] A ={2, 4, 1, 3, 2};
        System.out.println(new ArraysMinimumTimeInSecondsEqual().solve(new ArrayList<>(Arrays.asList(A))));

        //output: 8
    }
}
