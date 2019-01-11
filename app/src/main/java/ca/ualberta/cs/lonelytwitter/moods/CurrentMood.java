package ca.ualberta.cs.lonelytwitter.moods;

import java.util.Date;

public abstract class CurrentMood {
    private Date date;
    protected String mood;

    public CurrentMood() {

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return mood;
    }
}
