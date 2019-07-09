/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;

/**
 *
 * @author Estudiante
 */
public class EscenarioTortugas extends TurtleFrame{
    Turtle tortuga1 = null;
    Turtle tortuga2=null;
    Turtle tortuga3=null;
    Turtle tortuga4=null;
    Turtle tortuga5=null;
    public EscenarioTortugas() {
      tortuga1 = new Turtle(this);
      tortuga2= new Turtle(this);
      tortuga3= new Turtle(this);
      tortuga4= new Turtle(this);
      tortuga5= new Turtle(this);
     
    }
    
    public void iniciar(){
       HiloE hilo = new HiloE(tortuga1);
       hilo.start();    
       HiloT hilo2= new HiloT(tortuga2);
       hilo2.start();
       HiloJ hilo3= new HiloJ(tortuga3);
       hilo3.start();
       HiloP hilo4=new HiloP(tortuga4);
       hilo4.start();
       HiloK hilo5=new HiloK(tortuga5);
       hilo5.start();
    }
    
    
    public static void main(String[] args) {
        EscenarioTortugas escenario = new EscenarioTortugas();
        escenario.iniciar();
        
    }
}
