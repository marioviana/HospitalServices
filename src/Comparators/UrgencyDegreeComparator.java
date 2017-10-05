package Comparators;

import Classes.Patient;
import java.util.Comparator;

public class UrgencyDegreeComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient p1, Patient p2) {
        if(p1.getUrgencyLevel() > p2.getUrgencyLevel()) return 1;
        else if(p1.getUrgencyLevel() < p2.getUrgencyLevel()) return -1;
        else if(p1.getAge() > p2.getAge()) return 1;
        else return -1;
    }
    
}
