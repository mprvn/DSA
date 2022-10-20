public class IsPerfectSquare {
    public int solve(int A) {
        if(A > 1)
            for(int i=0; i<= A ;i++){
                if(i*i == A)
                    return i;
            }
       return -1;
    }

    public static void main(String[] args) {
      System.out.println(new IsPerfectSquare().solve(16));
    }
}
