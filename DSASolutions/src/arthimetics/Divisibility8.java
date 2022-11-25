package src.arthimetics;

public class Divisibility8 {

    public int solve(String A) {
        int ans = 0;
        int n = A.length();
        String temp = A;
        if(A.length()>3){
            temp =  temp.substring(n-3,n);
        }
        int num =Integer.parseInt( temp);

        if(num%8 ==0) ans = 1;

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Divisibility8().solve("16"));
        System.out.println(new Divisibility8().solve("123"));
        System.out.println(new Divisibility8().solve("9216"));
    }
}
