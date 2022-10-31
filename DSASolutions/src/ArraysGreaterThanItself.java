import java.util.ArrayList;
import java.util.Arrays;
/**
 * Given an array A of N integers. Count the number of elements that have at least 1 elements greater than itself.
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 109
 *
 *
 * Input Format
 * First and only argument is an array of integers A.
 *
 *
 * Output Format
 * Return the count of elements.
 *
 *
 * Example Input
 * Input 1:
 * A = [3, 1, 2]
 * Input 2:
 * A = [5, 5, 3]
 *
 *
 * Example Output
 * Output 1:
 * 2
 * Output 2:
 * 1
 * */
public class ArraysGreaterThanItself {

    public int solve(ArrayList<Integer> A) {
        int max = 0;
        int count = 0;
        for(Integer a: A){
            if(a > max) {
                max = a;
                //count =  1 ;
            }
        }
        for(Integer a : A){
            if(max > a){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       Integer[] A =  {3, 1, 2};
       System.out.println(new ArraysGreaterThanItself().solve( new ArrayList<>(Arrays.asList(A))));
       Integer[] B =  {5, 5, 3};
       System.out.println(new ArraysGreaterThanItself().solve( new ArrayList<>(Arrays.asList(B))));


    }
}
