package zhezam.javabeginner.singleton.lazy;

/**
 * Created by Евгения on 12.11.2017.
 */
// thread safe
// lazy
// catch exceptions in constructor
// synchronized is not heavy
// volatile heavy productivity!
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized(DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
