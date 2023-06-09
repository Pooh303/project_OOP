
import java.awt.Color;
import javax.swing.JFrame;

public class REALMAIN extends javax.swing.JFrame {

    public REALMAIN() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        viewsetting.setEnabled(false);
        viewsetting.setVisible(false);
        set1.setEnabled(true);
        set1.setVisible(true);
        sell1.setEnabled(true);
        sell1.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        set2 = new javax.swing.JLabel();
        set1 = new javax.swing.JLabel();
        sell1 = new javax.swing.JLabel();
        sell2 = new javax.swing.JLabel();
        inv = new javax.swing.JLabel();
        report = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        viewsetting = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        set2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                set2MouseClicked(evt);
            }
        });
        getContentPane().add(set2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 70, 60));

        set1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                set1MouseClicked(evt);
            }
        });
        getContentPane().add(set1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 70, 60));

        sell1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sell1MouseClicked(evt);
            }
        });
        getContentPane().add(sell1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 190, 110));

        sell2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sell2MouseClicked(evt);
            }
        });
        getContentPane().add(sell2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 190, 110));

        inv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invMouseClicked(evt);
            }
        });
        getContentPane().add(inv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 300, 100));

        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
        });
        getContentPane().add(report, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 250, 100));

        jPanel2.setBackground(new java.awt.Color(255, 229, 202));
        jPanel2.setLayout(null);

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 60, 150, 40);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 10, 210, 40);

        viewsetting.setBackground(new java.awt.Color(255, 229, 202));
        viewsetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settingview.png"))); // NOI18N
        jPanel2.add(viewsetting);
        viewsetting.setBounds(0, 0, 230, 130);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 230, 130));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REALMAIN.png"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1400, 800));
        background.setMinimumSize(new java.awt.Dimension(1400, 800));
        background.setPreferredSize(new java.awt.Dimension(1400, 800));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        setSize(new java.awt.Dimension(1400, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void set1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_set1MouseClicked

        viewsetting.setEnabled(false);
        viewsetting.setVisible(false);
        set1.setEnabled(false);
        set1.setVisible(false);
        set2.setEnabled(true);
        set2.setVisible(true);

    }//GEN-LAST:event_set1MouseClicked

    private void set2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_set2MouseClicked
        viewsetting.setEnabled(true);
        viewsetting.setVisible(true);
        set1.setEnabled(true);
        set1.setVisible(true);
        set2.setEnabled(false);
        set2.setVisible(false);

    }//GEN-LAST:event_set2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new registerHandler();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void sell1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sell1MouseClicked
        sell1.setEnabled(false);
        sell1.setVisible(false);
        sell2.setEnabled(true);
        sell2.setVisible(true);
        SellerHandler sell = new SellerHandler();
        if (sell.getFr().isEnabled()) {

        } else {
            new SellerHandler();
        }

    }//GEN-LAST:event_sell1MouseClicked

    private void invMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invMouseClicked

        new WareHouseHandler();
    }//GEN-LAST:event_invMouseClicked

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
        new ReportsGUI();
    }//GEN-LAST:event_reportMouseClicked

    private void sell2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sell2MouseClicked
        sell2.setEnabled(false);
        sell2.setVisible(false);
        sell1.setEnabled(true);
        sell1.setVisible(true);
        SellerHandler sell = new SellerHandler();
        if (sell.getFr().isEnabled()) {
            sell.getFr().isVisible();

        } else {

        }

    }//GEN-LAST:event_sell2MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(REALMAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REALMAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REALMAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REALMAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REALMAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel inv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel report;
    private javax.swing.JLabel sell1;
    private javax.swing.JLabel sell2;
    private javax.swing.JLabel set1;
    private javax.swing.JLabel set2;
    private javax.swing.JLabel viewsetting;
    // End of variables declaration//GEN-END:variables
}
