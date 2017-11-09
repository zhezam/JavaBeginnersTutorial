package zhezam.javabeginner.singleton.lazy;

/**
 * Created by Евгения on 12.11.2017.
 */

// thread safe
// lazy
// no exceptions in constructor!
public class InnerClassSingleton {

    private InnerClassSingleton() {

    }

    private static class Holder {
        private final static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return Holder.instance;
    }
}