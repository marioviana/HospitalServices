package Classes;

import java.io.Serializable;

public class Hour implements Serializable {
    
    private int hour, minute;

    public Hour(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    
    public Hour(Hour h) {
        this.hour = h.getHour();
        this.minute = h.getMinute();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    
    @Override
    public Hour clone() {
        return new Hour(this);
    }
    
}
