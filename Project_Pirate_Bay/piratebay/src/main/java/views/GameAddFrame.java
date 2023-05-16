package views;

import static db.Dblogin.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static views.TitlesPanel.refreshGameTable;

public class GameAddFrame extends javax.swing.JFrame {

    public GameAddFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        logoImageLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        titleFieldAdd = new javax.swing.JTextField();
        yearFieldAdd = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        genreComboBoxAdd = new javax.swing.JComboBox<>();
        consoleComboBoxAdd = new javax.swing.JComboBox<>();
        ratingFieldAdd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        GIDFieldAdd = new javax.swing.JTextField();

        jTextField5.setBackground(new java.awt.Color(204, 255, 255));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Νέο Παιχνίδι");

        logoImageLabel.setBackground(new java.awt.Color(255, 0, 0));
        logoImageLabel.setIcon(new ImageIcon("images/pirateBayLogo.png"));
        logoImageLabel.setToolTipText("");
        logoImageLabel.setMaximumSize(new java.awt.Dimension(100, 100));
        logoImageLabel.setMinimumSize(new java.awt.Dimension(100, 100));
        logoImageLabel.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Τίτλος:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Κονσόλα:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Είδος:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Έτος:");

        titleFieldAdd.setBackground(new java.awt.Color(255, 255, 255));
        titleFieldAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titleFieldAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleFieldAddActionPerformed(evt);
            }
        });

        yearFieldAdd.setBackground(new java.awt.Color(255, 255, 255));
        yearFieldAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yearFieldAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldAddActionPerformed(evt);
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
        jLabel6.setText("Αξιολόγηση:");

        genreComboBoxAdd.setBackground(new java.awt.Color(255, 255, 255));
        genreComboBoxAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        genreComboBoxAdd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RPG", "ACTION", "FIGHTING", "RACING" }));
        genreComboBoxAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreComboBoxAddActionPerformed(evt);
            }
        });

        consoleComboBoxAdd.setBackground(new java.awt.Color(255, 255, 255));
        consoleComboBoxAdd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PC", "PS4", "PS5", "XBOX" }));

        ratingFieldAdd.setBackground(new java.awt.Color(255, 255, 255));
        ratingFieldAdd.setText("0..0-10");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("ID:");

        GIDFieldAdd.setBackground(new java.awt.Color(255, 255, 255));
        GIDFieldAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ratingFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(genreComboBoxAdd, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                .addComponent(yearFieldAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(consoleComboBoxAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GIDFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GIDFieldAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleFieldAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(consoleComboBoxAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genreComboBoxAdd))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(yearFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ratingFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleFieldAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleFieldAddActionPerformed

    }//GEN-LAST:event_titleFieldAddActionPerformed

    private void yearFieldAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFieldAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFieldAddActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        int gid = Integer.valueOf(GIDFieldAdd.getText());
        String title = String.valueOf(titleFieldAdd.getText());
        String genre = String.valueOf(genreComboBoxAdd.getSelectedItem().toString());
        String console = String.valueOf(consoleComboBoxAdd.getSelectedItem().toString());
        int year = Integer.valueOf(yearFieldAdd.getText());
        float rating = Float.valueOf(ratingFieldAdd.getText());
        String ptype = "game";
        try {
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT productadd(?,?)";
            prst = dbConnection.prepareStatement(insertString);
        
            prst.setInt(1, gid);
            prst.setString(2, ptype);
            prst.executeQuery();
            prst.close();
            dbConnection.close();
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
                        System.out.println("Message: " + ex.getMessage());
                        System.out.println("SQLState: " + ex.getSQLState());
                        System.out.println("ErrorCode: " + ex.getErrorCode());
                    showMessageDialog(this, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                    ex = ex.getNextException();
            }
        }
        
        try {
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT gameadd(?, ?, ?, ?, ?, ?)";
            prst = dbConnection.prepareStatement(insertString);
        
            prst.setInt(1, gid);
            prst.setString(2, title);
            prst.setString(3, console);
            prst.setString(4, genre);
            prst.setInt(5, year);
            prst.setFloat(6, rating);
            prst.executeQuery();
            showMessageDialog(null, "Η Δημιουργία ολοκληρώθηκε!" + "");
            prst.close();
            dbConnection.close();
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
                        System.out.println("Message: " + ex.getMessage());
                        System.out.println("SQLState: " + ex.getSQLState());
                        System.out.println("ErrorCode: " + ex.getErrorCode());
                    showMessageDialog(this, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                    ex = ex.getNextException();
            }
        }
        refreshGameTable();
        dispose();
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void genreComboBoxAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreComboBoxAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreComboBoxAddActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameAddFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GIDFieldAdd;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JComboBox<String> consoleComboBoxAdd;
    private javax.swing.JComboBox<String> genreComboBoxAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel logoImageLabel;
    private javax.swing.JTextField ratingFieldAdd;
    private javax.swing.JTextField titleFieldAdd;
    private javax.swing.JTextField yearFieldAdd;
    // End of variables declaration//GEN-END:variables
}
