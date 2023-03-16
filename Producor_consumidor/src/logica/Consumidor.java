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
    private int max, cons = 0;
    private JLabel car1,car2,car3,car4,cont,show1,show2,show3;
     private Gestor ges;
     
    public Consumidor (JLabel car1, JLabel car2, JLabel car3, JLabel car4,JLabel contCon,JLabel S4,JLabel S5, JLabel S6, Gestor ges) {
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
    }
    
      public void run() 
    {
        synchronized(ges){               
         
        System.out.println(ges.act);
          while(ges.act == 0) {
             try {  
                 estadoC ("sleep"); 
                 sleep(3000);
             } catch (InterruptedException ex) {
              ex.printStackTrace();
               }
          }
         
           ges.consumir();
           show();
           estadoC ("consumiendo");
            
            try {
                sleep(3000);
            } catch (InterruptedException ex) {
             ex.printStackTrace();
            }
            Nshow ();
            
        }
      
    }
    
    
    
    
   
    
    public void show () {
    this.car1.setVisible(true);
    this.car2.setVisible(true);
    this.car3.setVisible(true);
    this.car4.setVisible(true);
    }
    
    public void Nshow () {
    
    this.car1.setVisible(false);
    this.car2.setVisible(false);
    this.car3.setVisible(false);
    this.car4.setVisible(true);
    }
    
     public void estadoC (String x) 
     {
         String aux1 = show3.getText();
         String aux2 = show2.getText();
          
        show3.setText(x);
        show2.setText(aux1);
        show1.setText(aux2);
        
     }
     

}


