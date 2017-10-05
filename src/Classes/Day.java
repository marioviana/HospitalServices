package Classes;

import java.io.Serializable;

public class Day implements Serializable {
    
    private Hour begin, end;
    private int day;

    public Day(Hour begin, Hour end, int day) {
        this.begin = begin;
        this.end = end;
        this.day = day;
    }
    
    public Day(Day d) {
        this.begin = d.getBegin();
        this.end = d.getEnd();
        this.day = d.getDay();
    }

    public Hour getBegin() {
        return begin.clone();
    }

    public Hour getEnd() {
        return end.clone();
    }

    public int getDay() {
        return day;
    }

    public void setBegin(Hour begin) {
        this.begin = begin.clone();
    }

    public void setEnd(Hour end) {
        this.end = end.clone();
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    @Override
    public Day clone() {
        return new Day(this);
    }
    
}
