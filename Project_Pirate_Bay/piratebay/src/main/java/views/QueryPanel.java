package views;

import static db.Dblogin.*;
import controllers.MainController;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class QueryPanel extends javax.swing.JPanel  implements IRestorableJPanel{

    public QueryPanel() {
        initComponents();
        variableLabel1.setVisible(false);
        variableLabel2.setVisible(false);
        answearComboBox.setVisible(false);
        variableField1.setVisible(false);
        labelans.setVisible(false);
    }

    private String question;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoImageLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        questionComboBox = new javax.swing.JComboBox<>();
        variableLabel1 = new javax.swing.JLabel();
        variableField1 = new javax.swing.JTextField();
        answerButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        answearTable = new javax.swing.JTable();
        labelans = new javax.swing.JLabel();
        answearComboBox = new javax.swing.JComboBox<>();
        variableLabel2 = new javax.swing.JLabel();

        logoImageLabel.setBackground(new java.awt.Color(255, 0, 0));
        logoImageLabel.setIcon(new ImageIcon("images/pirateBayLogo.png"));
        logoImageLabel.setToolTipText("");
        logoImageLabel.setMaximumSize(new java.awt.Dimension(100, 100));
        logoImageLabel.setMinimumSize(new java.awt.Dimension(100, 100));
        logoImageLabel.setPreferredSize(new java.awt.Dimension(100, 100));

        backButton.setBackground(new java.awt.Color(102, 102, 102));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(204, 204, 204));
        backButton.setText("Πίσω");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Αναζήτηση στην Βάση");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Επιλέξτε ένα ερώτημα:");

        questionComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        questionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ερώτημα 1", "Ερώτημα 2", "Ερώτημα 3", "Ερώτημα 4", "Ερώτημα 5", "Ερώτημα 6", "Ερώτημα 7", "Ερώτημα 8", "Ερώτημα 9", "Ερώτημα 10" }));
        questionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionComboBoxActionPerformed(evt);
            }
        });

        variableLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        variableLabel1.setText("Variable 1:");

        answerButton.setBackground(new java.awt.Color(153, 102, 0));
        answerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        answerButton.setForeground(new java.awt.Color(204, 204, 204));
        answerButton.setText("Εφαρμογή");
        answerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButtonActionPerformed(evt);
            }
        });

        answearTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        answearTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        answearTable.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(answearTable);
        answearTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        labelans.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        variableLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        variableLabel2.setText("Variable 2:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(questionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelans, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(252, 252, 252)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(variableLabel2)
                                .addComponent(variableLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(variableField1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(answearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(154, 154, 154)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(answerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(questionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addComponent(labelans, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(variableField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(variableLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(variableLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainController.getInstance().setPanel(MainPanel.class);
    }//GEN-LAST:event_backButtonActionPerformed

    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButtonActionPerformed
        if (null != question)switch (question) {
            case "Ερώτημα 1":{
                q1func();
                    break;
                }
            case "Ερώτημα 2":{
                q2func();
                    break;
                }
            case "Ερώτημα 3":{
                q3func();
                    break;
                }
            case "Ερώτημα 4":{
                q4func();
                    break;
                }
            case "Ερώτημα 5":{
                q5func();
                    break;
                }
            case "Ερώτημα 6":{
                q6func();
                    break;
                }
            case "Ερώτημα 7":{
                q7func();
                    break;
                }
            case "Ερώτημα 8":{
                q8func();
                    break;
                }
            case "Ερώτημα 9":{
                q9func();
                    break;
                }
            case "Ερώτημα 10":{
                q10func();
                    break;
                }
       
        }
    }//GEN-LAST:event_answerButtonActionPerformed

    private void questionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionComboBoxActionPerformed
          question = questionComboBox.getSelectedItem().toString();
          DefaultTableModel model = (DefaultTableModel) QueryPanel.answearTable.getModel();
          
        if (null != question)switch (question) {
            
            case "Ερώτημα 1":{
                model.setColumnCount(0);
                model.setRowCount(0);
                variableLabel2.setVisible(false);
                answearComboBox.setVisible(false);
                variableLabel1.setVisible(true);
                variableField1.setVisible(true);
                variableField1.setText("");
                labelans.setVisible(true);
                labelans.setText(" Βρες πελάτη βάση ονόματος.");
                String item1 = "Όνομα";
                variableLabel1.setText(item1 + " :");
                    break;
                }
            case "Ερώτημα 2":{
                model.setColumnCount(0);
                model.setRowCount(0);
                variableLabel2.setVisible(false);
                answearComboBox.setVisible(false);
                variableLabel1.setVisible(true);
                variableField1.setVisible(true);
                variableField1.setText("");
                labelans.setVisible(true);
                labelans.setText(" Βρες ταινίες βάση ονόματος.");
                String item1 = "Όνομα";
                variableLabel1.setText(item1 + " :");
                    break;
                }
            case "Ερώτημα 3":{
                answearComboBox.removeAllItems();
                model.setColumnCount(0);
                model.setRowCount(0);
                variableLabel2.setVisible(true);
                answearComboBox.setVisible(true);
                variableLabel1.setVisible(false);
                variableField1.setVisible(false);
                labelans.setVisible(true);
                labelans.setText(" Βρες παιχνίδια βάση είδους.");
                String item1 = "Είδος";
                variableLabel2.setText(item1 + " :");
                comboBoxCreate();
                    break;
                }
            case "Ερώτημα 4":{
                model.setColumnCount(0);
                model.setRowCount(0);
                variableLabel2.setVisible(false);
                answearComboBox.setVisible(false);
                variableLabel1.setVisible(false);
                variableField1.setVisible(false);
                labelans.setVisible(true);
                labelans.setText(" Βρες πόσες είναι όλες οι ενοικιάσεις.");
                    break;
                }
            case "Ερώτημα 5":{
                model.setColumnCount(0);
                model.setRowCount(0);
                variableLabel2.setVisible(false);
                answearComboBox.setVisible(false);
                variableLabel1.setVisible(false);
                variableField1.setVisible(false);
                labelans.setVisible(true);
                labelans.setText(" Βρες τις συνολικές ενοικιάσεις του κάθε καταστήματος.");
                    break;
                }
            case "Ερώτημα 6":{
                model.setColumnCount(0);
                model.setRowCount(0);
                variableLabel2.setVisible(false);
                answearComboBox.setVisible(false);
                variableLabel1.setVisible(false);
                variableField1.setVisible(false);
                variableField1.setText("");
                labelans.setVisible(true);
                labelans.setText(" Βρες ταινίες με βαθμολογία μεγαλύτερη του 5.");
                String item1 = "Βαθμολογία";
                variableLabel1.setText(item1 + " :");
                    break;
                }
            case "Ερώτημα 7":{
                model.setColumnCount(0);
                model.setRowCount(0);
                variableLabel2.setVisible(false);
                answearComboBox.setVisible(false);
                variableLabel1.setVisible(true);
                variableField1.setVisible(true);
                variableField1.setText("");
                labelans.setVisible(true);
                labelans.setText(" Πόσες ενοικίασεις έγιναν βάση έτους.");
                String item1 = "΄Έτος";
                variableLabel1.setText(item1 + " :");
                    break;
                }
            case "Ερώτημα 8":{
                answearComboBox.removeAllItems();
                model.setColumnCount(0);
                model.setRowCount(0);
                variableLabel2.setVisible(true);
                answearComboBox.setVisible(true);
                variableLabel1.setVisible(false);
                variableField1.setVisible(false);
                labelans.setVisible(true);
                labelans.setText(" Βρες παιχνίδια βάση κονσόλας.");
                String item1 = "Console";
                variableLabel1.setText(item1 + " :");
                comboBoxCreate2();
                    break;
                }
            case "Ερώτημα 9":{
                model.setColumnCount(0);
                model.setRowCount(0);
                variableLabel2.setVisible(false);
                answearComboBox.setVisible(false);
                variableLabel1.setVisible(false);
                variableField1.setVisible(false);
                labelans.setVisible(true);
                labelans.setText(" Βρες ποιά Video Club δεν έχουν καμία ενοικίαση.");
                    break;
                }
            case "Ερώτημα 10":{
                model.setColumnCount(0);
                model.setRowCount(0);
                variableLabel2.setVisible(false);
                answearComboBox.setVisible(false);
                variableLabel1.setVisible(false);
                variableField1.setVisible(false);
                labelans.setVisible(true);
                labelans.setText(" Βρες ποίοι πελάτες έχουν περισσότερες από μία ενοικιάσεις.");
                    break;
                }
        }
    }//GEN-LAST:event_questionComboBoxActionPerformed
    
    public void q1func(){
         DefaultTableModel model = (DefaultTableModel) QueryPanel.answearTable.getModel();
         model.setColumnCount(0);
         model.setRowCount(0);
         String name =String.valueOf(variableField1.getText());
         model.addColumn("ID");
         model.addColumn("Όνομα");
         model.addColumn("Διεύθυνση");
         model.addColumn("Τηλέφωνο");
         
           try{
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT * FROM question1(?)";
            prst = dbConnection.prepareStatement(insertString);
            prst.setString(1,name);
            rs = prst.executeQuery();
             while(rs.next()){
                                    String tcid = String.valueOf(rs.getInt(1));
                                    String tname = rs.getString(2);
                                    String taddress = rs.getString(3);
                                    String tphone = rs.getString(4);
                                    

                                    String tbData [] = {tcid,tname,taddress,tphone};
                                    model.addRow(tbData);
                             }
             rs.close();
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
    }
    
     public void q2func(){
         DefaultTableModel model = (DefaultTableModel) QueryPanel.answearTable.getModel();
         model.setColumnCount(0);
         model.setRowCount(0);
         String name =String.valueOf(variableField1.getText());
         model.addColumn("ID");
         model.addColumn("Τίτλος");
         model.addColumn("Σκηνοθέτης");
         model.addColumn("Είδος");
         model.addColumn("Χρονολογία");
         model.addColumn("Βαθμολογία");
           try{
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT * FROM question2(?)";
            prst = dbConnection.prepareStatement(insertString);
            
            prst.setString(1,name);
            rs = prst.executeQuery();
             while(rs.next()){
                                    String tmid = String.valueOf(rs.getInt(1));
                                    String ttile = rs.getString(2);
                                    String tdirector = rs.getString(3);
                                    String tgenre = rs.getString(4);
                                    String tyear = String.valueOf(rs.getInt(5));
                                    String trating = String.valueOf(rs.getFloat(6));
                                    
                                    String tbData [] = {tmid,ttile,tdirector,tgenre,tyear,trating};
                                    model.addRow(tbData);
                             }
             rs.close();
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
    }
       
      public void q3func(){
         DefaultTableModel model = (DefaultTableModel) QueryPanel.answearTable.getModel();
         model.setColumnCount(0);
         model.setRowCount(0);
         String name = String.valueOf(answearComboBox.getSelectedItem());
         model.addColumn("ID");
         model.addColumn("Τίτλος");
         model.addColumn("Κονσόλα");
         model.addColumn("Είδος");
         model.addColumn("Χρονολογία");
         model.addColumn("Βαθμολογία");
           try{
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT * FROM question3(?)";
            prst = dbConnection.prepareStatement(insertString);
            
            prst.setString(1,name);
            rs = prst.executeQuery();
             while(rs.next()){
                                    String tgid = String.valueOf(rs.getInt(1));
                                    String tname = rs.getString(2);
                                    String tconsole = rs.getString(3);
                                    String tgenre = rs.getString(4);
                                    String tyear = rs.getString(5);
                                    String trating = rs.getString(6);
                                    

                                    String tbData [] = {tgid,tname,tconsole,tgenre,tyear,trating};
                                    model.addRow(tbData);
                             }
             rs.close();
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
    }
      
       public void q4func(){
         DefaultTableModel model = (DefaultTableModel) QueryPanel.answearTable.getModel();
         model.setColumnCount(0);
         model.setRowCount(0);
         model.addColumn("Σύνολο");
           try{
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT * FROM question4()";
            prst = dbConnection.prepareStatement(insertString);
            rs = prst.executeQuery();
             while(rs.next()){
                                    String num = String.valueOf(rs.getInt(1));
                                  
                                    String tbData [] = {num};
                                    model.addRow(tbData);
                             }
             rs.close();
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
    }
       
        public void q5func(){
         DefaultTableModel model = (DefaultTableModel) QueryPanel.answearTable.getModel();
         model.setColumnCount(0);
         model.setRowCount(0);
         model.addColumn("Ενοικιάσεις");
         model.addColumn("Video_Clubs");
         
           try{
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT * FROM question5()";
            prst = dbConnection.prepareStatement(insertString);
            rs = prst.executeQuery();
             while(rs.next()){
                                    String num = String.valueOf(rs.getInt(1));
                                    String clubs = rs.getString(2);
                                  
                                    String tbData [] = {num,clubs};
                                    model.addRow(tbData);
                             }
             rs.close();
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
    }
        
         public void q6func(){
          DefaultTableModel model = (DefaultTableModel) QueryPanel.answearTable.getModel();
         model.setColumnCount(0);
         model.setRowCount(0);
         model.addColumn("ID");
         model.addColumn("Τίτλος");
         model.addColumn("Σκηνοθέτης");
         model.addColumn("Είδος");
         model.addColumn("Χρονολογία");
         model.addColumn("Βαθμολογία");
           try{
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT * FROM question6()";
            prst = dbConnection.prepareStatement(insertString);
            
            rs = prst.executeQuery();
             while(rs.next()){
                                    String tmid = String.valueOf(rs.getInt(1));
                                    String ttile = rs.getString(2);
                                    String tdirector = rs.getString(3);
                                    String tgenre = rs.getString(4);
                                    String tyear = String.valueOf(rs.getInt(5));
                                    String trating = String.valueOf(rs.getFloat(6));
                                    
                                    String tbData [] = {tmid,ttile,tdirector,tgenre,tyear,trating};
                                    model.addRow(tbData);
                             }
             rs.close();
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
    }
         
          public void q7func(){
         DefaultTableModel model = (DefaultTableModel) QueryPanel.answearTable.getModel();
         model.setColumnCount(0);
         model.setRowCount(0);
         model.addColumn("Σύνολο");
         int year =Integer.valueOf(variableField1.getText());
           try{
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT * FROM question7(?)";
            prst = dbConnection.prepareStatement(insertString);
            
            prst.setInt(1,year);
            rs = prst.executeQuery();
             while(rs.next()){
                                    String totals = String.valueOf(rs.getInt(1));

                                    String tbData [] = {totals};
                                    model.addRow(tbData);
                             }
             rs.close();
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
    }
          
           public void q8func(){
          DefaultTableModel model = (DefaultTableModel) QueryPanel.answearTable.getModel();
         model.setColumnCount(0);
         model.setRowCount(0);
         String name = String.valueOf(answearComboBox.getSelectedItem());
         model.addColumn("ID");
         model.addColumn("Τίτλος");
         model.addColumn("Κονσόλα");
         model.addColumn("Είδος");
         model.addColumn("Χρονολογία");
         model.addColumn("Βαθμολογία");
           try{
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT * FROM question8(?)";
            prst = dbConnection.prepareStatement(insertString);
            
            prst.setString(1,name);
            rs = prst.executeQuery();
             while(rs.next()){
                                    String tgid = String.valueOf(rs.getInt(1));
                                    String tname = rs.getString(2);
                                    String tconsole = rs.getString(3);
                                    String tgenre = rs.getString(4);
                                    String tyear = rs.getString(5);
                                    String trating = rs.getString(6);
                                    

                                    String tbData [] = {tgid,tname,tconsole,tgenre,tyear,trating};
                                    model.addRow(tbData);
                             }
             rs.close();
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
    }
           
            public void q9func(){
         DefaultTableModel model = (DefaultTableModel) QueryPanel.answearTable.getModel();
         model.setColumnCount(0);
         model.setRowCount(0);
          model.addColumn("Video Clubs");
           try{
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT * FROM question9()";
            prst = dbConnection.prepareStatement(insertString);
            
            rs = prst.executeQuery();
             while(rs.next()){
                                    String clubs = rs.getString(1);

                                    String tbData [] = {clubs};
                                    model.addRow(tbData);
                             }
             rs.close();
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
    }
             public void q10func(){
         DefaultTableModel model = (DefaultTableModel) QueryPanel.answearTable.getModel();
         model.setColumnCount(0);
         model.setRowCount(0);
         model.addColumn("Πελάτες");
           try{
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT * FROM question10()";
            prst = dbConnection.prepareStatement(insertString);
            
            rs = prst.executeQuery();
             while(rs.next()){
                                    String custs = rs.getString(1);

                                    String tbData [] = {custs};
                                    model.addRow(tbData);
                             }
             rs.close();
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
    }
             public void comboBoxCreate(){
            try{
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT combo()";
            prst = dbConnection.prepareStatement(insertString);
            rs = prst.executeQuery();
             while(rs.next()){
                                    answearComboBox.addItem(rs.getString(1));
                             }
             rs.close();
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
        }
             
             public void comboBoxCreate2(){
            try{
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String insertString = "SELECT combo2()";
            prst = dbConnection.prepareStatement(insertString);
            rs = prst.executeQuery();
             while(rs.next()){
                                    answearComboBox.addItem(rs.getString(1));
                             }
             rs.close();
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
        }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> answearComboBox;
    public static javax.swing.JTable answearTable;
    private javax.swing.JButton answerButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelans;
    private javax.swing.JLabel logoImageLabel;
    private javax.swing.JComboBox<String> questionComboBox;
    private javax.swing.JTextField variableField1;
    private javax.swing.JLabel variableLabel1;
    private javax.swing.JLabel variableLabel2;
    // End of variables declaration//GEN-END:variables
}
