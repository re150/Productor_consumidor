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
    private int act, max;
    private Productor prod;
    private Consumidor cons;
    
    public Gestor (Productor producer,Consumidor consumer ,int max ) {
     this.prod = producer;
     this.cons = consumer;
     this.max = max;
    }
   
     public void run() 
    {
      boolean estado = true;
      
           while(estado = true) 
            {

                synchronized(prod){  
                    synchronized(this.cons){  
                     
                     } 
                 }
                 
             }
    }
     
   public void consumiendo () {
         cons.consumir();
         try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
             ex.printStackTrace();
            }
   }  
   
   
   public void producciendo () {
       prod.decrease();
   }
}
