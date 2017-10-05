package Classes;

import java.io.Serializable;

public class Specialty implements Serializable {
    
    private String type, name;

    public Specialty(String type, String name) {
        this.type = type;
        this.name = name;
    }
    
    public Specialty(Specialty s) {
        this.type = s.getType();
        this.name = s.getName();
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public Specialty clone() {
        return new Specialty(this);
    }
    
}
