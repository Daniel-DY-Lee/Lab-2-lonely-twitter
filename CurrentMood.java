package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Jay on 2016-09-15.
 */
public abstract class CurrentMood extends LonelyTwitterActivity
{
    private Date date;
    private String Emotion;
    public Date getDate (Date date) {
        return date;
    }
    public void setDate (Date newDate) {
        this.date = newDate;
    }
    ArrayList<String> emotion = new ArrayList<String>();

    public String getEmotion(String Emotion) {
        return Emotion;
    }

    public void setEmotion (String newEmotion) {
        this.emotion = emotion;
    }
}
