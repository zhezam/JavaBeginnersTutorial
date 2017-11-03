package zhezam.javabeginner.languages.enums;

/**
 * Created by Евгения on 03.11.2017.
 */
public enum Singleton {
    SINGLETON;

    private int counter = 0;

    public void iterateCounter() {
        counter++;
    }
}
