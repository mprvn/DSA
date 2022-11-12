package src.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixTranspose2d {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> matrixOut = new ArrayList<>();
        if (!A.isEmpty()) {
            int N = A.get(0).size();
            for (int i = 0; i < N; i++) {
                ArrayList<Integer> col = new ArrayList<>();
                for (ArrayList<Integer> row : A) {
                    System.out.println(row);
                    System.out.println(row.get(i));
                    col.add(row.get(i));
                }
                matrixOut.add(col);
            }
        }

        return matrixOut;
    }

    public static void main(String[] args) {
        Integer[] A =  {1,2,3};
        Integer[] B =  {4,5,6};
        Integer[] C =  {7,8,9};
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(A)));
        input.add(new ArrayList<>(Arrays.asList(B)));
        input.add(new ArrayList<>(Arrays.asList(C)));
        System.out.println(new MatrixTranspose2d().solve(input));
    }
}
