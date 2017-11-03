package zhezam.javabeginner.languages.enums;

/**
 * Created by Евгения on 01.11.2017.
 */
public enum EEnglishDialect {
    COCKNEY,
    KENTISH;

    public String getName() {
        return this.toString().toLowerCase();
    }
}
