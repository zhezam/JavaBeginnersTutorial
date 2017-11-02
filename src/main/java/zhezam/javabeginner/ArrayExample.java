package zhezam.javabeginner;

import zhezam.javabeginner.languages.ELanguage;
import zhezam.javabeginner.languages.IInfo;
import zhezam.javabeginner.languages.Language;

import java.util.ArrayList;

/**
 * Created by Евгения on 01.11.2017.
 */
public class ArrayExample {

    public static ArrayList<Language> getAvailableLanguagesList() {

        ArrayList<Language> languages = new ArrayList<Language>();
        languages.add(new Language(ELanguage.english));
        languages.add(new Language(ELanguage.russian));
        languages.add(new Language(ELanguage.german));
        return languages;
    }

    public static void printLanguagesList( ArrayList<? extends IInfo> languages) {

        StringBuilder outputString = new StringBuilder();

        for (int i = 0; i < languages.size(); i++) {

            outputString.append(String.format("%2d)", i + 1 ));
            outputString.append(languages.get(i).getName());
            outputString.append("\n");
        }
        System.out.printf(outputString.toString());
    }
}
