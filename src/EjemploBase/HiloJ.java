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
public class HiloJ extends Thread{
     private Turtle tortuga;

    public HiloJ(Turtle tortuga) {
        this.tortuga = tortuga;
    }
  @Override
  public void run(){
  this.tortuga.setPos(0,0);
  double f=Math.sqrt((Math.pow(20,2))+(Math.pow(20, 2)));
  

this.tortuga.right(135);
this.tortuga.forward(f);
this.tortuga.left(45);
this.tortuga.forward(40);
this.tortuga.left(135);
this.tortuga.forward(f);
this.tortuga.left(45);
this.tortuga.forward(40);
this.tortuga.hideTurtle();
}}
