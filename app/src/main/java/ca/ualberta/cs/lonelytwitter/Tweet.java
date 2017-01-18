package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet implements Tweetable {

    private Date date;
    private String message;
    private ArrayList<Mood> moods = new ArrayList<Mood>();

    public Tweet(Date date, String message) throws TweetTooLongException {

        this.date = date;
        this.setMessage(message);
    }

    public Tweet(String message) throws TweetTooLongException {

        this.date = new Date(System.currentTimeMillis());
        this.setMessage(message);
    }

    public abstract Boolean isImportant();

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {

        this.date = date;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {

        if (message.length() > 144) throw new TweetTooLongException();
        this.message = message;
    }

    public ArrayList<Mood> getMoods() {
        return moods;
    }

    public void setMoods(ArrayList<Mood> moods) {
        this.moods = moods;
    }
}
