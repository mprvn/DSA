package src.Arrays.sliding;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem Description
 * Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.
 * Note: It is possible to swap any two elements, not necessarily consecutive.
 * Problem Constraints
 * 1 <= length of the array <= 100000
 * -109 <= A[i], B <= 109
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is the integer B.
 * Output Format
 * Return the minimum number of swaps.
 * Example Input
 * Input 1:
 *  A = [1, 12, 10, 3, 14, 10, 5]
 *  B = 8
 * Input 2:
 *  A = [5, 17, 100, 11]
 *  B = 20
 * Example Output
 * Output 1:
 *  2
 * Output 2:
 *  1
 * Example Explanation
 * Explanation 1:
 *  A = [1, 12, 10, 3, 14, 10, 5]
 *  After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
 *  After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
 *  Now, all elements less than or equal to 8 are together.
 * Explanation 2:
 *  A = [5, 17, 100, 11]
 *  After swapping 100 and 11, A => [5, 17, 11, 100].
 *  Now, all elements less than or equal to 20 are together.
 * */
public class MinimumSwapsTogether {

    public int solve(ArrayList<Integer> A, int B) {

        int k = 0; // lessthan b value count

        for(Integer a : A) {
            if(a <= B) k++;
        }

        if(k == 0 || k==1 || k == A.size())
            return 0;

        int count = 0;

        for(int i=0; i< k ; i++){
            if(A.get(i) > B) {
                count++;
            }
        }

        int omin = count;
        int s=1, e=k;
        while (e< A.size()){
            if(A.get(s-1) > B) count--;

            if(A.get(e) > B) count++;

            s++; e++;
            if(count < omin) {omin = count;}
        }

        return omin;
    }

    public static void main(String[] args) {
        Integer[] A = {1, 12, 10, 3, 14, 10, 5};
        int B = 8;
        System.out.println(new MinimumSwapsTogether().solve(new ArrayList<>(Arrays.asList(A)),B));
    }
}
