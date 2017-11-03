package zhezam.javabeginner.languages.comparators;

import zhezam.javabeginner.languages.Language;
import zhezam.javabeginner.languages.SignsSystem;

import java.util.Comparator;

/**
 * Created by Евгения on 03.11.2017.
 */
public class NamesComparator implements Comparator<SignsSystem> {
    @Override
    public int compare(SignsSystem signsSystem1, SignsSystem signsSystem2) {
        return signsSystem1.getName().compareTo(signsSystem2.getName());
    }
}
