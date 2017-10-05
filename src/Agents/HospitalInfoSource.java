package Agents;

import Classes.Doctor;
import Classes.TransplantMaterial;
import Classes.Room;
import Classes.Specialty;
import Interfaces.AddTransplantMaterialMenu;
import Interfaces.EditDoctorMenu;
import Interfaces.EditRoomMenu;
import jade.core.behaviours.CyclicBehaviour;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.lang.acl.ACLMessage;
import java.util.ArrayList;
import java.util.TreeMap;
import javafx.util.Pair;
import javax.swing.JFrame;

public class HospitalInfoSource extends GuiAgent {
    
    private final HospitalInfoSource source = this;
    
    private static final int INFORM = 7;
    
    private static final int ADD_TRANSPLANT_MATERIAL = 104;
    private static final int ADD_DOCTOR = 105;
    private static final int REMOVE_DAY = 106;
    private static final int REMOVE_DOCTOR = 107;
    private static final int REMOVE_ROOM_DAY = 108;
    
    private TreeMap<Integer, Doctor> doctors;
    private TreeMap<Integer, Room> rooms;
    private ArrayList<TransplantMaterial> transplantMaterials;
    
    @Override
    protected void setup() { 
        doctors = new TreeMap<>();
        rooms = new TreeMap<>();
        transplantMaterials = new ArrayList<>();
        
        // Test (to be removed later)
        Specialty s = new Specialty("Transplante", "Cabeça");
        Room r = new Room(s, 1);
        r.fillAvailableDays();
        rooms.put(1, r);
        
        // Fill data structures with generated info (...)
        
        // Send to HospitalManager the chosen default values (...)
        
        this.addBehaviour(new ReceiveBehaviour());
    }
    
    @Override
    protected void onGuiEvent(GuiEvent ev) {
        int command = ev.getType();
        switch(command) {
            case ADD_TRANSPLANT_MATERIAL:
                TransplantMaterial m = (TransplantMaterial)ev.getSource();
                transplantMaterials.add(m);
                System.out.println("Material de Transplante \"" + m.getName() + "\" adicionado com sucesso!");
                break;
            case ADD_DOCTOR:
                Doctor d1 = (Doctor)ev.getSource();
                d1.setId(doctors.size() + 1);
                doctors.put(doctors.size() + 1, d1);
                System.out.println("Médico \"" + d1.getName() + "\" adicionado com sucesso!");
                break;
            case REMOVE_DAY:
                Pair<String, Integer> pair = (Pair<String, Integer>)ev.getSource();
                for(Doctor d : doctors.values()) {
                    if(d.getName().equals(pair.getKey())) {
                        doctors.remove(d.getId());
                        d.removeDay(pair.getValue());
                        doctors.put(d.getId(), d);
                    }
                }
                System.out.println("Dia \"" + pair.getValue() + "\" de \"" + pair.getKey() + "\" removido com sucesso!");
                break;
            case REMOVE_DOCTOR:
                String name = (String)ev.getSource();
                for(Doctor d : doctors.values()) {
                    if(d.getName().equals(name)) {
                        doctors.remove(d.getId());
                        break;
                    }
                }
                System.out.println("Médico \"" + name + "\" removido com sucesso!");
                break;
            case REMOVE_ROOM_DAY:
                Pair<Integer, Integer> pairRoom = (Pair<Integer, Integer>)ev.getSource();
                for(Room r : rooms.values()) {
                    if(r.getId() == pairRoom.getKey()) {
                        rooms.remove(r.getId());
                        r.removeDay(pairRoom.getValue());
                        rooms.put(r.getId(), r);
                    }
                }
                System.out.println("Dia \"" + pairRoom.getValue() + "\" de \"" + pairRoom.getKey() + "\" removido com sucesso!");
                break;
        }
    }
    
    public class ReceiveBehaviour extends CyclicBehaviour {

        @Override
        public void action() {
            ACLMessage msg = receive();
            if(msg != null) {
                switch(msg.getPerformative()) {
                    case INFORM:
                        switch(msg.getContent()) {
                            case "Doctor":
                                EditDoctorMenu editDoctorMenu = new EditDoctorMenu(source, doctors);
                                editDoctorMenu.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                                editDoctorMenu.setVisible(true);
                                break;
                            case "Room":
                                EditRoomMenu editRoomMenu = new EditRoomMenu(source, rooms);
                                editRoomMenu.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                                editRoomMenu.setVisible(true);
                                break;
                            case "TransplantMaterial":
                                AddTransplantMaterialMenu addTransplantMaterialMenu = new AddTransplantMaterialMenu(source);
                                addTransplantMaterialMenu.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                                addTransplantMaterialMenu.setVisible(true);
                                break;
                        }
                        break;
                }
            }
        }
        
    }
    
}
