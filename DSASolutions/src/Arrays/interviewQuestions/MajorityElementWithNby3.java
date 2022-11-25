package src.Arrays.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
 * If so, return the integer. If not, return -1.
 * <p>
 * If there are multiple solutions, return any one.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 7*105
 * 1 <= A[i] <= 109
 * <p>
 * <p>
 * Input Format
 * The only argument is an integer array A.
 * <p>
 * <p>
 * Output Format
 * Return an integer.
 * <p>
 * <p>
 * Example Input
 * [1 2 3 1 1]
 * <p>
 * <p>
 * Example Output
 * 1
 * <p>
 * <p>
 * Example Explanation
 * 1 occurs 3 times which is more than 5/3 times.
 */
public class MajorityElementWithNby3 {
    //    public int repeatedNumber(final List<Integer> a) {
//        int elem = a.get(0);
//        int output = -1;
//        int frequency =1; // for any element frequency is 1
//        // Find the majority elment first using frequency of the element
//        for(int i=1; i< a.size() ; i++){
//
//            if(frequency == 0) { // if frequency is zero reset to new index element
//                elem = a.get(i);
//
//            }
//
//            if(elem == a.get(i)){
//                frequency++; // increase frequency if the element matches index elements
//            }else {
//                frequency--; // decrease frequency
//            }
//
//        }
//        frequency = 0; //reset frequency to check for element
//        for(Integer num : a){
//            if(elem == num) frequency++;
//            System.out.println(elem);
//        }
//
//        if(frequency > (a.size()/3)){ // if frequency is more thean half length return element.
//            output = elem;
//        }
//
//        return output;
    public int repeatedNumber(final List<Integer> a) {
        int elem1 = -1;
        int elem2 = -1;
        int output = -1;
        int frequency1 = 0;
        int frequency2 = 0; // for any element frequency is 1
        // Find the majority elment first using frequency of the element
        for (int i = 0; i < a.size(); i++) {
            if (frequency1 == 0 && elem2 != a.get(i)) { // if frequency is zero reset to new index element
                elem1 = a.get(i);
                frequency1++;
            } else if (elem1 == a.get(i)) {
                frequency1++;
            } else {
                frequency1--;
            }
            if (frequency2 == 0 && elem1 != a.get(i)) { // if frequency is zero reset to new index element
                elem2 = a.get(i);
                frequency2++;
            } else if (elem2 == a.get(i)) {
                frequency2++;
            } else {
                frequency2--;
            }
        }
        frequency1 = 0;
        frequency2 = 0; //reset frequency to check for element
        for (Integer num : a) {
            if (elem2 == num) frequency2++;
            else if (elem1 == num) frequency1++;
        }

        if (frequency1 > (a.size() / 3)) { // if frequency is more thean half length return element.
            output = elem1;
        } else if (frequency2 > (a.size() / 3))
            output = elem2;
        return output;


}

    public static void main(String[] args) {
        Integer[] A = {1};
        System.out.println(new MajorityElementWithNby3().repeatedNumber((List<Integer>) Arrays.asList(A)));
    }
}
