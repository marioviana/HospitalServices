package Interfaces;

import Agents.HospitalManager;
import jade.gui.GuiEvent;
import javax.swing.JFrame;

public class HospitalMenu extends javax.swing.JFrame {
    
    private static final int CONSULT_SCHEDULE = 100;
    private static final int EDIT_DOCTOR = 102;
    private static final int EDIT_ROOM = 103;
    private static final int ADD_TRANSPLANT_MATERIAL = 104;
    
    private HospitalManager manager;

    public HospitalMenu() {
        initComponents();
    }
    
    public HospitalMenu(HospitalManager manager) {
        initComponents();
        this.manager = manager;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainImageLabel = new javax.swing.JLabel();
        EditDoctorButton = new javax.swing.JButton();
        AddPatientButton = new javax.swing.JButton();
        AddTransplantMaterialButton = new javax.swing.JButton();
        EditRoomButton = new javax.swing.JButton();
        ConsultScheduleButton = new javax.swing.JButton();
        WelcomeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HBraga_branding-24.jpg"))); // NOI18N
        MainImageLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MainImageLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MainImageLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        EditDoctorButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EditDoctorButton.setText("Editar Médicos");
        EditDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDoctorButtonActionPerformed(evt);
            }
        });

        AddPatientButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddPatientButton.setText("Adicionar Pacientes");
        AddPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPatientButtonActionPerformed(evt);
            }
        });

        AddTransplantMaterialButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        AddTransplantMaterialButton.setText("Adicionar Material de Transplante");
        AddTransplantMaterialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTransplantMaterialButtonActionPerformed(evt);
            }
        });

        EditRoomButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EditRoomButton.setText("Editar Salas");
        EditRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditRoomButtonActionPerformed(evt);
            }
        });

        ConsultScheduleButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ConsultScheduleButton.setText("Consultar Horários");
        ConsultScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultScheduleButtonActionPerformed(evt);
            }
        });

        WelcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLabel.setText("Bem-Vindo ao Hospital Virtual");
        WelcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddTransplantMaterialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(EditRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(MainImageLabel)
                        .addGap(41, 41, 41)
                        .addComponent(EditDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(ConsultScheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(EditDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(ConsultScheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MainImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddTransplantMaterialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPatientButtonActionPerformed
        AddPatientMenu addPatientMenu = new AddPatientMenu(manager);
        addPatientMenu.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addPatientMenu.setVisible(true);
    }//GEN-LAST:event_AddPatientButtonActionPerformed

    private void EditDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDoctorButtonActionPerformed
        GuiEvent ge = new GuiEvent("", EDIT_DOCTOR);
        manager.postGuiEvent(ge);
    }//GEN-LAST:event_EditDoctorButtonActionPerformed

    private void EditRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditRoomButtonActionPerformed
        GuiEvent ge = new GuiEvent("", EDIT_ROOM);
        manager.postGuiEvent(ge);
    }//GEN-LAST:event_EditRoomButtonActionPerformed

    private void AddTransplantMaterialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTransplantMaterialButtonActionPerformed
        GuiEvent ge = new GuiEvent("", ADD_TRANSPLANT_MATERIAL);
        manager.postGuiEvent(ge);
    }//GEN-LAST:event_AddTransplantMaterialButtonActionPerformed

    private void ConsultScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultScheduleButtonActionPerformed
        GuiEvent ge = new GuiEvent("", CONSULT_SCHEDULE);
        manager.postGuiEvent(ge);
    }//GEN-LAST:event_ConsultScheduleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HospitalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPatientButton;
    private javax.swing.JButton AddTransplantMaterialButton;
    private javax.swing.JButton ConsultScheduleButton;
    private javax.swing.JButton EditDoctorButton;
    private javax.swing.JButton EditRoomButton;
    private javax.swing.JLabel MainImageLabel;
    private javax.swing.JLabel WelcomeLabel;
    // End of variables declaration//GEN-END:variables
}