public class DivideBy2Till1 {
   public int solve(int A) {
       int n = A;
       int count =1;
        do{ n = n/2;
               count = count + 1;
        }while(n == 1);
        return count;
   }

    public static void main(String[] args){
        System.out.println(new DivideBy2Till1().solve(8));
    }
}
