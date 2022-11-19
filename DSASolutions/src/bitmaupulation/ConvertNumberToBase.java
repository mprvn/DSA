package src.bitmaupulation;

public class ConvertNumberToBase {

    public int DecimalToAnyBase(int A, int B) {
        int number = A;
        int output  = 0;
        int i=0;
         String a = ""+ A;
         if(a.length() ==1){
             
         }
        while(number > 0){
            output = output + (int)((number%10)* Math.pow(B,i++));
            number = number/10;
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(new ConvertNumberToBase().DecimalToAnyBase(6,4));
    }
}
