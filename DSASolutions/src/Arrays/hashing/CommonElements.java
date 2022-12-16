package src.Arrays.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Q2. Common Elements
 * Unsolved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.
 *
 * NOTE:
 *
 * Each element in the result should appear as many times as it appears in both arrays.
 * The result can be in any order.
 *
 *
 * Problem Constraints
 * 1 <= N, M <= 105
 *
 * 1 <= A[i] <= 109
 *
 *
 *
 * Input Format
 * First argument is an integer array A of size N.
 *
 * Second argument is an integer array B of size M.
 *
 *
 *
 * Output Format
 * Return an integer array denoting the common elements.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 2, 2, 1]
 *  B = [2, 3, 1, 2]
 * Input 2:
 *
 *  A = [2, 1, 4, 10]
 *  B = [3, 6, 2, 10, 10]
 *
 *
 * Example Output
 * Output 1:
 *
 *  [1, 2, 2]
 * Output 2:
 *
 *  [2, 10]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
 * Explantion 2:
 *
 *  Elements (2, 10) appears in both the array.
 */
public class CommonElements {

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> elementMap = new HashMap<>();


        for(Integer a: A){
            if(elementMap.containsKey(a))
                elementMap.put(a, elementMap.get(a)+1);
            else
                elementMap.put(a, 1);
        }

        for(Integer b : B){
            if(elementMap.containsKey(b) && elementMap.get(b)>0){
                ans.add(b);
                elementMap.put(b, elementMap.get(b)-1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Integer[] a = { 2, 1, 4, 10};
        Integer[] b = {13, 6, 2, 10, 10};
        System.out.println(new CommonElements().solve(new ArrayList<Integer>(Arrays.asList(a)), new ArrayList<>(Arrays.asList(b))));

    }
}
