package views;

import static db.Dblogin.*;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static views.CustomerPanel.refreshCustomerTable;

public class CustomerAddFrame extends javax.swing.JFrame {

    public CustomerAddFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        logoImageLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cidFieldCustomerAdd = new javax.swing.JTextField();
        addressFieldCustomerAdd = new javax.swing.JTextField();
        nameFieldCustomerAdd = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        phoneFieldCustomerAdd = new javax.swing.JTextField();

        jTextField5.setBackground(new java.awt.Color(204, 255, 255));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Νέος Πελάτης");

        logoImageLabel.setBackground(new java.awt.Color(255, 0, 0));
        logoImageLabel.setIcon(new ImageIcon("images/pirateBayLogo.png"));
        logoImageLabel.setToolTipText("");
        logoImageLabel.setMaximumSize(new java.awt.Dimension(100, 100));
        logoImageLabel.setMinimumSize(new java.awt.Dimension(100, 100));
        logoImageLabel.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Όνομα:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Δίευθυνση:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Τηλέφωνο:");

        cidFieldCustomerAdd.setBackground(new java.awt.Color(255, 255, 255));
        cidFieldCustomerAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cidFieldCustomerAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidFieldCustomerAddActionPerformed(evt);
            }
        });

        addressFieldCustomerAdd.setBackground(new java.awt.Color(255, 255, 255));
        addressFieldCustomerAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressFieldCustomerAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldCustomerAddActionPerformed(evt);
            }
        });

        nameFieldCustomerAdd.setBackground(new java.awt.Color(255, 255, 255));
        nameFieldCustomerAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameFieldCustomerAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldCustomerAddActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 102, 102));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cancelButton.setText("Ακύρωση");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        confirmButton.setBackground(new java.awt.Color(153, 255, 153));
        confirmButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        confirmButton.setText("Προσθήκη");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("ID:");

        phoneFieldCustomerAdd.setBackground(new java.awt.Color(255, 255, 255));
        phoneFieldCustomerAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cidFieldCustomerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneFieldCustomerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressFieldCustomerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameFieldCustomerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidFieldCustomerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameFieldCustomerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(addressFieldCustomerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneFieldCustomerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cidFieldCustomerAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidFieldCustomerAddActionPerformed

    }//GEN-LAST:event_cidFieldCustomerAddActionPerformed

    private void addressFieldCustomerAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldCustomerAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldCustomerAddActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void nameFieldCustomerAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldCustomerAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldCustomerAddActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        int cid =Integer.valueOf(cidFieldCustomerAdd.getText());
        String name =String.valueOf(nameFieldCustomerAdd.getText());
        String address =String.valueOf(addressFieldCustomerAdd.getText());
        String phone =String.valueOf(phoneFieldCustomerAdd.getText());
        try{
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT customeradd(?, ?, ?, ?)";
            prst = dbConnection.prepareStatement(insertString);
            
            prst.setInt(1,cid);
            prst.setString(2,name);
            prst.setString(3,address);
            prst.setString(4,phone);
            prst.executeQuery();
            showMessageDialog(null, "Η Δημιουργία ολοκληρώθηκε!" + "");
            prst.close();
            dbConnection.close();
        }catch(SQLException ex){
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
                        System.out.println("Message: " + ex.getMessage());
                        System.out.println("SQLState: " + ex.getSQLState());
                        System.out.println("ErrorCode: " + ex.getErrorCode());
                        showMessageDialog(this, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                        ex = ex.getNextException();
            }
        }
        refreshCustomerTable();
        dispose();
    }//GEN-LAST:event_confirmButtonActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerAddFrame().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressFieldCustomerAdd;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cidFieldCustomerAdd;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel logoImageLabel;
    private javax.swing.JTextField nameFieldCustomerAdd;
    private javax.swing.JTextField phoneFieldCustomerAdd;
    // End of variables declaration//GEN-END:variables
}
