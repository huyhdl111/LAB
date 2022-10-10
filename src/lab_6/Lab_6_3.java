package lab_6;

import java.util.ArrayList;
import java.util.List;

public class Lab_6_3 {
    public static void main(String[] args) {
        String myStr = "12345nabc678";
        char[] myArray = myStr.toCharArray();
        List<Character> newArray = new ArrayList<>();
        for (char character : myArray) {
            if (Character.isDigit(character)){
                newArray.add(character);
            }
        }
        System.out.println(newArray);
    }
}
