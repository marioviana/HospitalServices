package Classes;

import java.io.Serializable;
import java.util.Collection;
import java.util.TreeMap;

public class Room implements Serializable {
    
    private TreeMap<Integer, Day> availableDays;
    private Specialty specialty;
    private int id;

    public Room(Specialty specialty, int id) {
        this.availableDays = new TreeMap<>();
        this.specialty = specialty;
        this.id = id;
    }
    
    public Room(Room r) {
        this.availableDays = r.getAvailableDays();
        this.specialty = r.getSpecialty();
        this.id = r.getId();
    }

    public TreeMap<Integer, Day> getAvailableDays() {
        TreeMap<Integer, Day> aux = new TreeMap<>();
        Collection<Day> days = this.availableDays.values();
        for(Day d : days) aux.put(d.getDay(), d.clone());
        return aux;
    }

    public Specialty getSpecialty() {
        return specialty.clone();
    }

    public int getId() {
        return id;
    }

    public void setAvailableDays(TreeMap<Integer, Day> availableDays) {
        TreeMap<Integer, Day> aux = new TreeMap<>();
        Collection<Day> days = availableDays.values();
        for(Day d : days) aux.put(d.getDay(), d.clone());
        this.availableDays = aux;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty.clone();
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public Room clone() {
        return new Room(this);
    }
    
    public void fillAvailableDays() {
        Hour begin = new Hour(0, 0);
        Hour end = new Hour(23, 59);
        for(int i = 1; i <= 365; i++) {
            Day d = new Day(begin, end, i);
            availableDays.put(i, d);
        }
    }
    
    public void removeDay(int day) {
        availableDays.remove(day);
    }
    
}
