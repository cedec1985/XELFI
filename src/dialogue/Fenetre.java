/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package dialogue;

import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import java.awt.event.WindowAdapter;

/**
 *
 * @author cedec
 */
public class Fenetre extends JFrame {
public Fenetre(){
    super();
    initialize();}
    
private void initialize(){
this.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e) {
    }
    
});}


    public void windowOpened(WindowEvent e) {
 
    }
  

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
       
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
      
    }

    public void windowDeactivated(WindowEvent e) {
      
}
    public static void main(String args[]) {

new Fenetre();}}
        // TODO code application logic here
 

    