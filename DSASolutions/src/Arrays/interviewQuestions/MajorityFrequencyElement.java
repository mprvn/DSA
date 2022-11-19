package src.Arrays.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
 * You may assume that the array is non-empty and the majority element always exists in the array.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 5*105
 * 1 <= num[i] <= 109
 *
 *
 * Input Format
 * Only argument is an integer array.
 *
 *
 * Output Format
 * Return an integer.
 *
 *
 * Example Input
 * [2, 1, 2]
 *
 *
 * Example Output
 * 2
 *
 *
 * Example Explanation
 * 2 occurs 2 times which is greater than 3/2.
 */
public class MajorityFrequencyElement {
    public int majorityElement(final List<Integer> A) {
        int elem = A.get(0);
        int output = 0;
        int frequency =1; // for any element frequency is 1
        // Find the majority elment first using frequency of the element
        for(int i=1; i< A.size() ; i++){

            if(frequency == 0) { // if frequency is zero reset to new index element
                elem = A.get(i);

            }

            if(elem == A.get(i)){
                frequency++; // increase frequency if the element matches index elements
            }else {
                frequency--; // decrease frequency
            }

        }
        frequency = 0; //reset frequency to check for element
        for(Integer a : A){
            if(elem ==a) frequency++;
        }

        if(frequency > (A.size()/2)){ // if frequency is more thean half length return element.
            output = elem;
        }

        return output;
    }

    public static void main(String[] args) {
        Integer[] a ={2, 1, 2};
        List<Integer> A = new ArrayList<>(Arrays.asList(a));
        System.out.println(new MajorityFrequencyElement().majorityElement(A));
    }
}
