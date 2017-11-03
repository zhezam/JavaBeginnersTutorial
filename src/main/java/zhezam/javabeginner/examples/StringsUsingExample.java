package zhezam.javabeginner.examples;

/**
 * Created by Евгения on 02.11.2017.
 */
public final class StringsUsingExample {

    public static String revertString(String input) {

        StringBuilder output = new StringBuilder();

        char[] charArray = input.toCharArray();
        for(int i = charArray.length - 1; i >=0; i--) {
            output.append(charArray[i]);
        }

        return output.toString();
    }
}
