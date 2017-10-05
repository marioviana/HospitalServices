package Framework;

import Classes.Doctor;
import Classes.TransplantMaterial;
import Classes.Patient;
import Classes.Room;
import Comparators.UrgencyDegreeComparator;
import java.util.ArrayList;
import java.util.TreeSet;

public class Framework {
    
    private TreeSet<Patient> patients;
    private ArrayList<Process> activeProcesses;
    private ArrayList<Process> suspendedProcesses;
    private ArrayList<Atom> askedQuestions;
    private ArrayList<Answer> answers;
    private ArrayList<Doctor> defaultDoctors;
    private ArrayList<Room> defaultRooms;
    private ArrayList<TransplantMaterial> defaultOrgans;
    
    public Framework() {
        patients = new TreeSet<>(new UrgencyDegreeComparator());
        activeProcesses = new ArrayList<>();
        suspendedProcesses = new ArrayList<>();
        askedQuestions = new ArrayList<>();
        answers = new ArrayList<>();
        defaultDoctors = new ArrayList<>();
        defaultRooms = new ArrayList<>();
        defaultOrgans = new ArrayList<>();
    }
    
    public void addPatient(Patient p) {
        patients.add(p.clone());
    }
    
}
