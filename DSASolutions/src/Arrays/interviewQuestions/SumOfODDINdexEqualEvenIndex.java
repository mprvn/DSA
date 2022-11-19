package src.Arrays.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem Description
 * Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
 *
 *
 *
 * Problem Constraints
 * 1 <= n <= 105
 * -105 <= A[i] <= 105
 *
 *
 * Input Format
 * First argument contains an array A of integers of size N
 *
 *
 * Output Format
 * Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
 *
 *
 *
 * Example Input
 * Input 1:
 * A=[2, 1, 6, 4]
 * Input 2:
 *
 * A=[1, 1, 1]
 *
 *
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 *
 * 3
 *
 *
 * Example Explanation
 * Explanation 1:
 * Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1].
 * Therefore, the required output is 1.
 * Explanation 2:
 *
 * Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
 * Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
 * Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
 * Therefore, the required output is 3.
 */
public class SumOfODDINdexEqualEvenIndex {

    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> pfeven = new ArrayList<>();
        int count =0;
        pfeven.add(0,A.get(0));
        for(int i=1; i< A.size(); i++){
            if(i%2 == 1){
                pfeven.add(i,pfeven.get(i-1));
            } else {
                pfeven.add(i, pfeven.get(i-1)+A.get(i));
            }
        }

        ArrayList<Integer> pfodd = new ArrayList<>();
        pfodd.add(0,0);
        for(int i=1; i< A.size(); i++){
            if(i%2 == 1){
                pfodd.add(i,(pfodd.get(i-1)+A.get(i)));
            } else {
                pfodd.add(i, pfodd.get(i-1));
            }
        }
        int sumOdd = 0;
        int sumEven = 0 ;
        for(int j=0; j< A.size(); j++){
            if(j!=0){
                sumEven = pfeven.get(j-1)+ pfodd.get(A.size()-1)-pfodd.get(j);
                sumOdd  = pfodd.get(j-1)+ pfeven.get(A.size()-1)- pfeven.get(j);
            }else{
                sumEven = pfodd.get(A.size()-1) - pfodd.get(j);
                sumOdd = pfeven.get(A.size()-1) - pfeven.get(j);
            }
            if(sumEven == sumOdd){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] A = {2, 1, 6, 4};

        System.out.println(new SumOfODDINdexEqualEvenIndex().solve(new ArrayList<>(Arrays.asList(A))));
    }
}
