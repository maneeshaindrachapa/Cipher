/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

/**
 *
 * @author Maneesha
 */
public class CipherJFrame extends javax.swing.JFrame {

    public CipherJFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        encryptLogo = new javax.swing.JLabel();
        encryptTxt = new javax.swing.JLabel();
        encryptTB = new javax.swing.JTextField();
        encryptBtn = new javax.swing.JLabel();
        decryptLogo = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();
        devider = new javax.swing.JLabel();
        backgroundOverlay = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("noelan", 2, 36)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cipher/images/cipher.png"))); // NOI18N
        logo.setToolTipText("");
        logo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -50, 280, 140));

        encryptLogo.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        encryptLogo.setForeground(new java.awt.Color(255, 255, 255));
        encryptLogo.setText("Encrypt");
        getContentPane().add(encryptLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        encryptTxt.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        encryptTxt.setForeground(new java.awt.Color(255, 255, 255));
        encryptTxt.setText("Type The Text To Encrypt");
        getContentPane().add(encryptTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        encryptTB.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        getContentPane().add(encryptTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 400, -1));

        encryptBtn.setBackground(new java.awt.Color(255, 255, 255));
        encryptBtn.setFont(new java.awt.Font("Raleway", 0, 16)); // NOI18N
        encryptBtn.setForeground(new java.awt.Color(255, 153, 51));
        encryptBtn.setText("Encrypt");
        encryptBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encryptBtnMouseClicked(evt);
            }
        });
        getContentPane().add(encryptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, 20));

        decryptLogo.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        decryptLogo.setForeground(new java.awt.Color(255, 255, 255));
        decryptLogo.setText("Decrypt");
        getContentPane().add(decryptLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        exitBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cipher/images/wrong_pane1.png"))); // NOI18N
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        devider.setIcon(new javax.swing.ImageIcon("C:\\Users\\Maneesha\\Desktop\\devider.png")); // NOI18N
        devider.setMaximumSize(new java.awt.Dimension(100, 2048));
        getContentPane().add(devider, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 4, 390));

        backgroundOverlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cipher/images/overlay.png"))); // NOI18N
        getContentPane().add(backgroundOverlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 6, 860, 450));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cipher/images/why-it-departments-benefit-from-upgrading-to-snmpv3.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitBtnMouseClicked

    private void encryptBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encryptBtnMouseClicked
        String typedText=encryptTB.getText();
    }//GEN-LAST:event_encryptBtnMouseClicked

    
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
            java.util.logging.Logger.getLogger(CipherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CipherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CipherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CipherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CipherJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel backgroundOverlay;
    private javax.swing.JLabel decryptLogo;
    private javax.swing.JLabel devider;
    private javax.swing.JLabel encryptBtn;
    private javax.swing.JLabel encryptLogo;
    private javax.swing.JTextField encryptTB;
    private javax.swing.JLabel encryptTxt;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
