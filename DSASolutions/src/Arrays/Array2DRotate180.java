package src.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array2DRotate180 {


    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        //transpose
        for(int i = 1; i < A.size(); i++) {
            int j = 0;
            while(j != i) {
                int swap = A.get(i).get(j);
                A.get(i).set(j, A.get(j).get(i));
                A.get(j).set(i, swap);
                j++;
            }
        }
        for (ArrayList<Integer> integers : A) {
            Collections.reverse(integers);
        }
      return  A;
    }
    public static void main(String[] args) {
        Integer[] A =  {1,2,3};
        Integer[] B =  {4,5,6};
        Integer[] C =  {7,8,9};
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(A)));
        input.add(new ArrayList<>(Arrays.asList(B)));
        input.add(new ArrayList<>(Arrays.asList(C)));
        System.out.println(new Array2DRotate180().solve(input));
    }
}
