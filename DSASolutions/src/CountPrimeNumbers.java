public class CountPrimeNumbers{
    public int solve(int A) {

        if(A > 1) {
            int count  = 0;
            for (int i = 2; i <= A; i++) {

                if ((countFactors(i) <= 2)) {

                    count = count + 1;
                    System.out.println(countFactors(i) + " > 2" + (countFactors(i) <= 2 ) +" "+i+" "+ count);
                }
            }
           return count;
        }
        return 0;
    }

    int countFactors(int A){
        int count = 0;
        for(int i = 1; i<= Math.sqrt(A) ; i++ ){
            if(A%i == 0) {
                count = (i== A/i) ? count + 1 : count + 2;
            }
        }

        return count;
    }

//    public int solve(int A) {
//        if(A >1) {
//            int count = 0 ;
//            for(int i=1; i< A ; i++){
//                if(countFactors(i) <=2){
//                    System.out.println(countFactors(i) + " > 2" + (countFactors(i) <= 2 ) +" "+i+" "+ count);
//                    count = count + 1;
//                }
//            }
//            return count;
//        }
//        return 0;
//    }
//
//    int countFactors(int A) {
//        int count =0;
//        for(int i=1; i<= Math.sqrt(A); i++){
//            if(i % A == 0){
//                count = (i == A/i) ? count+1 : count + 2;
//            }
//        }
//        return count;
//    }
    public static void main(String[] args){
        CountPrimeNumbers prime = new CountPrimeNumbers();
        System.out.println(prime.solve(10));
    }
}
