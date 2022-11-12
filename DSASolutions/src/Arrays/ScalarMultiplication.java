package src.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalarMultiplication {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        for(ArrayList<Integer> row : A){
            row.replaceAll(integer -> integer * B);
        }
        return A;
    }
    public static void main(String[] args) {
//        Integer[] A =  {1,2,3};
//        Integer[] B =  {4,5,6};
//        Integer[] C =  {7,8,9};
//
//        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
//        input.add(new ArrayList<>(Arrays.asList(A)));
//        input.add(new ArrayList<>(Arrays.asList(B)));
//        input.add(new ArrayList<>(Arrays.asList(C)));
//        System.out.println(new ScalarMultiplication().solve(input, 2));

        Integer[] A =  {7};
        Integer[] B =  { 10};

        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(A)));
        input.add(new ArrayList<>(Arrays.asList(B)));
        System.out.println(new ScalarMultiplication().solve(input, 4));
    }
}
