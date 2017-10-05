package Framework;

public class Atom {
    
    private String question;
    private boolean askable;
    
    public Atom(String question, boolean askable) {
        this.question = question;
        this.askable = askable;
    }
    
    public Atom(Atom a) {
        this.question = a.getQuestion();
        this.askable = a.isAskable();
    }

    public String getQuestion() {
        return question;
    }

    public boolean isAskable() {
        return askable;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAskable(boolean askable) {
        this.askable = askable;
    }
    
    @Override
    public Atom clone() {
        return new Atom(this);
    }
    
}
