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
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Ana");
        String n3=p1.getNombre();
        System.out.println("nombre de P1  "+n3);
        p1.respirar();
        Persona p2 = new Persona("Juan", 25, 1.75f);
        p2.respirar();
        Persona p3;
        p3=p1;
        p3.respirar();
        
        Persona e1 = new Empleado("Edgar",30,1.90f,30000.00f);
        //e1.setNombre("Victor");
        
        e1.respirar();
       
            
        float s = ((Empleado)e1).getSueldo();

        System.out.println("El sueldo de "+ e1.getNombre()+"="+s);
        
        
        
        // TODO code application logic here
    }
    
}
