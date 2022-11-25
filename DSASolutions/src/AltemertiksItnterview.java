package src;

import java.util.ArrayList;
import java.util.Arrays;

public class AltemertiksItnterview {

    public static void main(String[] args) {
        int[] startime = {5,8,10,2,0};
        int[] endtime =  {9,10,11,5,6};
        int[] output = new int[startime.length];
        int start = startime[0];
        int end  =  endtime[0];
        int prev = 0;
        int addTime = 0;
        output[0] = 0;
        for(int i=1; i< startime.length; i++ ) {
            if (end >= 11 || end >= 12){
                addTime = 12;
              }
           if((addTime + startime[i])  >= end  && startime[i] != 0 ){
               output[i] = i;
           } else{
               output[i] = -1;
           }
            start = startime[i];
            end = endtime[i];
        }

          for(int j=0; j< output.length ; j++){
              if(output[j] !=-1){
                  System.out.println( "stattime :: "+ startime[j] + " endtime :: "+ endtime[j] );
              }
          }
        //System.out.println(Arrays.toString(output));
    }
}
