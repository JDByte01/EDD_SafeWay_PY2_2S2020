/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import edd_safeway.Lugar;
import edd_safeway.PlaceController;
import edd_safeway.UserController;
import edd_safeway.Usuario;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSED
 */
public class UserInterface extends javax.swing.JFrame {

    private Usuario user;
    private UserController userController;
    private PlaceController placeController;
    private ArrayList<Lugar> placeList;
    /**
     * Creates new form UserInterface
     */
    public UserInterface() {
        initComponents();
        
        this.userController = UserController.getInstance();
        this.placeController = PlaceController.getInstance();
        this.user = null;
        
        this.label_usuario.setText("");
        this.label_loading.setText("");
        
        placeList = placeController.getPlaces();
        //Colocar lugares
        
        //select_place = new JComboBox();
        if(placeList != null){
            //Insertar lugares en el input field
            
            for(Lugar l : placeList){
                select_place.addItem(l.getNombre());
            }
            
        } else {
            select_place.addItem(" - No hay lugares disponibles");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_usuario = new javax.swing.JLabel();
        label_salir = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_new_password = new javax.swing.JButton();
        btn_delete_account = new javax.swing.JButton();
        name_field = new javax.swing.JTextField();
        email_field = new javax.swing.JTextField();
        user_field = new javax.swing.JTextField();
        phone_field = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_history_travel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        label_place = new javax.swing.JLabel();
        label_coordinate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        select_place = new javax.swing.JComboBox<>();
        btn_calculate = new javax.swing.JButton();
        label_loading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(698, 450));

        label_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_usuario.setText("Usuario");

        label_salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_salir.setForeground(new java.awt.Color(0, 102, 153));
        label_salir.setText("Salir");
        label_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_salirMouseClicked(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Viajes"));

        btn_history_travel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_history_travel.setText("Ver historial de viajes");
        btn_history_travel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_history_travelActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedir un viaje", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Lugar Actual:");

        label_place.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_place.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_place.setText("USAC, T-3");

        label_coordinate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_coordinate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_coordinate.setText("(90.56525, -80.45452)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Seleccionar destino");

        select_place.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        btn_calculate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_calculate.setText("Calcular Ruta");
        btn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateActionPerformed(evt);
            }
        });

        label_loading.setText("Calculando ruta . . .");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_coordinate, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(label_place, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(select_place, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(label_loading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(label_place))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_coordinate)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(select_place, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_loading)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_history_travel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_history_travel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void label_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_salirMouseClicked
        
        this.logOut();
    }//GEN-LAST:event_label_salirMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        
        //Btn guardar cambios
        String name = name_field.getText();
        String phone = phone_field.getText();
        
        //Buscar y guardar la info en el árbol
        userController.updateUserInfo(user.getId(), name, phone);
        this.label_usuario.setText(name + " (@"+this.user.getUsuario()+")");
        this.name_field.setText(name);
        this.phone_field.setText(phone);
        
        JOptionPane.showMessageDialog(this, "Se actualizó la información correctamente", "Usuario", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_new_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_passwordActionPerformed
        
        //Btn cambiar contraseña
        String password = JOptionPane.showInputDialog(this,"Nueva contraseña","Usuario",JOptionPane.WARNING_MESSAGE);
        
        if(!password.isEmpty()){
            System.out.println(" | > New password: " + password);
            userController.updateUserPassword(user.getId(), password);
            //Hacer logOut
            this.logOut();
        }
        
    }//GEN-LAST:event_btn_new_passwordActionPerformed

    private void btn_delete_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_accountActionPerformed
        
        //Btn eliminar cuenta
        int request = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar tu cuenta?","Usuario",JOptionPane.YES_NO_OPTION);
        if(request == JOptionPane.YES_OPTION){
            //Eliminar la cuenta
            userController.deleteUser(user.getId());
            
            this.logOut();
        }
    }//GEN-LAST:event_btn_delete_accountActionPerformed

    private void btn_history_travelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_history_travelActionPerformed
        
        
        //Ver Historial de viajes
        //Mostrar un frame con una tabla de información 
        // a detalle del invoce y travel
        ArrayList list = userController.getUserInvoiceList(user.getId());
        if(list != null){
            //Launch table
            TravelHistory table = new TravelHistory();
            table.updateTable(list, true);
            table.setUser(user.getUsuario());
            table.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No tienens ningún viaje por el momento...");
        }
    }//GEN-LAST:event_btn_history_travelActionPerformed

    private void btn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateActionPerformed
        
        
        //Btn calcular ruta
        label_loading.setText(" Cargando");
        
        //Obtener el lugar seleccionado
        String place_f = select_place.getSelectedItem().toString();
        
        MapView map = new MapView();
        map.setPuntos(user.getPlace(), place_f, user.getId());
        map.setVisible(true);
        
    }//GEN-LAST:event_btn_calculateActionPerformed

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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calculate;
    private javax.swing.JButton btn_delete_account;
    private javax.swing.JButton btn_history_travel;
    private javax.swing.JButton btn_new_password;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField email_field;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_coordinate;
    private javax.swing.JLabel label_loading;
    private javax.swing.JLabel label_place;
    private javax.swing.JLabel label_salir;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JTextField name_field;
    private javax.swing.JTextField phone_field;
    private javax.swing.JComboBox<String> select_place;
    private javax.swing.JTextField user_field;
    // End of variables declaration//GEN-END:variables

    public void setUser(Usuario user){
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
    }
    
    private void logOut(){
         //Regresar a LogIn
        LogIn login = new LogIn();
        login.setVisible(true);
        System.out.println(" | > Log Out");
        
        this.dispose();
    }

}
