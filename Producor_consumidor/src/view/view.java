/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import logica.Consumidor;
import logica.Gestor;
import logica.Productor;
import javax.swing.JLabel;

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
         ghost();
    }
    
    public void ghost () 
    {
        car1.setVisible(false);
        car2.setVisible(false);
        car3.setVisible(false);
        car4.setVisible(false);
      
        box1.setVisible(false);
        box2.setVisible(false);
        box3.setVisible(false);
        box4.setVisible(false);
    
        errorP.setVisible(false);
       
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
        car1 = new javax.swing.JLabel();
        car2 = new javax.swing.JLabel();
        car3 = new javax.swing.JLabel();
        car4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        box4 = new javax.swing.JLabel();
        box1 = new javax.swing.JLabel();
        box2 = new javax.swing.JLabel();
        box3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tex1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        canP = new javax.swing.JTextField();
        errorP = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tex2 = new javax.swing.JLabel();
        con_P = new javax.swing.JLabel();
        cont_cons = new javax.swing.JLabel();
        S1 = new javax.swing.JLabel();
        S2 = new javax.swing.JLabel();
        S3 = new javax.swing.JLabel();
        S4 = new javax.swing.JLabel();
        S5 = new javax.swing.JLabel();
        S6 = new javax.swing.JLabel();

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

        car1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/car3_1.png"))); // NOI18N
        jPanel1.add(car1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        car2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/car3_1.png"))); // NOI18N
        jPanel1.add(car2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        car3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/car3_1.png"))); // NOI18N
        jPanel1.add(car3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        car4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/car3_1.png"))); // NOI18N
        jPanel1.add(car4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/sky2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/emp1_1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 230, 160));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/float3_1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/float2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        box4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/box2.png"))); // NOI18N
        jPanel1.add(box4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        box1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/box2.png"))); // NOI18N
        jPanel1.add(box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        box2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/box2.png"))); // NOI18N
        jPanel1.add(box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        box3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/box2.png"))); // NOI18N
        jPanel1.add(box3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/float2.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, 100));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/sky2.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 200, -1));

        tex1.setText("cantida de producto a produccir");

        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        canP.setText("0");
        canP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canPActionPerformed(evt);
            }
        });

        errorP.setText("Error no puder ser menor a  0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(canP, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(errorP, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tex1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(tex1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(34, 34, 34)
                .addComponent(errorP)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tex2.setText("cantidad a consumir ");
        jPanel3.add(tex2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 119, -1));

        con_P.setText("0");
        jPanel3.add(con_P, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 21, -1));

        cont_cons.setText("0");
        jPanel3.add(cont_cons, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 21, -1));

        S1.setText(".");
        jPanel3.add(S1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 110, 20));

        S2.setText(".");
        jPanel3.add(S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, 20));

        S3.setText(".");
        jPanel3.add(S3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 110, 20));

        S4.setText(".");
        jPanel3.add(S4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 110, 20));

        S5.setText(".");
        jPanel3.add(S5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 110, 20));

        S6.setText(".");
        jPanel3.add(S6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 110, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(89, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int cantidadP;
       cantidadP = Integer.parseInt(canP.getText());
      // cantidadC = Integer.parseInt(canC.getText());
         if (cantidadP <= 0  )
       {
         errorP.setVisible(true);
       } else {
             
        errorP.setVisible(false); 
        Consumidor con = new Consumidor(car1,car2,car3,car4,con_P,S4,S5,S6,cantidadP);/**/
        Productor pro = new Productor(box1,box2,box3,box4,S1,S2,S3,cantidadP);//,
        Gestor ges = new Gestor(pro,con, cantidadP);
         
      
         }
       
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void canPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canPActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_canPActionPerformed

    
    
    
    
    
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
    private javax.swing.JLabel S1;
    private javax.swing.JLabel S2;
    private javax.swing.JLabel S3;
    private javax.swing.JLabel S4;
    private javax.swing.JLabel S5;
    private javax.swing.JLabel S6;
    private javax.swing.JLabel box1;
    private javax.swing.JLabel box2;
    private javax.swing.JLabel box3;
    private javax.swing.JLabel box4;
    private javax.swing.JTextField canP;
    private javax.swing.JLabel car1;
    private javax.swing.JLabel car2;
    private javax.swing.JLabel car3;
    private javax.swing.JLabel car4;
    private javax.swing.JLabel con_P;
    private javax.swing.JLabel cont_cons;
    private javax.swing.JLabel errorP;
    private javax.swing.JLabel humo1;
    private javax.swing.JLabel humo2;
    private javax.swing.JLabel humo3;
    private javax.swing.JLabel humo4;
    private javax.swing.JLabel humo5;
    private javax.swing.JLabel humo6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel tex1;
    private javax.swing.JLabel tex2;
    // End of variables declaration//GEN-END:variables
}
