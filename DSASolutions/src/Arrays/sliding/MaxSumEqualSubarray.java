package src.Arrays.sliding;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Problem Description
 * Given an array A of length N. Also given are integers B and C.
 * Return 1 if there exists a subarray with length B having sum C and 0 otherwise
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 104
 * 1 <= B <= N
 * 1 <= C <= 109
 * Input Format
 * First argument A is an array of integers.
 * The remaining arguments B and C are integers
 * Output Format
 * Return 1 if such a subarray exist and 0 otherwise
 * Example Input
 * Input 1:
 * A = [4, 3, 2, 6]
 * B = 2
 * C = 5
 * Input 2:
 * A = [4, 2, 2]
 * B = 2
 * C = 8
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * 0
 * Example Explanation
 * Explanation 1:
 * The subarray [3, 2] is of length 2 and sum 5.
 * Explanation 2:
 * There are no such subarray.
 * */
public class MaxSumEqualSubarray {
    public int solve(ArrayList<Integer> A, int B, int C) {
        int sumOfFirstSubArray = 0;
        for(int i=0; i<B; i++ ){
            sumOfFirstSubArray+= A.get(i);
        }
        int s = 1;
        int e = B;
           if(B == A.size()){
               int sum = 0;
               for(Integer a : A){
                   sum += a;
                   if(sumOfFirstSubArray == sum) return 1;
               }

           }
        while(e<A.size()){
            sumOfFirstSubArray = sumOfFirstSubArray - A.get(s-1) + A.get(e);
            if(sumOfFirstSubArray == C){
                return 1;
            }
            e++;s++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Integer[] A = {6};
        int B = 1;
        int C = 6;
        System.out.println(new MaxSumEqualSubarray().solve(new ArrayList<>(Arrays.asList(A)), B, C));
    }
}
