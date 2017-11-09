package zhezam.javabeginner.languages;

import zhezam.javabeginner.examples.FilesControllerExample;
import zhezam.javabeginner.languages.enums.EnglishDialectType;
import zhezam.javabeginner.languages.enums.LanguageType;

import java.util.ArrayList;

/**
 * Created by Евгения on 31.10.2017.
 */
public class Language extends SignsSystem implements Comparable<Language> {

    protected LanguageType type;

    private Dialect[] dialects;

    private ArrayList<String> expressions;

    public Language(LanguageType languageType) {
        super(languageType.getName());

        this.type = languageType;

        getDialects();
    }

    public LanguageType getType() {
        return type;
    }

    public Dialect[] getDialects() {
        if (dialects == null) {
            this.dialects = Language.getDialects(this);
        }
        return dialects;
    }

    public ArrayList<String> getExpressions() {
        if (expressions == null) {
            this.expressions = FilesControllerExample.readFile(name);
        }
        return expressions;
    }

    @Override
    public String getInfo(){
        StringBuilder infoString = new StringBuilder();

        infoString.append("This is " + name + " language. ");
        infoString.append(String.format("Dialects number: %d. \n", dialects.length));
        if (dialects.length > 0) {
            infoString.append("Dialects: \n");
        }
        for (int i = 0; i < dialects.length; i++) {
            infoString.append(dialects[i].getInfo() + "\n");
        }

        return infoString.toString();
    }

    @Override
    public String getHi() {
        return getExpressions().get(0);
    }

    @Override
    public String getHello() {
        return getExpressions().get(1);
    }

    public static Dialect[] getDialects(Language language) {
        switch (language.type) {
            case ENGLISH:
                Dialect[] dialects = new Dialect[EnglishDialectType.values().length];
                for (int i = 0; i < EnglishDialectType.values().length; i++) {
                    dialects[i] = new Dialect(EnglishDialectType.values()[i].getName(), language);
                }
                return dialects;
            default:
                return new Dialect[0];
        }
    }

    public void addExpression(String expression) {
        FilesControllerExample.appendFile(name, expression);
    }

    @Override
    public int compareTo(Language language) {
        return name.compareTo(language.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (!super.equals(o)) {
            return false;
        }

        Language language = (Language) o;

        return type == language.type;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}
