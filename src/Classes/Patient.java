package Classes;

public class Patient {
    
    private Specialty specialty;
    private String name;
    private int age, urgencyLevel;
    
    public Patient(Specialty specialty, String name, int age, int urgencyLevel) {
        this.specialty = specialty;
        this.name = name;
        this.age = age;
        this.urgencyLevel = urgencyLevel;
    }
    
    public Patient(Patient p) {
        this.specialty = p.getSpecialty();
        this.name = p.getName();
        this.age = p.getAge();
        this.urgencyLevel = p.getUrgencyLevel();
    }

    public Specialty getSpecialty() {
        return specialty.clone();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUrgencyLevel(int urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }
    
    @Override
    public Patient clone() {
        return new Patient(this);
    }
    
}
