package ca.ualberta.cs.lonelytwitter.moods;

import java.util.Date;

public class Sad extends CurrentMood {
    public Sad() {
        super.setDate(new Date());
        mood = "Sad";
    }

    public Sad(Date date) {
        super.setDate(date);
        mood = "Sad";
    }
}
