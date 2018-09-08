/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author gardad
 */
public class Empleado extends Persona {
    private float sueldo;
    
    //Constructor Empleado (se llama igual que la clase)
    public Empleado(String n, int ed, float es, float s){
        super(n, ed, es);
        this.sueldo=s;
        System.out.println("Constructor Empleado");
        
        }
    
    public float getSueldo(){
        return this.sueldo;
    }
    
    @Override
    public void respirar(){
    
    System.out.println("Empleado  "+this.getNombre()+"   "+"Respirando...");
    
    

    }
    
    
   }