package src.arthimetics;

public class Divisibility4 {
    public int solve(int A) {

        return (A%400 == 0 || (A%4 == 0 && A%100 != 0) )? 1:0;
    }

    public static void main(String[] args) {
        System.out.println(new Divisibility4().solve(2200));
        System.out.println(new Divisibility4().solve(1999));
        System.out.println(new Divisibility4().solve(1994));
    }
}
