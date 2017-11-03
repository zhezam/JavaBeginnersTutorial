package zhezam.javabeginner.languages.comparators;

import zhezam.javabeginner.languages.SignsSystem;

import java.util.Comparator;

/**
 * Created by Евгения on 03.11.2017.
 */
public class SpeakersComparator implements Comparator<SignsSystem> {
    @Override
    public int compare(SignsSystem signsSystem1, SignsSystem signsSystem2) {
        return -Integer.compare(signsSystem1.getSpeakers(), signsSystem2.getSpeakers());
    }
}
