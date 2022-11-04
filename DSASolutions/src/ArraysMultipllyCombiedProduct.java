import java.util.ArrayList;
import java.util.Arrays;

public class ArraysMultipllyCombiedProduct {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> leftProduct = new ArrayList<>();
        Integer[] rightProduct = new Integer[A.size()];
        ArrayList<Integer> output = new ArrayList<>();

        leftProduct.add(0, 1);
        rightProduct[A.size()-1] =1;

        for(int i=1; i< A.size(); i++){
            leftProduct.add(i, leftProduct.get(i-1)* A.get(i-1));
        }


        for(int j=A.size()-2 ; j>=0 ; j--){
            rightProduct[j] = rightProduct[j+1]* A.get(j+1);
        }

        for(int k=0; k< A.size();k++){
            output.add(k, leftProduct.get(k) * rightProduct[k]);
        }
        return output;
    }

    public static void main(String[] args) {
        Integer[] A = {1, 2, 3, 4, 5};
        System.out.println(new ArraysMultipllyCombiedProduct().solve(new ArrayList<>(Arrays.asList(A))));
    }
}
