/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author angel
 */
public class view extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    public view() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        humo1 = new javax.swing.JLabel();
        humo2 = new javax.swing.JLabel();
        humo3 = new javax.swing.JLabel();
        humo4 = new javax.swing.JLabel();
        humo5 = new javax.swing.JLabel();
        humo6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/car3_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -270, -1, -1));

        humo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/humo.png"))); // NOI18N
        jPanel1.add(humo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        humo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/humo.png"))); // NOI18N
        jPanel1.add(humo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        humo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/humo.png"))); // NOI18N
        jPanel1.add(humo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        humo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/humo.png"))); // NOI18N
        jPanel1.add(humo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        humo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/humo.png"))); // NOI18N
        jPanel1.add(humo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        humo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/humo.png"))); // NOI18N
        jPanel1.add(humo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/car3_1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/emp1_1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 230, 160));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/float2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/float2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/box2.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 417, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel humo1;
    private javax.swing.JLabel humo2;
    private javax.swing.JLabel humo3;
    private javax.swing.JLabel humo4;
    private javax.swing.JLabel humo5;
    private javax.swing.JLabel humo6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}