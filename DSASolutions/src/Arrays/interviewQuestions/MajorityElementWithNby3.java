package src.Arrays.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
 * If so, return the integer. If not, return -1.
 *
 * If there are multiple solutions, return any one.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 7*105
 * 1 <= A[i] <= 109
 *
 *
 * Input Format
 * The only argument is an integer array A.
 *
 *
 * Output Format
 * Return an integer.
 *
 *
 * Example Input
 * [1 2 3 1 1]
 *
 *
 * Example Output
 * 1
 *
 *
 * Example Explanation
 * 1 occurs 3 times which is more than 5/3 times.
 */
public class MajorityElementWithNby3 {
    public int repeatedNumber(final List<Integer> a) {
        int elem = a.get(0);
        int output = -1;
        int frequency =1; // for any element frequency is 1
        // Find the majority elment first using frequency of the element
        for(int i=1; i< a.size() ; i++){

            if(frequency == 0) { // if frequency is zero reset to new index element
                elem = a.get(i);

            }

            if(elem == a.get(i)){
                frequency++; // increase frequency if the element matches index elements
            }else {
                frequency--; // decrease frequency
            }

        }
        frequency = 0; //reset frequency to check for element
        for(Integer num : a){
            if(elem == num) frequency++;
        }

        if(frequency > (a.size()/3)){ // if frequency is more thean half length return element.
            output = elem;
        }

        return output;
    }

    public static void main(String[] args) {
        Integer[] A = {1, 2, 3, 1 ,1};
        System.out.println(new MajorityElementWithNby3().repeatedNumber((List<Integer>)Arrays.asList(A)));
    }
}
