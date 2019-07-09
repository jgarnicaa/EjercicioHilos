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
public class HiloT extends Thread{
    private Turtle tortuga;

    public HiloT(Turtle tortuga) {
        this.tortuga = tortuga;
    }
    
    public void run(){
    this.tortuga.setPos(-40,0);
    this.tortuga.left(60);
    this.tortuga.forward(20);
    this.tortuga.left(60);
    this.tortuga.forward(20);
    this.tortuga.right(210);
    this.tortuga.forward(40);
 this.tortuga.hideTurtle();
    }

}
    

