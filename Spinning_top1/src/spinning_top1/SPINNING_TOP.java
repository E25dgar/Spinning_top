/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spinning_top1;

/**
 *
 * @author Andres
 */
public class SPINNING_TOP extends javax.swing.JFrame {

    /**
     * Creates new form SPINNING_TOP
     */
    public SPINNING_TOP() {
        initComponents();
        setLocationRelativeTo(null);
        
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbljugador1 = new javax.swing.JLabel();
        lbljugador2 = new javax.swing.JLabel();
        lbljugador3 = new javax.swing.JLabel();
        lbljugador4 = new javax.swing.JLabel();
        txtplayer1 = new javax.swing.JTextField();
        txtplayer2 = new javax.swing.JTextField();
        txtplayer3 = new javax.swing.JTextField();
        txtplayer4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnPlay = new javax.swing.JButton();
        cbxplayer = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btnSpin = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        lbljugadores = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("SAVDFB"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spinning_top1/Aperinola.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spinning_top1/Aperinola.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spinning_top1/Aperinola.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Play zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("?");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(140, 160, 100, 100);

        lbljugador1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbljugador1.setText("Player1");
        jPanel2.add(lbljugador1);
        lbljugador1.setBounds(180, 37, 60, 30);

        lbljugador2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbljugador2.setText("Player2");
        jPanel2.add(lbljugador2);
        lbljugador2.setBounds(280, 140, 60, 30);

        lbljugador3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbljugador3.setText("Player3");
        jPanel2.add(lbljugador3);
        lbljugador3.setBounds(170, 270, 60, 30);

        lbljugador4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbljugador4.setText("Player4");
        jPanel2.add(lbljugador4);
        lbljugador4.setBounds(30, 150, 60, 17);

        txtplayer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtplayer1);
        txtplayer1.setBounds(160, 90, 80, 40);

        txtplayer2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtplayer2);
        txtplayer2.setBounds(270, 190, 80, 40);

        txtplayer3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtplayer3);
        txtplayer3.setBounds(160, 320, 70, 40);

        txtplayer4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtplayer4);
        txtplayer4.setBounds(20, 190, 80, 40);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Coins");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(180, 70, 41, 16);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Coins");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(290, 170, 40, 16);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Coins");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(170, 300, 41, 16);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Coins");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(30, 170, 48, 16);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 50, 370, 380);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Config zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        btnPlay.setBackground(new java.awt.Color(0, 204, 102));
        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        jPanel4.add(btnPlay);
        btnPlay.setBounds(50, 100, 90, 30);

        cbxplayer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "20", "30" }));
        jPanel4.add(cbxplayer);
        cbxplayer.setBounds(190, 30, 110, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Coins per player:");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(40, 30, 120, 30);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Acumulated", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel6.setOpaque(false);
        jPanel6.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("?");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(90, 30, 94, 53);

        jPanel4.add(jPanel6);
        jPanel6.setBounds(40, 150, 260, 100);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Winner", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel9.setOpaque(false);
        jPanel9.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("0");
        jPanel9.add(jLabel14);
        jLabel14.setBounds(90, 20, 101, 69);

        jPanel4.add(jPanel9);
        jPanel9.setBounds(10, 280, 270, 0);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null, null), "Winner", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 18))); // NOI18N
        jPanel11.setOpaque(false);
        jPanel11.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("0");
        jPanel11.add(jLabel21);
        jLabel21.setBounds(100, 40, 64, 37);

        jPanel4.add(jPanel11);
        jPanel11.setBounds(40, 270, 260, 100);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(430, 50, 340, 380);

        btnSpin.setBackground(new java.awt.Color(255, 0, 0));
        btnSpin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSpin.setText("Spin around ->");
        btnSpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpinActionPerformed(evt);
            }
        });
        jPanel1.add(btnSpin);
        btnSpin.setBounds(20, 450, 370, 40);

        btnRestart.setBackground(new java.awt.Color(0, 153, 255));
        btnRestart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRestart.setText("REINICIAR JUEGO");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestart);
        btnRestart.setBounds(430, 450, 340, 40);

        lbljugadores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbljugadores.setText(".....");
        jPanel1.add(lbljugadores);
        lbljugadores.setBounds(40, 510, 220, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spinning_top1/Aperinola.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // TODO add your handling code here:
        String Coins_per_player = "";
        Coins_per_player= Coins_per_player+cbxplayer.getSelectedItem().toString();
        txtplayer1.setText("" + Coins_per_player);
        txtplayer2.setText("" + Coins_per_player);
        txtplayer3.setText("" + Coins_per_player);
        txtplayer4.setText("" + Coins_per_player);

    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnSpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpinActionPerformed
        // TODO add your handling code here:

        lbljugadores.setText("" +lbljugador1);

    }//GEN-LAST:event_btnSpinActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        // TODO add your handling code here:

        txtplayer1.setText("0");
        txtplayer2.setText("0");
        txtplayer3.setText("0");
        txtplayer4.setText("0");

    }//GEN-LAST:event_btnRestartActionPerformed

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
            java.util.logging.Logger.getLogger(SPINNING_TOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SPINNING_TOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPINNING_TOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPINNING_TOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SPINNING_TOP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnSpin;
    private javax.swing.JComboBox<String> cbxplayer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbljugador1;
    private javax.swing.JLabel lbljugador2;
    private javax.swing.JLabel lbljugador3;
    private javax.swing.JLabel lbljugador4;
    private javax.swing.JLabel lbljugadores;
    private javax.swing.JTextField txtplayer1;
    private javax.swing.JTextField txtplayer2;
    private javax.swing.JTextField txtplayer3;
    private javax.swing.JTextField txtplayer4;
    // End of variables declaration//GEN-END:variables
}
