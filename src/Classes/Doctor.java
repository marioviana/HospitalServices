package Classes;

import java.io.Serializable;
import java.util.Collection;
import java.util.TreeMap;

public class Doctor implements Serializable {
    
    private TreeMap<Integer, Day> availableDays;
    private Specialty specialty;
    private String name;
    private int id;

    public Doctor(Specialty specialty, String name) {
        this.availableDays = new TreeMap<>();
        this.specialty = specialty;
        this.name = name;
    }
    
    public Doctor(Doctor d) {
        this.availableDays = d.getAvailableDays();
        this.specialty = d.getSpecialty();
        this.name = d.getName();
    }

    public TreeMap<Integer, Day> getAvailableDays() {
        TreeMap<Integer, Day> aux = new TreeMap<>();
        Collection<Day> values = availableDays.values(); 
        for(Day d : values) aux.put(d.getDay(), d.clone());
        return aux;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public String getName() {
        return name;
    }
    
    public int getId() {
        return this.id;
    }

    public void setAvailableDays(TreeMap<Integer, Day> availableDays) {
        TreeMap<Integer, Day> aux = new TreeMap<>();
        Collection<Day> values = availableDays.values(); 
        for(Day d : values) aux.put(d.getDay(), d.clone());
        this.availableDays = aux;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public Doctor clone() {
        return new Doctor(this);
    }
    
    public void fillAvailableDays(String hour) {  
        Hour begin, end;
        for(int i = 1; i <= 365; i++) {
            switch(hour) {
                case "00:00h-08:00h":
                    begin = new Hour(0, 0);
                    end = new Hour(7, 59);
                    break;
                case "08:00h-16:00h":
                    begin = new Hour(8, 0);
                    end = new Hour(15, 59);
                    break;
                default:
                    begin = new Hour(16, 0);
                    end = new Hour(23, 59);
                    break;
            }
            Day d = new Day(begin, end, i);
            availableDays.put(i, d);
        }   
    }
    
    public void removeDay(int day) {
        availableDays.remove(day);
    }
    
}
