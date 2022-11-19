package src;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class InterviewLuxSoft {
  // lkhpot
    // lk
    // lh
    // lp
//    public static void main(String[] args) {
//         String test = "lkhpot";
//         String output = "";
//         for(int i=0; i< test.length(); i++){
//              output += test.charAt(i);
//             for(int j=i; j< test.length(); j++){
//                 System.out.println(output +test.charAt(j));
//             }
//             }
//
//    }

    public static void main(String[] args) {
       int[] arr1= {2,3,5,6,7};
       int[] arr2 = {7,8,9,10,11,12,14};
       int[] output = new int[arr1.length +arr2.length];
       int currIndex =0;
       int min = Integer.MAX_VALUE;
       int n= arr1.length+arr2.length;
        int i=0,j=0;
        int value =0;
       while(n > 0){

       }

//       for(int i=0; i< arr1.length; i++){
//           for(int j=0 ; j< arr2.length; j++) {
//               if((arr1[i] < arr2[j])){
//                       min = arr1[i];
//               }else {
//                       min = arr2[j];
//               }
//               output[currIndex++] = min;
//               break;
//           }
//       }

        Arrays.stream(output).forEach(x -> System.out.println(x));


    }
}
