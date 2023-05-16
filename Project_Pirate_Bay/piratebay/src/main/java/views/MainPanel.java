package views;

import controllers.MainController;
import javax.swing.ImageIcon;

public class MainPanel extends javax.swing.JPanel implements IRestorableJPanel {

    public MainPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoImageLabel = new javax.swing.JLabel();
        welcomeImageLabel = new javax.swing.JLabel();
        rentButton = new javax.swing.JButton();
        titlesButton = new javax.swing.JButton();
        storeButton = new javax.swing.JButton();
        queryButton1 = new javax.swing.JButton();
        CustomerButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        logoImageLabel.setBackground(new java.awt.Color(255, 0, 0));
        logoImageLabel.setIcon(new ImageIcon("images/pirateBayLogo.png"));
        logoImageLabel.setToolTipText("");
        logoImageLabel.setMaximumSize(new java.awt.Dimension(100, 100));
        logoImageLabel.setMinimumSize(new java.awt.Dimension(100, 100));
        logoImageLabel.setPreferredSize(new java.awt.Dimension(100, 100));

        welcomeImageLabel.setIcon(new ImageIcon("images/pirateBayWelcome.png"));
        welcomeImageLabel.setMaximumSize(new java.awt.Dimension(300, 168));
        welcomeImageLabel.setMinimumSize(new java.awt.Dimension(300, 168));
        welcomeImageLabel.setPreferredSize(new java.awt.Dimension(300, 168));

        rentButton.setBackground(new java.awt.Color(0, 153, 153));
        rentButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        rentButton.setForeground(new java.awt.Color(204, 204, 204));
        rentButton.setText("Ενοικιάσεις");
        rentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentButtonActionPerformed(evt);
            }
        });

        titlesButton.setBackground(new java.awt.Color(0, 153, 153));
        titlesButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titlesButton.setForeground(new java.awt.Color(204, 204, 204));
        titlesButton.setText("Τίτλοι");
        titlesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titlesButtonActionPerformed(evt);
            }
        });

        storeButton.setBackground(new java.awt.Color(0, 153, 153));
        storeButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        storeButton.setForeground(new java.awt.Color(204, 204, 204));
        storeButton.setText("Καταστήματα");
        storeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeButtonActionPerformed(evt);
            }
        });

        queryButton1.setBackground(new java.awt.Color(153, 102, 0));
        queryButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        queryButton1.setForeground(new java.awt.Color(204, 204, 204));
        queryButton1.setText("Αναζήτηση");
        queryButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryButton1ActionPerformed(evt);
            }
        });

        CustomerButton.setBackground(new java.awt.Color(0, 153, 153));
        CustomerButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        CustomerButton.setForeground(new java.awt.Color(204, 204, 204));
        CustomerButton.setText("Πελάτες");
        CustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(queryButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(welcomeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(storeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(titlesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(titlesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(storeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(logoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(239, 239, 239)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(welcomeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queryButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerButtonActionPerformed
        MainController.getInstance().setPanel(CustomerPanel.class);
    }//GEN-LAST:event_CustomerButtonActionPerformed

    private void rentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentButtonActionPerformed
        MainController.getInstance().setPanel(RentPanel.class);
    }//GEN-LAST:event_rentButtonActionPerformed

    private void storeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeButtonActionPerformed
        MainController.getInstance().setPanel(StoresPanel.class);
    }//GEN-LAST:event_storeButtonActionPerformed

    private void titlesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titlesButtonActionPerformed
        MainController.getInstance().setPanel(TitlesPanel.class);
    }//GEN-LAST:event_titlesButtonActionPerformed

    private void queryButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryButton1ActionPerformed
        MainController.getInstance().setPanel(QueryPanel.class);
    }//GEN-LAST:event_queryButton1ActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerButton;
    private javax.swing.JLabel logoImageLabel;
    private javax.swing.JButton queryButton1;
    private javax.swing.JButton rentButton;
    private javax.swing.JButton storeButton;
    private javax.swing.JButton titlesButton;
    private javax.swing.JLabel welcomeImageLabel;
    // End of variables declaration//GEN-END:variables

 
}
