/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import javax.swing.JLabel;
/**
 *
 * @author angel
 */
public class Consumidor extends Thread {
    private int max, cons = 0,velC;
    private JLabel car1,car2,car3,car4,cont,show1,show2,show3;
     private Gestor ges;
     
    public Consumidor (JLabel car1, JLabel car2, JLabel car3, JLabel car4,JLabel contCon,JLabel S4,JLabel S5, JLabel S6, int velC, Gestor ges) {
    this.max = max;
    this.car1 = car1;
    this.car2 = car2;
    this.car3 = car3;
    this.car4 =car4;
    this.cont = contCon;
    this.show1 = S4;
    this.show2 = S5;
    this.show3 = S6;
    this.ges = ges;
    this.velC = velC;
    }
    
      public void run() 
    {
     System.out.println(ges.act);
         while (true){
             System.out.println(velC);
            if(ges.act > 0){
             estadoC ("consumiendo"); 
             
                car1.setVisible(true);
                car2.setVisible(true);
                car3.setVisible(true);
                car4.setVisible(true);
             
               try{
                     sleep((int)(Math.random() * velC));
                }catch (InterruptedException ex) {
                     ex.printStackTrace();
                 }
               
                car1.setVisible(false);
                car2.setVisible(false);
                car3.setVisible(false);
                car4.setVisible(false);
                
               estadoC ("sleep"); 
               contador();
               ges.consumir();
            }
              estadoC ("no stock all"); 
         }
    }
    
    
    
    
   
    
    
    
     public void estadoC (String x) 
     {
         String aux1 = show3.getText();
         String aux2 = show2.getText();
          
        show3.setText(x);
        show2.setText(aux1);
        show1.setText(aux2);
        
     }
     
     
      public void contador () 
     {
 
      String aux;
      int  contar = 0;
    
      contar = Integer.parseInt(cont.getText());
      contar = contar +1;
      aux =Integer.toString(contar);
      
      cont.setText(aux);
      
     }

}


