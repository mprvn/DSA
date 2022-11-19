package src.Arrays.arrays2d;

import java.util.ArrayList;
import java.util.Arrays;

public class SpiralMatrix {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int elem = 1;
        ArrayList<ArrayList<Integer>>  out = new ArrayList<>();
        int row = 0;
        int col = 0;
        int loop = 0;
        int n = A;
        int k = 0;
        for(int i=0;i<n;i++){
            out.add(new ArrayList<Integer>());
            for(int j=0;j<A;j++){ out.get(i).add(0); }
        }

        if(A == 1){
            out.get(0).set(0, 1);
        }
        while(n>1){

            for(k=1;k<n;k++){
                out.get(row).set(col,elem);
                elem++;
                col++;

            }
            for(k=1;k<n;k++){
                out.get(row).set(col,elem);
                elem++;
                row++;
            }

            for(k=1;k<n;k++){
                out.get(row).set(col,elem);
                elem++;
                col--;
            }
            for(k=1;k<n;k++){
                out.get(row).set(col,elem);
                elem++ ;
                row--;
            }
            n-=2;
            row++;
            col++;
        }
      if(n == 1) {
          out.get(row).set(col, elem);
      }
        return out;
    }

    public static void main(String[] args) {
      //  System.out.println(new SpiralMatrix().generateMatrix(80));
        System.out.println(new SpiralMatrix().generateMatrix(21));
    }
}
