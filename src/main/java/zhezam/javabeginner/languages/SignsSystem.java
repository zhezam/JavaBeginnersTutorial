package zhezam.javabeginner.languages;

/**
 * Created by Евгения on 02.11.2017.
 */
public abstract class SignsSystem implements IInfo {

    protected String name;


    public SignsSystem (String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getInfo() { return name + " signs system."; }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        SignsSystem signsSystem = (SignsSystem) obj;
        if (signsSystem != null) {
            if (name.equals(signsSystem.name)) {
                return true;
            }
        }
        return false;
    }


    public abstract String getHi();
    public abstract String getHello();
}
