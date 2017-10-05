package Framework;

public class Answer {
    
    private Atom a;
    private Constraint c;
    
    public Answer(Atom a, Constraint c) {
        this.a = a;
        this.c = c;
    }
    
    public Answer(Answer a) {
        this.a = a.getA();
        this.c = a.getC();
    }

    public Atom getA() {
        return a.clone();
    }

    public Constraint getC() {
        return c.clone();
    }

    public void setA(Atom a) {
        this.a = a;
    }

    public void setC(Constraint c) {
        this.c = c;
    }
    
    @Override
    public Answer clone() {
        return new Answer(this);
    }
    
}
