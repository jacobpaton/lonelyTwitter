package ca.ualberta.cs.lonelytwitter.moods;

import java.util.Date;

public class Happy extends CurrentMood {
    public Happy() {
        super.setDate(new Date());
        mood = "Happy";
    }

    public Happy(Date date) {
        super.setDate(date);
        mood = "Happy";
    }
}
