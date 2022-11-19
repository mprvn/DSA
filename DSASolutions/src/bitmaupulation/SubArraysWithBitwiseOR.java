package src.bitmaupulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubArraysWithBitwiseOR {

    public Long solve(int A, ArrayList<Integer> B) {
        long count =0;
        // in | or OR condition if you have 1 you will have output 1 . if you encounter 0 check if the next sub array index has 1 AND break if you find 1.
        for(int i=0; i<B.size(); i++){

            if(B.get(i) == 1){
                count += B.size()-i;
            }else {
                for(int j =i+1; j<B.size(); j++){
                    if(B.get(j) == 1){ //checking for ones in Subarray. break if you find one .
                        count+= B.size() -j;
                        break;
                    }
                }

            }

        }
        return count;


//        Set<Integer> ans  = new HashSet<>();
//        Set<Integer> cur = new HashSet<>();
//        cur.add(0);
//        for(Integer a: B){
//            Set<Integer> cur2 = new HashSet<>();
//            for(Integer b:cur){
//                cur2.add(a | b);
//            }
//            cur2.add(a);
//            cur = cur2;
//            ans.addAll(cur);
//        }
//        System.out.println(ans);
//        return (long)ans.size();

    }

    public static void main(String[] args) {
        Integer[] A  = {0, 1, 1, 0, 1 };

        System.out.println(new SubArraysWithBitwiseOR().solve(A.length, new ArrayList<>(Arrays.asList(A))));
    }
}
