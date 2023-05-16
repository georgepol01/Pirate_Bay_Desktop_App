package views;

import static db.Dblogin.*;
import controllers.MainController;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class TitlesPanel extends javax.swing.JPanel  implements IRestorableJPanel{

    public TitlesPanel() {
        initComponents();
        refreshMovieTable();
        refreshGameTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameScrollPane = new javax.swing.JScrollPane();
        gameTable = new javax.swing.JTable();
        logoImageLabel = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        titleTypeComboBox = new javax.swing.JComboBox<>();
        titleLabel = new javax.swing.JLabel();
        movieScrollPane = new javax.swing.JScrollPane();
        moviesTable = new javax.swing.JTable();
        movieScrollPane1 = new javax.swing.JScrollPane();
        gamesTable = new javax.swing.JTable();
        titleLabel1 = new javax.swing.JLabel();

        gameTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "GID", "Τίτλος", "Κονσόλα", "Genre", "Έτος", " Αξιολόγηση"
            }
        ));
        gameScrollPane.setViewportView(gameTable);

        logoImageLabel.setBackground(new java.awt.Color(255, 0, 0));
        logoImageLabel.setIcon(new ImageIcon("images/pirateBayLogo.png"));
        logoImageLabel.setToolTipText("");
        logoImageLabel.setMaximumSize(new java.awt.Dimension(100, 100));
        logoImageLabel.setMinimumSize(new java.awt.Dimension(100, 100));
        logoImageLabel.setPreferredSize(new java.awt.Dimension(100, 100));

        buttonPanel.setBackground(new java.awt.Color(0, 153, 153));
        buttonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton.setText("Προσθήκη");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editButton.setText("Επεξεργασία");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(102, 102, 102));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(204, 204, 204));
        backButton.setText("Πίσω");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        titleTypeComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ταινία", "Παιχνίδι" }));

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(9, Short.MAX_VALUE))
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(titleTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(titleTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setText("Πίνακας Ταινιών");

        moviesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ΜID", "Τίτλος", "Σκηνοθέτης", "Είδος", "Έτος", "Αξιολόγηση"
            }
        ));
        movieScrollPane.setViewportView(moviesTable);

        gamesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GID", "Τίτλος", "Κονσόλα", "Είδος", "Έτος", "Αξιολόγηση"
            }
        ));
        movieScrollPane1.setViewportView(gamesTable);

        titleLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel1.setText("Πίνακας Παιχνιδιών");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(movieScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                                    .addComponent(movieScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(titleLabel1)
                                .addGap(130, 130, 130)))
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(titleLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(titleLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(movieScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(titleLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(movieScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(logoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainController.getInstance().setPanel(MainPanel.class);
    }//GEN-LAST:event_backButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        String type = titleTypeComboBox.getSelectedItem().toString();
        if ("Ταινία".equals(type)){
                MovieSearchFrame addFrame = new MovieSearchFrame();
                addFrame.setVisible(true);
                addFrame.setLocationRelativeTo(null);
        }else if("Παιχνίδι".equals(type)){
                 GameSearchFrame addFrame = new GameSearchFrame();
                 addFrame.setVisible(true);
                 addFrame.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String type = titleTypeComboBox.getSelectedItem().toString();
        if ("Ταινία".equals(type)){
                MovieAddFrame addFrame = new MovieAddFrame();
                addFrame.setVisible(true);
                addFrame.setLocationRelativeTo(null);
        }else if("Παιχνίδι".equals(type)){
                 GameAddFrame addFrame = new GameAddFrame();
                 addFrame.setVisible(true);
                 addFrame.setLocationRelativeTo(null);
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

     public static void refreshMovieTable(){
                    DefaultTableModel model = (DefaultTableModel) TitlesPanel.moviesTable.getModel();
                    model.setRowCount(0);
                try {    
                            dbConnection = DriverManager.getConnection (url, username, passwd);
                            String searchString = "SELECT * FROM mtablerefresh()";
                            prst= dbConnection.prepareStatement(searchString);
                            rs = prst.executeQuery();
                            while(rs.next()){
                                    String tmid = String.valueOf(rs.getInt(1));
                                    String ttitle = rs.getString(2);
                                    String tdirector = rs.getString(3);
                                    String tgenre = rs.getString(4);
                                    String tyear = String.valueOf(rs.getInt(5));
                                    String trating = String.valueOf(rs.getFloat(6));

                                    String tbData [] = {tmid,ttitle,tdirector,tgenre,tyear,trating};
                                    model.addRow(tbData);
                             }
                            rs.close();
                            prst.close();
                        } catch(SQLException ex) {
                            System.out.println("\n -- SQL Exception --- \n");
                            while(ex != null) {
                                        System.out.println("Message: " + ex.getMessage());
                                        System.out.println("SQLState: " + ex.getSQLState());
                                        System.out.println("ErrorCode: " + ex.getErrorCode());
                                        ex = ex.getNextException();
                            }
                         }
        }
     
     public static void refreshGameTable(){
                    DefaultTableModel model = (DefaultTableModel) TitlesPanel.gamesTable.getModel();
                    model.setRowCount(0);
                try {    
                            dbConnection = DriverManager.getConnection (url, username, passwd);
                            String searchString = "SELECT * FROM gtablerefresh()";
                            prst= dbConnection.prepareStatement(searchString);
                            rs = prst.executeQuery();
                            while(rs.next()){
                                    String tgid = String.valueOf(rs.getInt("gid"));
                                    String ttitle = rs.getString("title");
                                    String tconsole = rs.getString("console");
                                    String tgenre = rs.getString("genre");
                                    String tyear = String.valueOf(rs.getInt("gyear"));
                                    String trating = String.valueOf(rs.getFloat("rating"));

                                    String tbData [] = {tgid,ttitle,tconsole,tgenre,tyear,trating};
                                    model.addRow(tbData);
                             }
                            rs.close();
                            prst.close();
                        } catch(SQLException ex) {
                            System.out.println("\n -- SQL Exception --- \n");
                            while(ex != null) {
                                        System.out.println("Message: " + ex.getMessage());
                                        System.out.println("SQLState: " + ex.getSQLState());
                                        System.out.println("ErrorCode: " + ex.getErrorCode());
                                        ex = ex.getNextException();
                            }
                         }
        }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane gameScrollPane;
    private javax.swing.JTable gameTable;
    public static javax.swing.JTable gamesTable;
    private javax.swing.JLabel logoImageLabel;
    private javax.swing.JScrollPane movieScrollPane;
    private javax.swing.JScrollPane movieScrollPane1;
    public static javax.swing.JTable moviesTable;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JComboBox<String> titleTypeComboBox;
    // End of variables declaration//GEN-END:variables
    

}
