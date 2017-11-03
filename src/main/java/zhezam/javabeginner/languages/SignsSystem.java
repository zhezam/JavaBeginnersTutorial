package zhezam.javabeginner.languages;

import zhezam.javabeginner.languages.interfaces.IInfo;

import java.util.Random;

/**
 * Created by Евгения on 02.11.2017.
 */
public abstract class SignsSystem implements IInfo {

    protected String name;

    protected int speakers = -1;


    public SignsSystem (String name) {

        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getInfo() { return name + " signs system."; }

    public int getSpeakers() {
        if (speakers == -1) {
            speakers = new Random().nextInt(1000);
        }
        return speakers;
    }


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

    @Override
    public int hashCode() {
        //TODO
        return super.hashCode();
    }

    public abstract String getHi();
    public abstract String getHello();
}
