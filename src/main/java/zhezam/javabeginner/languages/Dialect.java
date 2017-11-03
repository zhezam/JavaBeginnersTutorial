package zhezam.javabeginner.languages;

/**
 * Created by Евгения on 01.11.2017.
 */
public class Dialect extends SignsSystem {

    private Language language;


    public Dialect(String name, Language language) {

        super(name);

        this.language = language;
    }


    public Language getLanguage() {
        return language;
    }


    @Override
    public String getInfo(){
        return name + " dialect. Dialect of " + language.name + " language.";
    }

    @Override
    public String getHi() {
        return  language.getHi();
    }

    @Override
    public String getHello() {
        return  language.getHello();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dialect dialect = (Dialect) o;

        return language != null ? language.equals(dialect.language) : dialect.language == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
