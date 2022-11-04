import java.util.ArrayList;
import java.util.Arrays;

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
 * 1 <= N, M <= 105
 * 1 <= A[i] <= 109
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
 *
 * */
public class ArraysFindEvenNumbersInRange {

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        int[] arr = {1,0};

        ArrayList<Integer> presum = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        presum.add(0, arr[A.get(0) % 2]);
        for(int i=1; i< A.size(); i++){
            presum.add(i, presum.get(i-1) + arr[A.get(i) % 2 ]) ;
        }

        for(ArrayList<Integer> b: B){
            if(b.get(0) == 0)
                output.add(presum.get(b.get(1)));
            else
                output.add(presum.get(b.get(1)) - presum.get(b.get(1)-1));
        }

        return output;
    }

    public static void main(String[] args) {
//        Integer[] A= {3};
//        Integer[] b = {0, 0};
//        Integer[] c = {0,0};
//        ArrayList<ArrayList<Integer>> nested = new ArrayList<>();
//        nested.add(new ArrayList<>(Arrays.asList(b)));
//        nested.add(new ArrayList<>(Arrays.asList(c)));
//        nested.add(new ArrayList<>(Arrays.asList(b)));
//        nested.add(new ArrayList<>(Arrays.asList(c)));
//        nested.add(new ArrayList<>(Arrays.asList(b)));
//        nested.add(new ArrayList<>(Arrays.asList(c)));
//        nested.add(new ArrayList<>(Arrays.asList(c)));
//        System.out.println(new ArraysFindEvenNumbersInRange().solve(new ArrayList<>(Arrays.asList(A)), nested));
        //output : [0,0,0,0,0,0]
/*
 * [2, 6]
 *   [4, 7]
 *   [6, 7]
 * */
        Integer[] A= {6, 3, 3, 6, 7, 8, 7, 3, 7 };
        Integer[] b = {2, 6};
        Integer[] c = {4, 7};
        Integer[] d = {6, 7};
        ArrayList<ArrayList<Integer>> nested = new ArrayList<>();
        nested.add(new ArrayList<>(Arrays.asList(b)));
        nested.add(new ArrayList<>(Arrays.asList(c)));
        nested.add(new ArrayList<>(Arrays.asList(d)));
        System.out.println(new ArraysFindEvenNumbersInRange().solve(new ArrayList<>(Arrays.asList(A)), nested));

    }
}
