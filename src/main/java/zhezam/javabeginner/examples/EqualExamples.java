package zhezam.javabeginner.examples;

import zhezam.javabeginner.languages.Dialect;
import zhezam.javabeginner.languages.Language;
import zhezam.javabeginner.languages.enums.EnglishDialectType;
import zhezam.javabeginner.languages.enums.LanguageType;

/**
 * Created by Евгения on 02.11.2017.
 */
public final class EqualExamples {

    public static void testEqualExamples() {
        Language english1 = new Language(LanguageType.ENGLISH);
        Language english2 = new Language(LanguageType.ENGLISH);

        System.out.println("english1 == english2 : " + (english1 == english2));
        System.out.println("english1.equals(english2) : " + (english1.equals(english2)));

        english2 = english1;

        System.out.println("english1 == english2 : " + (english1 == english2));
        System.out.println("english1.equals(english2) : " + (english1.equals(english2)));

        Language english3 = new Language(LanguageType.ENGLISH);
        Dialect dialect1 = new Dialect(EnglishDialectType.COCKNEY.getName(), english3);
        System.out.println("english3.equals(dialect1) : " + (english3.equals(dialect1)));
        System.out.println("english3.equals(null) : " + (english3.equals(null)));
    }
}
