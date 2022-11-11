package src.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagonals {

    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
        int row= 0;
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
        ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
        input.add(new ArrayList<>(Arrays.asList(A)));
        input.add(new ArrayList<>(Arrays.asList(B)));
        input.add(new ArrayList<>(Arrays.asList(C)));
        System.out.println(new AntiDiagonals().diagonal(input));
    }
}
