package zhezam.javabeginner.languages.enums;

/**
 * Created by Евгения on 01.11.2017.
 */
public enum EnglishDialectType {
    COCKNEY,
    KENTISH;

    public String getName() {
        return this.toString().toLowerCase();
    }
}
