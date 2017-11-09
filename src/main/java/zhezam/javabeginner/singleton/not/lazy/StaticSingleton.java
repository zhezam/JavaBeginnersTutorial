package zhezam.javabeginner.singleton.not.lazy;

/**
 * Created by Евгения on 12.11.2017.
 */

// thread safe
// not lazy!
// not able to catch exceptions in constructor!
public class StaticSingleton {
    public final static StaticSingleton instance = new StaticSingleton();

    private StaticSingleton() {

    }

    public static StaticSingleton getInstance() {
        return instance;
    }
}