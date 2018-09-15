/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author gardad
 */
public abstract class Mamifero extends Animal{
    
     // Carateristicas de un Mamifero
    
   protected int tiempoVida;
   protected boolean domestico;
   
   //Constructor 
   
   public Mamifero() {
       super();
       this.nombre = ("Mamifero");
       this.tiempoVida = 0;
       this.domestico = false;
    }
    
    @Override
    public void Comer(){
       System.out.println("El Mamifero esta comiento...");
    }}
  
