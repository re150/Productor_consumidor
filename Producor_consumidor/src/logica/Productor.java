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
    private int max ,velP;
    private JLabel box1,box2,box3,box4,show1,show2,show3,humo1,humo2,humo3,humo4,humo5,humo6,stock ;
    private Gestor ges;
    public  boolean estado = true;
    public  Productor (JLabel box1, JLabel box2, JLabel box3, JLabel box4,JLabel S1,JLabel S2, JLabel S3,JLabel h1,JLabel h2,JLabel h3,JLabel h4,JLabel h5,JLabel h6 , JLabel stock , int velP ,Gestor ges) {
    this.max = max;
    this.box1 = box1;
    this.box2 = box2;
    this.box3 = box3;
    this.box4 = box4;
    this.show1 = S1;
    this.show2 = S2;
    this.show3 = S3;
    this.humo1 = h1;
    this.humo2 = h2;
    this.humo3 = h3;
    this.humo4 = h4;
    this.humo5 = h5;
    this.humo6 = h6;
    this.stock = stock;
    this.ges = ges;
    this.velP = velP;
    }
    
    
     public void run() 
    {
        while (estado){
           // System.out.println(velP);
          if(ges.act < ges.max){
            estadoP ("producciendo"); 
            work ();
         try{
             sleep((int)(Math.random() * velP));
         }catch (InterruptedException ex) {
              ex.printStackTrace();
          }
            sleep ();
          estadoP ("sleep");
           ges.producir();
          //   contador () ;
          System.out.println(ges.act);
          contador ();
        }
          if(ges.act == ges.max) estadoP ("stock all"); 
      }
        
    }
     
     
   
   public void estadoP (String x) 
     {
         String aux1 = show3.getText();
         String aux2 = show2.getText();
          
        show3.setText(x);
        show2.setText(aux1);
        show1.setText(aux2);
        
     }
     
      public void sleep () {
        box1.setVisible(false);
        box2.setVisible(false);
        box3.setVisible(false);
        box4.setVisible(false);
      
          humo1.setVisible(false);
          humo2.setVisible(false);
          humo3.setVisible(false);
          humo4.setVisible(false);
          humo5.setVisible(false);
          humo6.setVisible(false);
      }
      
      
      public void work () {

          box1.setVisible(true);
          box2.setVisible(true);
          box3.setVisible(true);
          box4.setVisible(true);
    
          humo1.setVisible(true);
          humo2.setVisible(true);
          humo3.setVisible(true);
          humo4.setVisible(true);
          humo5.setVisible(true);
          humo6.setVisible(true);
      }
     
      
      
       public void contador () 
     {
 
      String aux;
      
      aux =Integer.toString(ges.act);
      
      stock.setText(aux);
      
     }
}
