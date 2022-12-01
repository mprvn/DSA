package src.Arrays;

import java.util.Arrays;
import java.util.List;

public class LargestString {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        String[] stringArray = A.stream().map((Integer x) -> String.valueOf(x)).toArray(String[]::new);
        //comparing s1+s2 & s2+s1 using comparator and sorting the array
        Arrays.sort(stringArray, (String s1, String s2) -> (s2+s1).compareTo(s1+s2));

        return Arrays.stream(stringArray).reduce((x,y) -> x.equals("0") ? y : x+y).get();
    }

    public static void main(String[] args) {

    }
}
