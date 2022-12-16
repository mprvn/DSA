package src.Arrays;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Q2. Christmas Trees
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar, where p < q < r.
 * The cost of these trees is Bp + Bq + Br.
 *
 * You are to choose 3 trees such that their total cost is minimum. Return that cost.
 *
 * If it is not possible to choose 3 such trees return -1.
 *
 *
 *
 * Problem Constraints
 * 1 <= A[i], B[i] <= 109
 * 3 <= size(A) = size(B) <= 3000
 *
 *
 *
 * Input Format
 * First argument is an integer array A.
 * Second argument is an integer array B.
 *
 *
 *
 * Output Format
 * Return an integer denoting the minimum cost of choosing 3 trees whose heights are strictly in increasing order, if not possible, -1.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 3, 5]
 *  B = [1, 2, 3]
 * Input 2:
 *
 *  A = [1, 6, 4, 2, 6, 9]
 *  B = [2, 5, 7, 3, 2, 7]
 *
 *
 * Example Output
 * Output 1:
 *
 *  6
 * Output 2:
 *
 *  7
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  We can choose the trees with indices 1, 2 and 3, and the cost is 1 + 2 + 3 = 6.
 * Explanation 2:
 *
 *  We can choose the trees with indices 1, 4 and 5, and the cost is 2 + 3 + 2 = 7.
 *  This is the minimum cost that we can get.
 */
public class ChristmasTreeMinPrice {

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        int N = A.size();
        int minSum = Integer.MAX_VALUE;


        for (int i = 0; i < N - 2; i++) {
            if (B.get(i) < minSum) {

                for (int j = i + 1; j < N - 1; j++) {
                    if (A.get(i) < A.get(j) && B.get(i) + B.get(j) < minSum) {
                        for (int k = j + 1; k < N; k++) {
                            if (A.get(j) < A.get(k)) {
                                int sum = B.get(i) + B.get(j) + B.get(k);
                                minSum = Math.min(minSum, sum);
                            }
                        }
                    }
                }
            }
        }

        return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
    }

    public static void main(String[] args) {
       Integer[] A = {1, 6, 4, 2, 6, 9};
       Integer[] B = {2, 5, 7, 3, 2, 7};

        System.out.println(new ChristmasTreeMinPrice().solve(new ArrayList<>(Arrays.asList(A)), new ArrayList<>(Arrays.asList(B))));
    }


//    public class Solution {
//        public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
//            int N = A.size();
//            int minSum = Integer.MAX_VALUE;
//
//            //Constraints are all the values of A and B are positive
//            for (int i = 0; i < N - 2; i++) {
//                if (B.get(i) < minSum) { //B[i] > minSum Then we wont ever find B[i] + B[j] + B[k] < minSum
//
//                    for (int j = i + 1; j < N - 1; j++) {
//                        if (A.get(i) < A.get(j) && B.get(i) + B.get(j) < minSum) { //B[i] + B[j] > minSum Then we wont ever find B[i] + B[j] + B[k] < minSum
//
//                            for (int k = j + 1; k < N; k++) {
//                                if (A.get(j) < A.get(k)) {
//                                    int sum = B.get(i) + B.get(j) + B.get(k);
//                                    minSum = Math.min(minSum, sum);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//
//            return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
//        }
//    }
}
