package src.Arrays.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubArrayEqualToZero {

//    public int solve(ArrayList<Integer> A) {
//        ArrayList<Integer> pf = new ArrayList<>();
//        Set<Integer> distinct = new HashSet<>();
//            pf.add(0, A.get(0));
//            for (int i = 1; i < A.size(); i++) {
//                pf.add(i, pf.get(i - 1) + A.get(i));
//            }
//
//            for (Integer value : pf) {
//                if(value == 0 ){
//                    return 1;
//                }
//                distinct.add(value);
//            }
//        return pf.size() != distinct.size() ? 1 : 0;;
//
//    }

    public int solve(ArrayList<Integer> A) {
        ArrayList<Long> pf = new ArrayList<>();
        Set<Long> distinct = new HashSet<>();
        pf.add(0, (long)A.get(0));
        for (int i = 1; i < A.size(); i++) {
            pf.add(i, (long)(pf.get(i - 1) + new Long(A.get(i)) ));
        }

        for (Long value : pf) {
            if(value == 0 ){
                return 1;
            }
            distinct.add(value);
        }
        return pf.size() != distinct.size() ? 1 : 0;

    }
    public static void main(String[] args) {
        Integer[] arr = {-1,1};

        System.out.println(new SubArrayEqualToZero().solve(new ArrayList<Integer>(Arrays.asList(arr))));
    }
}
