/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Estudiante
 */
public class B extends A{
    
    public B(){
        System.out.println("costructor de B");
    }
    
    public void f(int b){
        System.out.println("En B " + b);
    }
}
