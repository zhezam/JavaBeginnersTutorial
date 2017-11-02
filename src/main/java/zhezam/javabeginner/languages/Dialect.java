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
}
