package Agents;

import Classes.Patient;
import Interfaces.HospitalMenu;
import Framework.Framework;
import jade.core.AID;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.lang.acl.ACLMessage;

public class HospitalManager extends GuiAgent {
    
    private static final int CONSULT_SCHEDULE = 100;
    private static final int ADD_PATIENT = 101;
    private static final int EDIT_DOCTOR = 102;
    private static final int EDIT_ROOM = 103;
    private static final int ADD_TRANSPLANT_MATERIAL = 104;
    
    protected HospitalMenu menu;
    
    private Framework f;
    
    @Override
    protected void setup() {
        f = new Framework();
        menu = new HospitalMenu(this);
        menu.setVisible(true);
    }

    @Override
    protected void onGuiEvent(GuiEvent ev) {
        int command = ev.getType();
        switch(command) {
            case CONSULT_SCHEDULE:
                break;
            case ADD_PATIENT:
                Patient p = (Patient)ev.getSource();
                f.addPatient(p);
                System.out.println("Paciente \"" + p.getName() + "\" adicionado com sucesso!");
                break;
            default:
                AID receiver = new AID();
                receiver.setLocalName("HospitalInfoSource");
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                msg.addReceiver(receiver);
                switch(command) {
                    case EDIT_DOCTOR:
                        msg.setContent("Doctor");
                        break;
                    case EDIT_ROOM:
                        msg.setContent("Room");
                        break;
                    case ADD_TRANSPLANT_MATERIAL:
                        msg.setContent("TransplantMaterial");
                        break;
                }
                send(msg);
                break;
        }
    }
    
}
