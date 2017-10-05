package Classes;

import java.io.Serializable;

public class TransplantMaterial implements Serializable {
    
    private Specialty specialty;
    private String name;

    public TransplantMaterial(Specialty specialty, String name) {
        this.specialty = specialty;
        this.name = name;
    }
    
    public TransplantMaterial(TransplantMaterial o) {
        this.specialty = o.getSpecialty();
        this.name = o.getName();
    }

    public Specialty getSpecialty() {
        return specialty.clone();
    }

    public String getName() {
        return name;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty.clone();
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public TransplantMaterial clone() {
        return new TransplantMaterial(this);
    }
    
}
