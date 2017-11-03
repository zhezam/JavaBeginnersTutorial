package zhezam.javabeginner.languages.enums;

/**
 * Created by Евгения on 01.11.2017.
 */
public enum ELanguage{
    ENGLISH,
    GERMAN,
    RUSSIAN,
    GREEK;

    public String getName() {
        return this.toString().toLowerCase();
    }
}