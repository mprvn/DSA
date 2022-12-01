package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Virtuas {

    public static void main(String[] args) {
        List<Integer> s
                = Arrays.asList(5, 13, 4,
                21, 13,13,13, 27,
                2, 59, 59, 34);
        Map<Integer , Integer> map = new
                HashMap<>();

         for(Integer value: s ){
             if(map.containsKey(value)){
                 int count = map.get(value);
                map.put(value, count+1);
             }
             else{
                 map.put(value, 1);
             }
         }
         map.entrySet().stream().filter(x-> (x.getValue() > 1)).forEach(System.out::println);
//       HashMap<Integer, Integer> map =  s.stream().collect(Collectors.groupingBy(x, Collectors.toMap()));
//        map.entrySet().stream().filter(x -> x.value() >1).forEach( x -> System.out.println(x));
    }
}
