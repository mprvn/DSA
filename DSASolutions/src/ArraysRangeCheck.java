import java.util.ArrayList;
import java.util.Arrays;

public class ArraysRangeCheck {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> output = new ArrayList<>();
        ArrayList<Long> presum = new ArrayList<>();
        presum.add( 0,new Long(A.get(0)));
        for(int i=1; i< A.size(); i++){
            presum.add(i,presum.get(i-1)+ new Long(A.get(i)));
        }
        for(ArrayList<Integer> b: B){
            int start = b.get(0)-1;
            int end = b.get(1)-1;
            long sum;
            if( b.get(0)-2 >= 0){
                sum = presum.get(end)- presum.get(start-1);
                System.out.println(" presum.get(end)- presum.get(start) "+ presum.get(end) +"-"+ presum.get(start)+ "="+ sum);
                output.add( sum);
            }else{
                output.add(presum.get(end));
            }
        }

        return output;
    }
/**
 *  [7, 10]
 *   [3, 10]
 *   [3, 5]
 *   [1, 10]
 * */
    public static void main(String[] args) {
        Integer[] A= {7, 3, 1, 5, 5, 5, 1, 2, 4, 5};
        Integer[] b = {7, 10};
        Integer[] c = {3,10};
        Integer[] e = {3, 5};
        Integer[] f = {1,10};

        ArrayList<ArrayList<Integer>> nested = new ArrayList<>();
        nested.add(new ArrayList<>(Arrays.asList(b)));
        nested.add(new ArrayList<>(Arrays.asList(c)));
        nested.add(new ArrayList<>(Arrays.asList(e)));
        nested.add(new ArrayList<>(Arrays.asList(f)));
        System.out.println(new ArraysRangeCheck().rangeSum(new ArrayList<>(Arrays.asList(A)), nested));
    }

}
