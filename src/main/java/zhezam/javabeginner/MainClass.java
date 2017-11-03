package zhezam.javabeginner;

import java.io.IOException;

import zhezam.javabeginner.examples.LambdaExample;
import zhezam.javabeginner.examples.SortingExample;

import static zhezam.javabeginner.languages.enums.Singleton.SINGLETON;

/**
 * Created by Евгения on 31.10.2017.
 */
public class MainClass {

    public static void main(String[] args) throws IOException {
        SortingExample.run();
        //IteratorExample.run();
        //LambdaExample.run();

        //SINGLETON.iterateCounter();
    }
}


