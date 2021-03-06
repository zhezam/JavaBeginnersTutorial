package zhezam.javabeginner.examples;

import zhezam.javabeginner.languages.Language;
import zhezam.javabeginner.languages.SignsSystem;
import zhezam.javabeginner.languages.enums.LanguageType;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Евгения on 03.11.2017.
 */
public final class LanguagesInOutExample  {

    public void run() {
        System.out.println("Select and write language number from the list: ");
        ArrayList<Language> languages = ArrayExample.getAvailableLanguagesList();
        ArrayExample.printSignsSystemsList(languages);

        Language language = selectLanguage();
        System.out.printf(language.getInfo());
        print(language.getHello());

        System.out.println("Say Hello in Greek, please.");
        sayHelloInGreek();
    }

    public static Language selectLanguage() {
        LanguageType languageType = null;

        while (languageType == null) {
            try {
                Scanner scanner = new Scanner(System.in);
                int languageNumber = scanner.nextInt();
                scanner.close();

                String languageName = LanguageType.values()[languageNumber - 1].toString();
                languageType = LanguageType.valueOf(languageName);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid language number!");
            }
            catch (InputMismatchException e) {
                System.out.println("This is not a number!");
            }
        }

        Language language = new Language(languageType);
        System.out.printf("Selected language is: %s\n", language.toString());

        return language;
    }

    public static void print(String expression) {
        System.out.println(expression);
    }

    public static void sayHelloInGreek() {
        Language greekLanguage = new Language(LanguageType.GREEK) {
            @Override
            public String getHello() {
                return "I don't know how to say Hello in greek!";
            }
        };
        print(greekLanguage.getHello());
    }
}
