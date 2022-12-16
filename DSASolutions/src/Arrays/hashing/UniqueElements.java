package src.Arrays.hashing;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueElements {

    public int solve(ArrayList<Integer> A) {

        Map<Integer, Integer> frequncy  = new HashMap<>();
        int count =0;
        for(Integer a : A){
            if(frequncy.containsKey(a)){
                frequncy.put(a, frequncy.get(a)+1);
            }else{
                frequncy.put(a, 1);
            }
        }
        for(Map.Entry entry :   frequncy.entrySet()){
            if((Integer) entry.getValue() == 1){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
//        Integer[] A = {13, 15, 13, 2, 9, 3, 10, 10, 20, 13};
//
//        System.out.println(new UniqueElements().solve(new ArrayList<>(Arrays.asList(A))));

//        String[] s ={"1","2","15", "-7", "300"};
//        Arrays.sort(s);
//        System.out.println(Arrays.toString(s));
    }

}
