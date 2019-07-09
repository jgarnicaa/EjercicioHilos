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
public class HiloK extends Thread{
        private Turtle tortuga;

    public HiloK(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
        
            
        this.tortuga.setPos(0,0);
        this.tortuga.right(180);
        for (int i = 0; i < 4; i++) {
            this.tortuga.forward(20);
            this.tortuga.right(90);
        }
        this.tortuga.right(90);
        this.tortuga.forward(40);
        this.tortuga.left(135);
        this.tortuga.forward(28.28);
        this.tortuga.hideTurtle();
        
    }
}
