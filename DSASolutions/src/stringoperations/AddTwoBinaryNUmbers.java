package src.stringoperations;

public class AddTwoBinaryNUmbers {

        public String addBinary(String A, String B) {

//            Long a = Long.parseLong(A.trim());
//            Long b = Long.parseLong(B.trim());
//
//            return A.length()>B.length()? ""+ (a^b): ""+(b^a);

            int len = 0, diff=0;
            len = A.length() > B.length() ? A.length(): B.length();
            diff = A.length() > B.length() ? len-B.length(): len-A.length();
            String appendZeros = "";

            while(diff >0){
                appendZeros += "0";
                diff--;
            }

            if(A.length()>B.length()) B = appendZeros+B;
            else  A = appendZeros+A;
            StringBuilder sb = new StringBuilder("");
            for(int i= len-1; i>=0; i--){
                int a = A.charAt(i) - '0';
                int b = B.charAt(i) - '0';

                sb.append(a^b);
            }
 return sb.toString();
        }

    public static void main(String[] args) {
        System.out.println(new AddTwoBinaryNUmbers().addBinary("1010110111001101101000", "1000011011000000111100110"));
    }


}
