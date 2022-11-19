package src.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        for(Integer b: B){
            ArrayList<Integer> copy = ( ArrayList<Integer>)A.clone();
            int c= b % copy.size();
            System.out.println(b +"%"+copy.size() + " c" +c);
            swap(copy, 0, c-1);
            swap(copy, c, A.size()-1);
            swap(copy, 0, A.size()-1);

            output.add(copy);
        }
        return output;
    }

    private ArrayList<Integer> swap(ArrayList<Integer> input , int start , int end  ){

        while(start< end ){
            int temp = input.get(start);
            input.set(start,input.get(end)) ;
            input.set(end , temp);
            start++; end--;
        }
        return input;

    }

    public static void main(String[] args) {
        Integer[] A = {1, 2, 3, 4, 5};
        Integer[] B = {2,3};
        System.out.println(new RotateArray().solve(new ArrayList<>(Arrays.asList(A)), new ArrayList<>(Arrays.asList(B))));
    }
}

