package zhezam.javabeginner.examples;

import zhezam.javabeginner.languages.Dialect;
import zhezam.javabeginner.languages.Language;
import zhezam.javabeginner.languages.enums.EEnglishDialect;
import zhezam.javabeginner.languages.enums.ELanguage;

/**
 * Created by Евгения on 02.11.2017.
 */
public class EqualExamples {

    public static void testEqualExamples() {
        Language english1 = new Language(ELanguage.ENGLISH);
        Language english2 = new Language(ELanguage.ENGLISH);

        System.out.println("english1 == english2 : " + (english1 == english2));
        System.out.println("english1.equals(english2) : " + (english1.equals(english2)));

        english2 = english1;

        System.out.println("english1 == english2 : " + (english1 == english2));
        System.out.println("english1.equals(english2) : " + (english1.equals(english2)));


        Language english3 = new Language(ELanguage.ENGLISH);
        Dialect dialect1 = new Dialect(EEnglishDialect.COCKNEY.getName(), english3);
        System.out.println("english3.equals(dialect1) : " + (english3.equals(dialect1)));
        System.out.println("english3.equals(null) : " + (english3.equals(null)));
    }
}
