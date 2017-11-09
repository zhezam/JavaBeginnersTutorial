package zhezam.javabeginner.examples;

import zhezam.javabeginner.languages.interfaces.ISpeaker;

/**
 * Created by Евгения on 03.11.2017.
 */

class Seminar {
    public void speak(ISpeaker speaker) {
        System.out.print(speaker.speech(10));
    }
}

class Lecture {
    public void speak(ISpeaker speaker) {
        System.out.print(speaker.speech(45));
    }
}

public final class LambdaExample {

    public static void run() {
        Seminar seminar = new Seminar();

        seminar.speak(new ISpeaker() {
            @Override
            public String speech(int minutes) {
                return "This is my speech...for " + minutes + " minutes. \n";
            }
        });

        seminar.speak((int minutes) -> {
            if (minutes < 10) {
                return "something quick \n";
            }
            else if (minutes > 15) {
                return "something boring \n";
            }
            return "something interesting \n";
        });

        Lecture lecture = new Lecture();
        lecture.speak(minutes -> {
            if (minutes < 30) {
                return "something easy \n";
            }
            else if (minutes > 60) {
                return "something difficult \n";
            }
            return "something normal \n";
        });
    }
}
