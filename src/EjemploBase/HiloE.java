/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author jgarnicaa
 */
public class HiloE extends Thread{
    private Turtle tortuga;

    public HiloE(Turtle tortuga) {
        this.tortuga = tortuga;
    }
    
    public void run(){
    this.tortuga.setPos(0,0);
    this.tortuga.right(180);
    this.tortuga.forward(70);
    this.tortuga.left(135);
    this.tortuga.forward(49.5);
    this.tortuga.left(90);
    this.tortuga.forward(49.5);
    this.tortuga.hideTurtle();
 
    }

}
    

