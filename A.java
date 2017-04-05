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
public class A {
    
    public A(){
        System.out.println("costructor de A");
    }
    
    public void f(int a){
        System.out.println("En A "+ a);
    }
    public void f(){
        System.out.println("En A sin parametros");
    }
}
