package zhezam.javabeginner.languages;

/**
 * Created by Евгения on 02.11.2017.
 */
public class EqualsTest {

    public static void Test() {
        Language english1 = new Language(ELanguage.english);
        Language english2 = new Language(ELanguage.english);

        System.out.println("english1 == english2 : " + (english1 == english2));
        System.out.println("english1.equals(english2) : " + (english1.equals(english2)));

        english2 = english1;

        System.out.println("english1 == english2 : " + (english1 == english2));
        System.out.println("english1.equals(english2) : " + (english1.equals(english2)));


        Language english3 = new Language(ELanguage.english);
        Dialect dialect1 = new Dialect(EEnglishDialect.cockney.toString(), english3);
        System.out.println("english3.equals(dialect1) : " + (english3.equals(dialect1)));
        System.out.println("english3.equals(null) : " + (english3.equals(null)));
    }
}
