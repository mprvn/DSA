package src.Arrays.arrays2d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MatrixRowColZero {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int row = A.size();
        int col  = A.get(0).size();
        ArrayList<Integer> rowtozero = new ArrayList<>();
        ArrayList<Integer> coltozero = new ArrayList<>();

        for(int i=0; i< row; i++){
            for(int j=0 ; j< col; j++){
                System.out.println(A.get(i).get(j));
                if(A.get(i).get(j) == 0){
                    rowtozero.add(i);
                    coltozero.add(j);
                }
            }
        }
        System.out.println(rowtozero);
        System.out.println(coltozero);
        if(rowtozero.size() > 0 && coltozero.size() > 0){
            for(Integer rowIndex : rowtozero){
                Collections.fill(A.get(rowIndex), 0);
            }

            for(ArrayList<Integer> rows : A){
                for(int i=0; i< rows.size(); i++){
                    if(coltozero.contains(i)){
                        rows.set(i,0);
                    }
                }
            }

        }
        return A;

    }
/**
 * A :
 * [
 *   [97, 18, 55, 1, 50, 17, 16, 0, 22, 14]
 *   [58, 14, 75, 54, 11, 23, 54, 95, 33, 23]
 *   [73, 11, 2, 80, 6, 43, 67, 82, 73, 4]
 *   [61, 22, 23, 68, 23, 73, 85, 91, 25, 7]
 *   [6, 83, 22, 81, 89, 85, 56, 43, 32, 89]
 *   [0, 6, 1, 69, 86, 7, 64, 5, 90, 37]
 *   [10, 3, 11, 33, 71, 86, 6, 56, 78, 31]
 *   [16, 36, 66, 90, 17, 55, 27, 26, 99, 59]
 *   [67, 18, 65, 68, 87, 3, 28, 52, 9, 70]
 *   [41, 19, 73, 5, 52, 96, 91, 10, 52, 21]
 * ]
 * */
    public static void main(String[] args) {
        Integer[] A =  {97, 18, 55, 1, 50, 17, 16, 0, 22, 14};
        Integer[] B =  {58, 14, 75, 54, 11, 23, 54, 95, 33, 23};
        Integer[] C =  {73, 11, 2, 80, 6, 43, 67, 82, 73, 4};
        Integer[] D =  {61, 22, 23, 68, 23, 73, 85, 91, 25, 7};
        Integer[] E =  {0, 6, 1, 69, 86, 7, 64, 5, 90, 37};
        Integer[] F =  {10, 3, 11, 33, 71, 86, 6, 56, 78, 31};
        Integer[] G =  {16, 36, 66, 90, 17, 55, 27, 26, 99, 59};
        Integer[] H =  {67, 18, 65, 68, 87, 3, 28, 52, 9, 70};
        Integer[] I =  {41, 19, 73, 5, 52, 96, 91, 10, 52, 21};
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(A)));
        input.add(new ArrayList<>(Arrays.asList(B)));
        input.add(new ArrayList<>(Arrays.asList(C)));
        input.add(new ArrayList<>(Arrays.asList(D)));
        input.add(new ArrayList<>(Arrays.asList(E)));
        input.add(new ArrayList<>(Arrays.asList(F)));
        input.add(new ArrayList<>(Arrays.asList(G)));
        input.add(new ArrayList<>(Arrays.asList(H)));
        input.add(new ArrayList<>(Arrays.asList(I)));
//        Integer[] A1 =  {1,2,3};
//        Integer[] B1 =  {4,5,6};
//        Integer[] C1 =  {7,8,9};
//
//        ArrayList<ArrayList<Integer>> input2 = new ArrayList<>();
//        input2.add(new ArrayList<>(Arrays.asList(A1)));
//        input2.add(new ArrayList<>(Arrays.asList(B1)));
//        input2.add(new ArrayList<>(Arrays.asList(C1)));
        System.out.println(new MatrixRowColZero().solve(input));
    }
}
