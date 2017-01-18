package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class NormalTweet extends Tweet {

    public NormalTweet(Date date, String message) throws TweetTooLongException {

        super(date, message);
    }

    public NormalTweet(String message) throws TweetTooLongException {

        super(message);
    }

    public Boolean isImportant() {

        return false;
    }
}
