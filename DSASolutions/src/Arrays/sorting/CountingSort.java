package src.Arrays.sorting;
import java.util.*;
public class CountingSort {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int max = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(Integer a: A){
            if(frequencyMap.containsKey(a)){
                int temp = frequencyMap.get(a);
                frequencyMap.put(a, temp+1);
            }else {
                frequencyMap.put(a, 1);
            }
            if(a> max){
                max=a;

            }
        }

        for(int i=1; i <=max; i++){
            if(frequencyMap.containsKey(i)) {
                int loop = frequencyMap.get(i);
                for(int j=0; j< loop; j++){
                    ans.add(i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Integer[] arr = { 6, 3, 3, 6, 7, 8, 7, 3, 7};
        System.out.println(new CountingSort().solve(new ArrayList<>(Arrays.asList(arr))));
    }
}
