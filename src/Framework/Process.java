package Framework;

import java.util.ArrayList;

public class Process {

    private ArrayList<Atom> suspendedQuestions;
    private Constraint constraint;
    private ArrayList<Atom> questions;
    private ArrayList<Atom> askedQuestions;
    
    public Process(ArrayList<Atom> suspendedQuestions, Constraint constraint, ArrayList<Atom> questions, ArrayList<Atom> askedQuestions) {
        this.suspendedQuestions = suspendedQuestions;
        this.constraint = constraint;
        this.questions = questions;
        this.askedQuestions = askedQuestions;
    }
    
    public Process(Process p) {
        this.suspendedQuestions = p.getSuspendedQuestions();
        this.constraint = p.getConstraint();
        this.questions = p.getQuestions();
        this.askedQuestions = p.getAskedQuestions();
    }
    
    public ArrayList<Atom> getSuspendedQuestions() {
        ArrayList<Atom> aux = new ArrayList<Atom>();
        for(Atom q : suspendedQuestions) aux.add(q.clone());
        return aux;
    }
    
    public Constraint getConstraint() {
        return this.constraint.clone();
    }
    
    public ArrayList<Atom> getQuestions() {
        ArrayList<Atom> aux = new ArrayList<Atom>();
        for(Atom q : questions) aux.add(q.clone());
        return aux;
    }
    
    public ArrayList<Atom> getAskedQuestions() {
        ArrayList<Atom> aux = new ArrayList<Atom>();
        for(Atom q : askedQuestions) aux.add(q.clone());
        return aux;
    }
    
    public void setSuspendedQuestions(ArrayList<Atom> suspendedQuestions) {
        ArrayList<Atom> aux = new ArrayList<Atom>();
        for(Atom q : suspendedQuestions) aux.add(q.clone());
        this.suspendedQuestions = aux;
    }
    
    public void setConstraint(Constraint constraint) {
        this.constraint = constraint;
    }
    
    public void setQuestions(ArrayList<Atom> questions) {
        ArrayList<Atom> aux = new ArrayList<Atom>();
        for(Atom q : questions) aux.add(q.clone());
        this.questions = aux;
    }
    
    public void setAskedQuestions(ArrayList<Atom> askedQuestions) {
        ArrayList<Atom> aux = new ArrayList<Atom>();
        for(Atom q : askedQuestions) aux.add(q.clone());
        this.askedQuestions = aux;
    }
    
    @Override
    public Process clone() {
        return new Process(this);
    }
    
}
