package src.Arrays.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Q1. Frequency of element query
 * Unsolved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given an array A. You have some queries given by the array B.
 * <p>
 * For the i-th query, find the frequency of B[i] in the array A.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 105
 * <p>
 * 1 <= |B| <= 105
 * <p>
 * 1 <= A[i] <= 105
 * <p>
 * 1 <= B[i] <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument A is an array of integers.
 * <p>
 * Second argument B is an array of integers denoting the queries.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an array of integers answering each of the queries.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 2, 1, 1]
 * B = [1, 2]
 * Input 2:
 * A = [2, 5, 9, 2, 8]
 * B = [3, 2]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * [3, 1]
 * Output 2:
 * [0, 2]
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * The frequency of 1 in the array A is 3.
 * The frequency of 2 in the array A is 1.
 * For Input 2:
 * The frequency of 3 in the array A is 0.
 * The frequency of 2 in the array A is 2.
 */
public class Frequency {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> outPut = new ArrayList<>();
        Map<Integer, Long> frequencyMap = A.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        for (Integer b : B) {
            int value = frequencyMap.containsKey(b)? frequencyMap.get(b).intValue() : 0;
            outPut.add(value);
        }
        return outPut;
    }

    public static void main(String[] args) {
        Integer[] a = { 6, 3, 3, 6, 7, 8, 7, 3, 7};
        Integer[] b = {10, 9, 8};
        System.out.println(new Frequency().solve(new ArrayList<Integer>(Arrays.asList(a)), new ArrayList<>(Arrays.asList(b))));
    }
}
