package src.Arrays;

import java.util.Scanner;

// 4 currncy notes
// 500 , 50, 10, 1
// user input - 2546
public class TestNew {
    public static void main(String[] args) {
        int[] currencies = {500, 50, 10, 1};
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        int countOfCurrency = 1;
        int currency = 0;
       for(int i=0 ; i < currencies.length; i++){
           int temp =  currencies[i] ;

           countOfCurrency = 1;
           while(temp < n) {
               temp *=countOfCurrency;
               countOfCurrency++;
           }
           System.out.println(currencies[i] + " number "+ countOfCurrency);
       }
    }



}
