package zhezam.javabeginner.languages;

import zhezam.javabeginner.languages.enums.LanguageType;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Евгения on 03.11.2017.
 */
public class LanguagesList implements Iterable<Language>{

    private LinkedList<Language> languages = new LinkedList<>();


    public LanguagesList() {

        languages.add(new Language(LanguageType.GREEK));
        languages.add(new Language(LanguageType.ENGLISH));
        languages.add(new Language(LanguageType.GERMAN));
        languages.add(new Language(LanguageType.RUSSIAN));
    }


    private class LanguageIterator implements Iterator<Language> {

        private int index = -1;

        @Override
        public boolean hasNext() {

            boolean hasIndex = index < languages.size() - 1;

            System.out.println(hasIndex ? "has next index" : "has not next index \n");

            return hasIndex;
        }

        @Override
        public Language next() {

            index++;

            System.out.println("current index = " + index);

            Language language = languages.get(index);

            return language;
        }

        @Override
        public void remove() {

            System.out.println("remove index = " + index);

            languages.remove();
        }
    }

    @Override
    public Iterator<Language> iterator() {

        return new LanguageIterator();
    }
}
