/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooaula04metodosespeciais;

/**
 *
 * @author Mari (48) 99618-5728
 */
public class POOAula04MetodosEspeciais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Caneta c1 = new Caneta("BIC", 0.5f, "Amarela");
        
        Caneta c2 = new Caneta ("Stabilo", 0.3f, "Roxa");
        
        c1.status();
        c2.status();
    }
    
}
