package zhezam.javabeginner.examples;

import zhezam.javabeginner.languages.Language;
import zhezam.javabeginner.languages.LanguagesList;
import zhezam.javabeginner.languages.enums.LanguageType;

import java.util.Iterator;

/**
 * Created by Евгения on 03.11.2017.
 */
public final class IteratorExample {

    public static void run() {
        LanguagesList list = new LanguagesList();

        print(list);

        remove(list, LanguageType.GREEK);

        print(list);
    }

    private static void remove(LanguagesList list, LanguageType type) {
        Iterator<Language> iterator = list.iterator();
        while (iterator.hasNext()) {
            Language language = iterator.next();
            if (language.getType().equals(type)) {
                iterator.remove();
            }
        }
    }

    private static void print(LanguagesList list) {
        StringBuilder outputString = new StringBuilder();

        for (Language language: list) {
            outputString.append(String.format("%-10s", language.getName()));
            outputString.append(String.format(" speakers: %10d", language.getSpeakers()));
            outputString.append("\n");
        }
        outputString.append("\n");

        System.out.printf(outputString.toString());
    }
}
