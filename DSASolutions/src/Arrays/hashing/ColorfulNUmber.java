package src.Arrays.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ColorfulNUmber {
    public int colorful(int A) {

        int len = String.valueOf(A).length()-1;
        ArrayList<Integer> arr = new ArrayList<>();
        while(A>0){
            arr.add( A%10);
            A = A/10;
        }
        HashSet<Integer> productSet = new HashSet<>();
        for(int i=0; i< arr.size(); i++){
            int product = 1;
            for(int j=i; j< arr.size(); j++){
                product = product * arr.get(j);
                if(productSet.contains(product)){
                    return 0;
                }else{
                    productSet.add(product);
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(new ColorfulNUmber().colorful(23));
    }
}
