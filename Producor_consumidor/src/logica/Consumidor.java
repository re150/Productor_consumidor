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
    private int max,act = 0;
    private JLabel car1,car2,car3,car4,cont;
    
    public Consumidor (JLabel car1, JLabel car2, JLabel car3, JLabel car4,JLabel contCon,JLabel S4,JLabel S5, JLabel S6, int max) {
    this.max = max;
    this.car1 = car1;
    this.car2 = car2;
    this.car3 = car3;
    this.car4 =car4;
    this.cont = contCon;
    }
    
      public void run() 
    {
             try {
                wait();
            } catch (InterruptedException ex) {
             ex.printStackTrace();
            }
    }
    
    
    
    
    public void consumir(){
       act++;
       notify();
    }
}


