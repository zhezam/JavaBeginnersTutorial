package zhezam.javabeginner.examples;

import zhezam.javabeginner.languages.SignsSystem;
import zhezam.javabeginner.languages.enums.ELanguage;
import zhezam.javabeginner.languages.Language;

import java.util.ArrayList;

/**
 * Created by Евгения on 01.11.2017.
 */
public class ArrayExample {

    public static ArrayList<Language> getAvailableLanguagesList() {

        ArrayList<Language> languages = new ArrayList<>();
        languages.add(new Language(ELanguage.ENGLISH));
        languages.add(new Language(ELanguage.RUSSIAN));
        languages.add(new Language(ELanguage.GERMAN));
        return languages;
    }

    public static void printSignsSystemsList( ArrayList<? extends SignsSystem> signsSystems) {

        StringBuilder outputString = new StringBuilder();

        for (int i = 0; i < signsSystems.size(); i++) {

            SignsSystem signsSystem = signsSystems.get(i);
            outputString.append(String.format("%2d) %-10s", i + 1 , signsSystem.getName()));
            outputString.append(String.format(", speakers: %10d", signsSystem.getSpeakers()));
            outputString.append("\n");
        }
        System.out.printf(outputString.toString());
    }
}
