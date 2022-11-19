package src.Arrays.binary;

public class ConsecutiveOnes {
    public int solve(String A) {

        int count =0;

        for(int i=0; i < A.length(); i++) {

            if(A.charAt(i) == '1'){
                count++;
            }


        }

        if(count == A.length()){
            return A.length();
        }
        if(count == 0 ){
            return 0;
        }
        // normal case
        int m_ans =0;

        for( int k=0; k< A.length(); k++){
            if(A.charAt(k) == '0'){
                int l=0, r=0;
                int mycount =0;
                for(int j=k-1; j>= 0; j--){
                    if(A.charAt(j) == '0') break;
                    l++;
                }
                for(int p=k+1; p< A.length(); p++){
                    if(A.charAt(p) == '0') break;
                    r++;
                }
                if(count > l+r) {mycount = l+r+1;}else {mycount = l+r;}
                if(mycount > m_ans){
                    m_ans = mycount;
                }

            }
        }
        return m_ans;

    }
    public static void main(String[] args) {
        System.out.println(new ConsecutiveOnes().solve("00000011111111"));
    }
}
