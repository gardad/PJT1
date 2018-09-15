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
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    String tipoAnimal;
        
        // TODO code application logic here
    MamiferoTerrestre m;
    m= new MamiferoTerrestre();
    m.Comer();
    m.Dormir(5);
   m.setSonido("Ladrar");
    m.HacerSonido();
    m.caminar(2);
   tipoAnimal=m.getTipo(); System.out.println("El animal es un... "+tipoAnimal);
    
   MamiferoTerrestre mt;
   mt=new MamiferoTerrestre("Leon", 2.5f, "naranja", 10, false, "Felino", "Ruge");
       System.out.println("Inicia Objeto Nuevo mt...");
       mt.Comer();
       mt.Dormir(6);
       mt.HacerSonido();
       mt.caminar(4);
      System.out.println("El Mamifero Terrestre es..."+mt.getTipo());
      System.out.println("El Mamifero Terrestre es..."+mt.nombre);
    
      // Arreglos
      
      MamiferoTerrestre[] aMamiferoT= new MamiferoTerrestre[2];
      
      aMamiferoT[0]=m;
      aMamiferoT[1]=mt;

           
   }
    
    
    
}
