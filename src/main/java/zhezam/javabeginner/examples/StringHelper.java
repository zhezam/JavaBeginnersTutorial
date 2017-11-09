package zhezam.javabeginner.examples;

/**
 * Created by Евгения on 02.11.2017.
 */
public final class StringHelper {

    public static String revertString(String input) {
        char[] charArray = input.toCharArray();

        StringBuilder output = new StringBuilder();
        for(int i = charArray.length - 1; i >=0; i--) {
            output.append(charArray[i]);
        }
        return output.toString();
    }

    public static String palindromeString(String input) {
        StringBuilder output = new StringBuilder();
        output.append(input);
        output.append(StringHelper.revertString(input).substring(1));
        return output.toString();
    }
}
