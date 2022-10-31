public class MultiplicationDivisionProblem {
    public int solve(int A, int B) {
        double slicesPerMango = A*3;
        double noOFSlices =  B>0 ?B*2: 2;
        double output = slicesPerMango /noOFSlices;
        System.out.println(output);
        return (int)Math.ceil(output);
    }

    public static void main(String[] args) {
        System.out.println(new MultiplicationDivisionProblem().solve(7,1));
    }
}
