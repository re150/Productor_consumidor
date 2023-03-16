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
public class Gestor  {
   
    public  int act = 0,max;
    
    public Gestor (int max ) {
     this.max = max;
    }
   
      
   public  synchronized  void producir () {
        act ++; 
        notifyAll();
     } 
     
   public synchronized void consumir() {
        while (act < 0 ) { 
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        act --;
    }
     
   
     
     
           
}
