package ca.ualberta.cs.lonelytwitter;

/**
 * Created by linghou on 2017/1/18.
 */
import java.util.Date;

public abstract class Mood {
    private Date date;

    public Mood(){
        this.date = new Date(System.currentTimeMillis());
    }
    public Mood(Date date){
        this.date=date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String moodtoString();

}
