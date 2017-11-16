package zhezam.javabeginner.examples;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Евгения on 16.11.2017.
 */
public class RecursionExampleTest {

    @Test
    public void fibonacciNumbersTest() {

        //arrange

        //act
        int actual = 0;
        try {
            actual = RecursionExample.fibonacciNumbers(0,1,22);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //assert
        Assert.assertEquals(21, actual);
    }
}