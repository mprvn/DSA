public class IsPrime {
    public int solve(Long A) {
         if(A > 1)
             return countFactors(A) > 2 ? 0 : 1;
        return 0;
    }

    int countFactors(Long A){
        int count = 0;
        for(int i = 1; i<= Math.sqrt(A) ; i++ ){
            if(A%i == 0) {
                count = (i== A/i) ? count + 1 : count + 2;
            }
        }
        System.out.println(count);
        return count;
    }
 public static void main(String[] args){
        IsPrime prime = new IsPrime();
       System.out.println(prime.solve(2L));
    }
}
