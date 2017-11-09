package zhezam.javabeginner.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Евгения on 09.11.2017.
 */

//functional interface
interface Processor {
    String process (String s);
}

public final class LambdaTutorialExample {

    public static void run() {
        //Inner class
        class ReversalProcessor implements Processor{
            @Override
            public String process(String s) {
                return StringHelper.revertString(s);
            }
        }

        Processor reversalProcessor = new ReversalProcessor();
        processString("ABC", reversalProcessor);


        //Anonymous class
        processString("ABC", new Processor() {
            @Override
            public String process(String s) {
                return StringHelper.palindromeString(s);
            }
        });

        processString("1ABC", String::toLowerCase);

        //Function
        final String localStr = "Local ";
        processFunctionString("ABC", (str) ->  {
            //localStr = "new Local";
           return localStr.concat(str);
        });

        //BiFunction
        processBiFunctionString("A3ABC", 1,  (str, i) -> str.substring(i));


        //Compare
        String[] array = {"B4", "C1", "A3", "D2"};
        Arrays.sort(array, Comparator.comparing(x -> x.charAt(1)));
        System.out.println(Arrays.toString(array));
    }


    private static void processString(String input, Processor processor) {
        System.out.println(processor.process(input));
    }

    private static void processFunctionString(String input, Function<String, String> processor) {
        System.out.println(processor.apply(input));
    }

    private static void processBiFunctionString(String input, int i, BiFunction<String, Integer, String> processor) {
        System.out.println(processor.apply(input, i));
    }
}
