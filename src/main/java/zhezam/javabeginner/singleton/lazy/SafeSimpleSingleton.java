package zhezam.javabeginner.singleton.lazy;

/**
 * Created by Евгения on 12.11.2017.
 */

// lazy
// thread safe
// catch exceptions in constructor
// synchronized useful first time only!
// synchronized is heavy!
public class SafeSimpleSingleton {
    private static SafeSimpleSingleton instance;

    private SafeSimpleSingleton() {

    }

    public synchronized static SafeSimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SafeSimpleSingleton();
        }
        return instance;
    }
}