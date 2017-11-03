package zhezam.javabeginner.examples;

import zhezam.javabeginner.languages.Language;
import zhezam.javabeginner.languages.comparators.NamesComparator;
import zhezam.javabeginner.languages.comparators.SpeakersComparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Евгения on 03.11.2017.
 */
public class SortingExample {

    public static void run() {
        ArrayList<Language> languages = ArrayExample.getAvailableLanguagesList();

        System.out.println("Languages list: ");
        ArrayExample.printSignsSystemsList(languages);


        System.out.println("Languages Sorted by names list: ");
        Collections.sort(languages, new NamesComparator());
        ArrayExample.printSignsSystemsList(languages);


        System.out.println("Languages Sorted by speakers number list: ");
        Collections.sort(languages, new SpeakersComparator());
        ArrayExample.printSignsSystemsList(languages);}
}
