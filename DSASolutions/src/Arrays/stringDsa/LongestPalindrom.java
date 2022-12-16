package src.Arrays.stringDsa;


public class LongestPalindrom {
    String expand(String str, int low, int high)
    {
        while (low >= 0 && high < str.length() && (str.charAt(low) == str.charAt(high))) {
            low--; high++;
        }
        return str.substring(low + 1, high - low - 1);
    }

    String longestPalindromicSubstring(String str)
    {
        if (str.length() == 0) {
            return str;
        }

        String max_str = "", curr_str;

        int max_length = 0, curr_length;

        for (int i = 0; i < str.length(); i++)
        {

            curr_str = expand(str, i, i);
            curr_length = curr_str.length();

            if (curr_length > max_length)
            {
                max_length = curr_length;
                max_str = curr_str;
            }

            curr_str = expand(str, i, i + 1);
            curr_length = curr_str.length();

            if (curr_length > max_length)
            {
                max_length = curr_length;
                max_str = curr_str;
            }
        }

        return max_str;
    }
    public String longestPalindrome(String A) {
        //    // brute force - faile for hard
        //     String str = A;
        //     int n = str.length();
        //     int max = 1, start = 0;
        //       for (int i = 0; i < str.length(); i++) {
        //           for (int j = i; j < str.length(); j++) {
        //               boolean flag = true;
        //                for (int k = 0; k < (j - i + 1) / 2; k++){
        //                   if (str.charAt(i + k) != str.charAt(j - k))
        // 		        		flag = false;
        //                  }
        // 			    if (flag && (j - i + 1) > max) {
        // 			        start = i;
        // 			        max = j - i + 1;
        // 		        }

        //           }
        //       }


        // return str.substring(start,start+max);
//        if (A== null || A.length() < 1) return A;
//        if(A.length() == 0 ){
//            return A;
//        }
//
//        int max = 0, len = 0, len2=0;
//        String curr_string = "", max_str="";
//        int start =0, end=0;
//        for(int i=0; i< A.length(); i++){
//            //odd size polindrome
//            len = getExpandedSubString(A, i, i);
//            //even length palidrom
//            len2 = getExpandedSubString(A, i, i+1);
//             max= Math.max(len, len2);
//           if(max > end-start){
//               start= i-(len-1)/2;
//               end = i+len/2;
//           }
//        }
//        return A.substring(start-1, start+max);
        int start = 0;
        int maxlen = 0;
        int n = A.length();
        for (int i=0; i<n-maxlen/2; i++) {
            int j = i;
            int k = i;
            while (k < n-1 && A.charAt(k) == A.charAt(k+1))
                k++;
            while (j > 0 && k < n-1 && A.charAt(j-1) == A.charAt(k+1)) {
                j--;
                k++;
            }
            int length = k - j + 1;
            if (length > maxlen) {
                start = j;
                maxlen = length;
            }
        }
        return A.substring(start, start + maxlen);

    }

    public static int longestPalindrome2(String s) {
        if (s == null || s.length() < 1) return s.length();
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return end - start + 1;
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }


    private int  getExpandedSubString(String str , int left, int right){
        // current center moving in left and right comparing strings
        while(left >=0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        // palidrom sub string  - substring - is actual length of right minus left index mius one
        return right-left-1;
    }


    public static void main(String[] args) {
        System.out.println(new LongestPalindrom().longestPalindrome("abb"));
        System.out.println(new LongestPalindrom().longestPalindrome2("abb"));
    }
}
