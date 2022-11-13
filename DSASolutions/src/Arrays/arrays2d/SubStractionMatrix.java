package src.Arrays.arrays2d;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem Description
 * You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M). You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).
 * If A and B are two matrices of the same order (same dimensions). Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.
 * Problem Constraints
 * 1 <= N, M <= 103
 * -109 <= A[i][j], B[i][j] <= 109
 * **Input Format**
 * There are 2 lines in the input
 * Line 1 ( Corresponds to arg 1 ) : 2 D array. First 2 integers R, C are the number of rows and columns. Then R * C integers follow corresponding to the rowwise numbers in the 2D array.
 * Line 2 ( Corresponds to arg 2 ) : 2 D array. First 2 integers R, C are the number of rows and columns. Then R * C integers follow corresponding to the rowwise numbers in the 2D array.
 * Output Format
 * Return a 2D matrix denoting A - B.
 * Example Input
 * Input 1:
 * 3 3 1 2 3 4 5 6 7 8 9
 * 3 3 9 8 7 6 5 4 3 2 1
 * Input 2:
 * 1 2 1 1
 * 1 2 2
 * Example Output
 * Output 1:
 *  [[-8, -6, -4],
 *   [-2, 0, 2],
 *   [4, 6, 8]]
 * Output 2:
 *  [[-1, -2]]
 * Example Explanation
 * Explanation 1:
 *  image
 * Explanation 2:
 *  [[1, 1]] - [[2, 3]] = [[1 - 2, 1 - 3]] = [[-1, -2]]*/
public class SubStractionMatrix {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int row =  A.size();
        int col = A.get(0).size();

        for(int i=0 ; i < row; i++ ){
            for(int j=0 ; j < col; j++){
                A.get(i).set(j, A.get(i).get(j) -B.get(i).get(j));
            }
        }

        return A;
    }

    public static void main(String[] args) {
        Integer[] A =  {1,2,3};
        Integer[] B =  {4,5,6};
        Integer[] C =  {7,8,9};

        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(A)));
        input.add(new ArrayList<>(Arrays.asList(B)));
        input.add(new ArrayList<>(Arrays.asList(C)));

        Integer[] A1 =  {9,8,7};
        Integer[] B1 =  {6,5,4};
        Integer[] C1 =  {3,2,1};

        ArrayList<ArrayList<Integer>> input2 = new ArrayList<>();
        input2.add(new ArrayList<>(Arrays.asList(A1)));
        input2.add(new ArrayList<>(Arrays.asList(B1)));
        input2.add(new ArrayList<>(Arrays.asList(C1)));
        System.out.println(new SubStractionMatrix().solve(input, input2));
    }
}
