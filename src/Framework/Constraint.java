package Framework;

import Classes.Day;
import Classes.Doctor;
import Classes.TransplantMaterial;
import Classes.Patient;
import Classes.Room;
import Classes.Specialty;

public class Constraint {
    
    private Patient p;
    private Specialty s;
    private Doctor m;
    private Room r;
    private TransplantMaterial o;
    private Day d;

    public Constraint() {
        this.p = null;
        this.s = null;
        this.m = null;
        this.r = null;
        this.o = null;
        this.d = null;
    }
    
    public Constraint(Constraint c) {
        this.p = c.getP();
        this.s = c.getS();
        this.m = c.getM();
        this.r = c.getR();
        this.o = c.getO();
        this.d = c.getD();
    }

    public Patient getP() {
        return p.clone();
    }

    public Specialty getS() {
        return s.clone();
    }

    public Doctor getM() {
        return m.clone();
    }

    public Room getR() {
        return r.clone();
    }

    public TransplantMaterial getO() {
        return o.clone();
    }

    public Day getD() {
        return d.clone();
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public void setS(Specialty s) {
        this.s = s;
    }

    public void setM(Doctor m) {
        this.m = m;
    }

    public void setR(Room r) {
        this.r = r;
    }

    public void setO(TransplantMaterial o) {
        this.o = o;
    }

    public void setD(Day d) {
        this.d = d;
    }
    
    @Override
    public Constraint clone() {
        return new Constraint(this);
    }
    
}
