package Interfaces;

import Agents.HospitalInfoSource;
import Classes.Day;
import Classes.Room;
import jade.gui.GuiEvent;
import java.util.TreeMap;
import javafx.util.Pair;
import javax.swing.JOptionPane;

public class EditRoomMenu extends javax.swing.JFrame {
    
    private static final int REMOVE_ROOM_DAY = 108;
    
    private HospitalInfoSource source;
    private TreeMap<Integer, Room> rooms;

    public EditRoomMenu() {
        initComponents();
    }
    
    public EditRoomMenu(HospitalInfoSource source, TreeMap<Integer, Room> rooms) {
        initComponents();
        
        this.source = source;
        this.rooms = rooms;
        
        for(Room r : rooms.values()) RoomListComboBox.addItem("" + r.getId()); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AvailableDaysLabel = new javax.swing.JLabel();
        RoomListLabel = new javax.swing.JLabel();
        AvailableDaysButton = new javax.swing.JButton();
        GoBackButton = new javax.swing.JButton();
        RoomListComboBox = new javax.swing.JComboBox<>();
        AvailableDaysComboBox = new javax.swing.JComboBox<>();
        RemoveDayButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AvailableDaysLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AvailableDaysLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AvailableDaysLabel.setText("Dias Disponíveis");
        AvailableDaysLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        RoomListLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RoomListLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoomListLabel.setText("Lista de Salas");
        RoomListLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        AvailableDaysButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AvailableDaysButton.setText("Dias Disponíveis");
        AvailableDaysButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailableDaysButtonActionPerformed(evt);
            }
        });

        GoBackButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GoBackButton.setText("Retroceder");
        GoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButtonActionPerformed(evt);
            }
        });

        RemoveDayButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RemoveDayButton.setText("Remover Dia");
        RemoveDayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveDayButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AvailableDaysButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(GoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RemoveDayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(RoomListLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RoomListComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AvailableDaysComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AvailableDaysLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoomListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AvailableDaysLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AvailableDaysComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AvailableDaysButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveDayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_GoBackButtonActionPerformed

    private void AvailableDaysButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailableDaysButtonActionPerformed
        AvailableDaysComboBox.removeAllItems();
        String name = (String)RoomListComboBox.getSelectedItem();
        if(name != null) {
            int room = Integer.parseInt(name);
            for(Room r : rooms.values()) {
                if(r.getId() == room) {
                    for(Day day : r.getAvailableDays().values()) AvailableDaysComboBox.addItem("" + day.getDay());
                    break;
                }
            }
        }
        else JOptionPane.showMessageDialog(this, "Não há salas selecionadas!", "Dias Disponíveis", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_AvailableDaysButtonActionPerformed

    private void RemoveDayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveDayButtonActionPerformed
        String name = (String)AvailableDaysComboBox.getSelectedItem();
        if(name != null) {
            int room = Integer.parseInt((String)RoomListComboBox.getSelectedItem());
            int day = Integer.parseInt(name);
            
            Pair<Integer, Integer> pair = new Pair(room, day);
            GuiEvent ge = new GuiEvent(pair, REMOVE_ROOM_DAY);
            source.postGuiEvent(ge);
            
            this.dispose();
        }
        else JOptionPane.showMessageDialog(this, "Não há dias selecionados!", "Remover Dia", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_RemoveDayButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditRoomMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditRoomMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditRoomMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditRoomMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditRoomMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AvailableDaysButton;
    private javax.swing.JComboBox<String> AvailableDaysComboBox;
    private javax.swing.JLabel AvailableDaysLabel;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JButton RemoveDayButton;
    private javax.swing.JComboBox<String> RoomListComboBox;
    private javax.swing.JLabel RoomListLabel;
    // End of variables declaration//GEN-END:variables
}