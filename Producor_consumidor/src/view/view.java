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
    
    Productor pro;
    Consumidor con;
    
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
        errorvP.setVisible(false);
         errorvC.setVisible(false);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tex1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        canP = new javax.swing.JTextField();
        errorP = new javax.swing.JLabel();
        velP = new javax.swing.JTextField();
        errorvP = new javax.swing.JLabel();
        tex4 = new javax.swing.JLabel();
        velC = new javax.swing.JTextField();
        errorvC = new javax.swing.JLabel();
        tex5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tex2 = new javax.swing.JLabel();
        cont_cons = new javax.swing.JLabel();
        S1 = new javax.swing.JLabel();
        S2 = new javax.swing.JLabel();
        S3 = new javax.swing.JLabel();
        S4 = new javax.swing.JLabel();
        S5 = new javax.swing.JLabel();
        S6 = new javax.swing.JLabel();
        stock = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tex3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

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
        jPanel1.add(box4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        box1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/box2.png"))); // NOI18N
        jPanel1.add(box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        box2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/box2.png"))); // NOI18N
        jPanel1.add(box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        box3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/box2.png"))); // NOI18N
        jPanel1.add(box3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/float2.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, 100));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/sky2.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 200, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/cinta4.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/cinta4.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        tex1.setText("cantida de producto a produccir");

        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        canP.setToolTipText("");
        canP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canPActionPerformed(evt);
            }
        });

        errorP.setText("Error no puder ser menor a  0");

        errorvP.setText("Error no puder ser menor a  0");

        tex4.setText("velocidad productor");

        errorvC.setText("Error no puder ser menor a  0");

        tex5.setText("velocidad Consumidor");

        jButton2.setText("Pausar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tex1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(canP, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(velP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tex4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tex5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velC, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(errorP, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(errorvP, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorvC, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tex1)
                            .addComponent(tex4)
                            .addComponent(tex5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(canP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 31, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(errorvC)
                            .addComponent(errorvP)
                            .addComponent(errorP))))
                .addGap(16, 16, 16))
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tex2.setText("estado productor");
        jPanel3.add(tex2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 119, -1));

        cont_cons.setText("0");
        jPanel3.add(cont_cons, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 21, -1));

        S1.setText(".");
        jPanel3.add(S1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 130, 20));

        S2.setText(".");
        jPanel3.add(S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 120, 20));

        S3.setText(".");
        jPanel3.add(S3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 120, 20));

        S4.setText(".");
        jPanel3.add(S4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 110, 20));

        S5.setText(".");
        jPanel3.add(S5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 110, 20));

        S6.setText(".");
        jPanel3.add(S6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 110, 20));

        stock.setText("0");
        jPanel3.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 30, 20));

        jLabel12.setText("stock  actual");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 20));

        tex3.setText("estado consumidor");
        jPanel3.add(tex3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 119, -1));

        jLabel11.setText("Cantida consumidad");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 266, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/lis2.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 210, 260));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/lis2.png"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 260));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/pro3.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 160));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/con2.png"))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        Gestor ges = new Gestor();
         int cantidadP,velP1, velC1;
         
       cantidadP = Integer.parseInt(canP.getText());
       velP1 = Integer.parseInt(velP.getText());
        velC1 = Integer.parseInt(velC.getText());
        
         if (cantidadP <= 0 )  errorP.setVisible(true);
         if( velP1 <= 0)  errorvP.setVisible(true);
         if( velC1 <= 0) errorvC.setVisible(true);  
         
        if( cantidadP > 0 && velP1 > 0 && velC1 >0 ) { 
            
        errorP.setVisible(false); 
        errorvP.setVisible(false);
        errorvC.setVisible(true);
        Gestor ges = new Gestor(cantidadP);
         pro = new Productor(box1,box2,box3,box4,S1,S2,S3,humo1,humo2,humo3,humo4,humo5, humo6,stock,velP1 ,ges);
         con = new Consumidor(car1,car2,car3,car4,cont_cons,S4,S5,S6,velC1,ges);
        
        pro.start();
        con.start();
    }
         
          
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void canPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canPActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_canPActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //  System.exit(0);
         pro.estado = false;
         con.estado = false;
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
    
    
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
    private javax.swing.JLabel cont_cons;
    private javax.swing.JLabel errorP;
    private javax.swing.JLabel errorvC;
    private javax.swing.JLabel errorvP;
    private javax.swing.JLabel humo1;
    private javax.swing.JLabel humo2;
    private javax.swing.JLabel humo3;
    private javax.swing.JLabel humo4;
    private javax.swing.JLabel humo5;
    private javax.swing.JLabel humo6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel stock;
    private javax.swing.JLabel tex1;
    private javax.swing.JLabel tex2;
    private javax.swing.JLabel tex3;
    private javax.swing.JLabel tex4;
    private javax.swing.JLabel tex5;
    private javax.swing.JTextField velC;
    private javax.swing.JTextField velP;
    // End of variables declaration//GEN-END:variables
}
