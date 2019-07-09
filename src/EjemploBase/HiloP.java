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
public class HiloP extends Thread{
    private Turtle tortuga;

    public HiloP(Turtle tortuga) {
        this.tortuga = tortuga;
        
    }

    @Override
    public void run() {
        this.tortuga.right(90);
        this.tortuga.forward(20);
        this.tortuga.left(60);
        this.tortuga.forward(60);
        this.tortuga.left(30+90);
        this.tortuga.forward(60);
        this.tortuga.left(60);
        this.tortuga.forward(60);
        this.tortuga.left(120);
        this.tortuga.forward(60);
        this.tortuga.left(30+90);
        this.tortuga.forward(60);
        this.tortuga.hideTurtle();
    }
}
