package src.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Problem Description
 * Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
 * Problem Constraints
 * 1<= N <= 1000
 * 1<= A[i][j] <= 1e9
 * Input Format
 * Only argument is a 2D array A of size N * N.
 * Output Format
 * Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
 * The vacant spaces in the grid should be assigned to 0.
 * Example Input
 * Input 1:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Input 2:
 * 1 2
 * 3 4
 * Example Output
 * Output 1:
 * 1 0 0
 * 2 4 0
 * 3 5 7
 * 6 8 0
 * 9 0 0
 * Output 2:
 * 1 0
 * 2 3
 * 4 0
 * Example Explanation
 * For input 1:
 * The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
 * The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
 * The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
 * The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
 * The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the row as [9, 0, 0].
 * For input 2:
 * The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
 * The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
 * The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces shoud be filled with 0 making the row as [3, 0, 0].
 * */
public class AntiDiagonals {

    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        int row;
        int col;
        for(int j=0; j< A.size(); j++){
            row = 0 ;col = j;
            ArrayList<Integer> antiDiarow = new ArrayList<>();
            while(row<A.size() && col >=0) {
                antiDiarow.add(A.get(row).get(col));
                col--;row++ ;
            }
            while(antiDiarow.size()< A.size()){
                antiDiarow.add(0);
            }
            output.add(antiDiarow);
        }
        for(int i = 1; i < A.size(); i++){
            row = i;
            col = A.size()-1;
                ArrayList<Integer> antiDiarow = new ArrayList<>();
                while(row<A.size() && col >=0) {
                    antiDiarow.add(A.get(row).get(col));
                    col--;row++ ;
                }
                while(antiDiarow.size()< A.size()){
                    antiDiarow.add(0);
                }
                output.add(antiDiarow);




        }

        return output;
    }


    /*
* 1 2 3
4 5 6
7 8 9
* */
    public static void main(String[] args) {
        Integer[] A =  {1,2,3};
        Integer[] B =  {4,5,6};
        Integer[] C =  {7,8,9};
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(A)));
        input.add(new ArrayList<>(Arrays.asList(B)));
        input.add(new ArrayList<>(Arrays.asList(C)));
        System.out.println(new AntiDiagonals().diagonal(input));
    }
}
