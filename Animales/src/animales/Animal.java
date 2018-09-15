/*
* @author gardad
* Clase 3
* Esta clase, Si tiene un metodo abstracto entonces se convierte en una clase abstracta y puede tener 
o no metodos implementados.
* no se puede crear un objeto de una clase abstracta, es decir no puede ser instanciada
 */
package animales;

/**
 *
 * @author gardad
 */
public abstract class Animal {
    
       // Carateristicas de un animal
    protected  float tamano ;
    protected String nombre ;
    protected String color;
    
    //Constructor
    
    public Animal(){
        this.tamano = 20.0f;
        this.nombre = "Animal";
        this.color = "Cafe";
        
    }
    
     public abstract void HacerSonido();
     public void Dormir(int tiempoHoras) {
        System.out.println("Animal durmiendo por " + tiempoHoras+ "horas.");}
     
     public abstract void Comer();
          
     
}
