package src.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *Problem Description
 * You are given an array A of N elements. Find the number of triplets i,j and k such that i<j<k and A[i]<A[j]<A[k]
 *
 *
 * Problem Constraints
 * 1 <= N <= 103
 * 1 <= A[i] <= 109
 *
 *
 * Input Format
 * First argument A is an array of integers.
 *
 *
 * Output Format
 * Return an integer.
 *
 *
 * Example Input
 * Input 1:
 * A = [1, 2, 4, 3]
 * Input 2:
 * A = [2, 1, 2, 3]
 *
 *
 * Example Output
 * Output 1:
 * 2
 * Output 2:
 * 1
 *
 *
 * Example Explanation
 * For Input 1:
 * The triplets that satisfy the conditions are [1, 2, 3] and [1, 2, 4].
 * For Input 2:
 *
 * The triplet that satisfy the conditions is [1, 2, 3].
 */

public class CountIncreasingTriplets {
    public int solve(ArrayList<Integer> A) {
        int ans=0, l, r;
        for(int j=1; j<A.size()-1; j++){
            l=0; r=0;
            for(int i=0 ; i<=j; i++){
                if(A.get(j)> A.get(i)){ // j index should be greater than i index
                    l++;
                }
            }

            for(int k= j+1; k< A.size() ;k++){
                if(A.get(j)<A.get(k)){ //k index should be greater than j index element
                    r++;
                }
            }

            ans = ans + l*r;
        }
        return ans;
    }

    public static void main(String[] args) {
        Integer[] A = {1, 2, 4, 3};

        System.out.println(new CountIncreasingTriplets().solve(new ArrayList<>(Arrays.asList(A))));
    }
}
