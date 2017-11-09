package zhezam.javabeginner.singleton.lazy;

/**
 * Created by Евгения on 12.11.2017.
 */
// lazy
// catch exceptions in constructor
// not thread safe!!
public class SimpleSingleton {
    private static SimpleSingleton instance;

    private SimpleSingleton() {

    }

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
}


