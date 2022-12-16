package src.Arrays.stringDsa;
import java.util.*;
public class ToUpper {
    public ArrayList<Character> to_upper(ArrayList<Character> A) {
        for(int i=0; i< A.size(); i++){
            if(A.get(i).charValue() >=97){
                char value = A.get(i).charValue();
                char temp =((char) ((int)value-32));
                A.set(i, temp);
            }
        }

        return A;
    }

    public static void main(String[] args) {
        Character[]  A = {'S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};

        System.out.println(new ToUpper().to_upper(new ArrayList<>(Arrays.asList(A))));
    }
}
