package src.bitmaupulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class ConsecutiveOness {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());
            String number ="";
            while(n > 0){
                number += n%2;
                n = n/2;
            }
            int count = 0;
            int prev =0;
            for(int i=number.length()-1; i>=0; i--){
                if(number.charAt(i)=='0') {
                    prev = Math.max(prev,count);;
                    count = 0;
                }else
                    count++;
              }
            count = Math.max(prev,count);
            System.out.println(count);
            bufferedReader.close();
        }

}
