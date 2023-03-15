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
public class Productor  extends Thread{
    private int max,act = 0;
    private JLabel box1,box2,box3,box4;
    
    public  Productor (JLabel box1, JLabel box2, JLabel box3, JLabel box4,JLabel S1,JLabel S2, JLabel S3,int max) {
    this.max = max;
    this.box1 = box1;
    this.box2 = box2;
    this.box3 = box3;
    this.box4 = box4;
    }
    
    
     public void run() 
    {
      if( act == max){  
            try {
                wait();
            } catch (InterruptedException ex) {
             ex.printStackTrace();
            }
           
      } else{
           
            act ++;
            this.box1.setVisible(true);
             try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
             ex.printStackTrace();
            }
            this.box1.setVisible(false); 
      }
        
    }
     
     
     public void decrease () {
        act --;
       notify();
     }
    
     
     
}
