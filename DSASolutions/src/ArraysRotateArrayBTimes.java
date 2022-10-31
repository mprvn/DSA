import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem Description
 * Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <=109
 * 1 <= B <= 109
 *
 *
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is the integer B.
 *
 *
 * Output Format
 * Return the array A after rotating it B times to the right
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [1, 2, 3, 4]
 * B = 2
 * Input 2:
 *
 * A = [2, 5, 6]
 * B = 1
 *
 *
 * Example Output
 * Output 1:
 *
 * [3, 4, 1, 2]
 * Output 2:
 *
 * [6, 2, 5]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]
 * Explanation 2:
 *
 * Rotate towards the right 1 time - [2, 5, 6] => [6, 2, 5]
 * */
public class ArraysRotateArrayBTimes {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        if(B > A.size() ) {
            B = B % A.size();
        }
        A = reverse(A, 0 , A.size()-1 );
        A = reverse(A, 0, B - 1);
        A = reverse(A, B, A.size() - 1);

        return A;

    }
    public ArrayList<Integer> reverse(ArrayList<Integer> A, int B, int C) {

        int s=B;
        int e=C;
        int temp;
        while(s < e) {
            temp = A.get(s);
            A.set(s, A.get(e));
            A.set(e, temp);
            s++;
            e--;
        }
        return A;
    }

    public static void main(String[] args) {
        Integer[] A = {1, 2, 3, 4 };

        System.out.println(new ArraysRotateArrayBTimes().solve(new ArrayList<>(Arrays.asList(A)),2));
          Integer[] B = {2, 5, 6 };

        System.out.println(new ArraysRotateArrayBTimes().solve(new ArrayList<>(Arrays.asList(B)),1));
        System.out.println();
    }
}
