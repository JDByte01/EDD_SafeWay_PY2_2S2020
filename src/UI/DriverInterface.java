/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import edd_safeway.Conductor;
import edd_safeway.Invoice;
import edd_safeway.InvoiceController;
import edd_safeway.Travel;
import edd_safeway.TravelController;
import edd_safeway.UserController;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSED
 */
public class DriverInterface extends javax.swing.JFrame {

    private UserController userController;
    private InvoiceController invoiceController;
    private TravelController travelController;
    private Conductor user;
    /**
     * Creates new form DriverInterface
     */
    public DriverInterface() {
        initComponents();
        
        this.userController = UserController.getInstance();
        this.travelController = TravelController.getInstance();
        this.invoiceController = InvoiceController.getInstance();
        
        this.label_status_travel.setText("No hay ningún viaje disponible");
        this.label_place1.setText("");
        this.label_place2.setText("");
        this.label_monto.setText("");
        this.btn_take_travel.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        label_place = new javax.swing.JLabel();
        label_coordinate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_status = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        label_salir = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        label_usuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_new_password = new javax.swing.JButton();
        btn_delete_account = new javax.swing.JButton();
        name_field = new javax.swing.JTextField();
        email_field = new javax.swing.JTextField();
        user_field = new javax.swing.JTextField();
        phone_field = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        label_status_travel = new javax.swing.JLabel();
        btn_take_travel = new javax.swing.JButton();
        label_place1 = new javax.swing.JLabel();
        label_place2 = new javax.swing.JLabel();
        label_monto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado conductor"));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Lugar Actual:");

        label_place.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_place.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_place.setText("USAC, T-3");

        label_coordinate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_coordinate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_coordinate.setText("(90.56525, -80.45452)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Estado:");

        label_status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_status.setForeground(new java.awt.Color(153, 0, 0));
        label_status.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_status.setText("Disponible");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Ver historial de viajes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(label_place, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(label_coordinate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(label_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(label_place))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_coordinate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(label_status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        label_salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_salir.setForeground(new java.awt.Color(0, 102, 153));
        label_salir.setText("Salir");
        label_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_salirMouseClicked(evt);
            }
        });

        label_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_usuario.setText("Conductor (@Usuario)");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Información de la cuenta"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Zona peligrosa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 0, 51))); // NOI18N

        btn_new_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_new_password.setForeground(new java.awt.Color(102, 102, 0));
        btn_new_password.setText("Cambiar contraseña");
        btn_new_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_passwordActionPerformed(evt);
            }
        });

        btn_delete_account.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_delete_account.setForeground(new java.awt.Color(153, 0, 51));
        btn_delete_account.setText("Eliminar cuenta");
        btn_delete_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_accountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_new_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete_account, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_new_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_delete_account, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        name_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name_field.setText("Nombre Completo");

        email_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        email_field.setText("Correo");
        email_field.setEnabled(false);

        user_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        user_field.setText("Usuario");
        user_field.setEnabled(false);

        phone_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        phone_field.setText("Telefono");

        btn_save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(0, 102, 0));
        btn_save.setText("Guardar cambios");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name_field, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email_field, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_field, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phone_field)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(user_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(phone_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solicitud de viaje", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        label_status_travel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_status_travel.setText("Viaje nuevo / No hay ningún viaje disponible");
        label_status_travel.setToolTipText("");

        btn_take_travel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_take_travel.setText("Tomar viaje");
        btn_take_travel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_take_travelActionPerformed(evt);
            }
        });

        label_place1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_place1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_place1.setText("Ubicación: Gasolinera shell usac");

        label_place2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_place2.setText("Destino: Usac edificio T-3");

        label_monto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_monto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_monto.setText("Q 352.51");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_take_travel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_place1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_place2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(label_status_travel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(label_monto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_status_travel)
                .addGap(18, 18, 18)
                .addComponent(label_place1)
                .addGap(4, 4, 4)
                .addComponent(label_place2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_monto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btn_take_travel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_usuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_salir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_usuario)
                    .addComponent(label_salir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        //Ver Historial de viajes
        //Mostrar un frame con una tabla de información
        // a detalle del invoce y travel
        ArrayList list = userController.getDriverInvoiceList(user.getId());
        if(list != null){
            //Launch table
            TravelHistory table = new TravelHistory();
            table.updateTable(list, false);
            table.setUser(user.getUsuario());
            table.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No tienens ningún viaje por el momento...");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_take_travelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_take_travelActionPerformed

        //Btn calcular ruta
//        label_loading.setText(" Cargando");
//
//        //Obtener el lugar seleccionado
//        String place_f = select_place.getSelectedItem().toString();
//
//        System.out.println(" ** Ruta ->");
//        System.out.println(" ["+user.getPlace()+ " -> " + place_f + "]");

    }//GEN-LAST:event_btn_take_travelActionPerformed

    private void label_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_salirMouseClicked

        this.logOut();
    }//GEN-LAST:event_label_salirMouseClicked

    private void btn_new_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_passwordActionPerformed

        //Btn cambiar contraseña
        String password = JOptionPane.showInputDialog(this,"Nueva contraseña","Conductor",JOptionPane.WARNING_MESSAGE);

        if(!password.isEmpty()){
            System.out.println(" | > New password: " + password);
            userController.updateDriverPassword(user.getId(), password);
            //Hacer logOut
            this.logOut();
        }

    }//GEN-LAST:event_btn_new_passwordActionPerformed

    private void btn_delete_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_accountActionPerformed

        //Btn eliminar cuenta
        int request = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar tu cuenta?","Conductor",JOptionPane.YES_NO_OPTION);
        if(request == JOptionPane.YES_OPTION){
            //Eliminar la cuenta
            userController.deleteDriver(user.getId());

            this.logOut();
        }
    }//GEN-LAST:event_btn_delete_accountActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        //Btn guardar cambios
        String name = name_field.getText();
        String phone = phone_field.getText();

        //Buscar y guardar la info en el árbol
        userController.updateDriverInfo(user.getId(), name, phone);
        this.label_usuario.setText(name + " (@"+this.user.getUsuario()+")");
        this.name_field.setText(name);
        this.phone_field.setText(phone);

        JOptionPane.showMessageDialog(this, "Se actualizó la información correctamente", "Conductor", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btn_saveActionPerformed

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
            java.util.logging.Logger.getLogger(DriverInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete_account;
    private javax.swing.JButton btn_new_password;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_take_travel;
    private javax.swing.JTextField email_field;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_coordinate;
    private javax.swing.JLabel label_monto;
    private javax.swing.JLabel label_place;
    private javax.swing.JLabel label_place1;
    private javax.swing.JLabel label_place2;
    private javax.swing.JLabel label_salir;
    private javax.swing.JLabel label_status;
    private javax.swing.JLabel label_status_travel;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JTextField name_field;
    private javax.swing.JTextField phone_field;
    private javax.swing.JTextField user_field;
    // End of variables declaration//GEN-END:variables

   public void setUser(Conductor user){
        this.user = user;
        
        //Actualizar info
        this.label_usuario.setText(this.user.getNombre() + " (@"+this.user.getUsuario()+")");
        this.name_field.setText(user.getNombre());
        this.user_field.setText(user.getUsuario());
        this.email_field.setText(user.getCorreo());
        this.phone_field.setText(user.getTelefono());
        
        //Actualizar Ubicación
        this.label_place.setText(user.getPlace());
        this.label_coordinate.setText("("+user.getLatitud()+","+user.getLongitud()+")");
        if(user.isDisponibilidad()){
            //Disponible
            this.label_status.setText("Disponible");
            this.label_status.setForeground(new Color(51,102,0));
            
            int invoiceIndex = invoiceController.getPendingInvoice();
            if(invoiceIndex >= 0){
                
                Invoice invoice = invoiceController.searchInvoice(invoiceIndex);
                Travel travel = travelController.getTravel(invoice.getId_travel());
                //Actualizar campo de viajes
                this.label_status_travel.setText(" Viaje nuevo disponible");
                this.label_place1.setText("Ubicación: "+travel.getPlace1());
                this.label_place2.setText("Destino: "+travel.getPlace2());
                this.label_monto.setText("Q"+invoice.getMonto());
                this.btn_take_travel.setEnabled(true);
            }
            
            
        } else {
            //No disponible
            this.label_status.setText("No disponible");
            this.label_status.setForeground(new Color(153,0,0));
            
            //Actualizar campo de viajes
            this.label_status_travel.setText(" No hay ningun viaje disponible");
            this.label_place1.setText("");
            this.label_place2.setText("");
            this.label_monto.setText("");
            this.btn_take_travel.setEnabled(false);
        }

    }
    
    private void logOut(){
         //Regresar a LogIn
        LogIn login = new LogIn();
        login.setVisible(true);
        System.out.println(" | > Log Out");
        
        this.dispose();
    }
}
