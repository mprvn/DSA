package src.puzzles;

public class PersonKillsNextperson {
    public int solve(int A) {
        int i = 0;
        int prev =0;
        int evenPower = 2;
        int powerCloseto2 = 0;
        while (powerCloseto2 < A){
            powerCloseto2 = (int) Math.pow(evenPower,i);
            if(powerCloseto2 < A) {
                prev = i;
                i++;
            }
        }
        if(powerCloseto2 > A) {
            powerCloseto2 = (int) Math.pow(evenPower,prev);
        }
        int kills =   A - powerCloseto2;

        return 2*kills + 1;
    }

    public static void main(String[] args) {
        System.out.println(new PersonKillsNextperson().solve(100));
    }
}
