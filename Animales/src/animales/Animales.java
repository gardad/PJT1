/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;
import java.util.Scanner;

/**
 *
 * @author gardad
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner objsc = new Scanner (System.in);
    int menuSelec=0;
    int menuMamif=0;
    String nombre;
    String tamano;
    String color;
    int tiempoVida;
    String domestico;
    String especie;
    String sonido;

    Mamifero[] arrayMamiferos=new Mamifero[10];

  while(menuSelec !=4) {

    System.out.println("***************** Manu Principal **********************");
    System.out.println("1. Capturar Nuevo Mamifero");
    System.out.println("2. Consutar Todos");
    System.out.println("3. Eliminar");
    System.out.println("4. Salir");

    menuSelec=objsc.nextInt();
    objsc.nextLine(); // es un metodo del objeto scanner y limpia buffer

    if(menuSelec==1) {
      while(true){

      System.out.println("***************** Elije tipo de Mamifero **********************");
      System.out.println("1. Seleccion Terrestre");
      System.out.println("2. Seleccion Acuatico");
      System.out.println("3. Salir");

      menuMamif=objsc.nextInt();
      if (menuMamif==1){
         objsc.nextLine();
         System.out.println("Proporciona el nombre: ");
         nombre=objsc.nextLine();
         objsc.nextLine();
         System.out.println("Proporciona el tamano: ");
         tamano=objsc.nextLine();
         objsc.nextLine();
         System.out.println("Proporciona el color: ");
         color=objsc.nextLine();
         objsc.nextLine();
         System.out.println("Proporciona el tiempo de vida: ");
         tiempoVida=objsc.nextInt();
         objsc.nextLine();
         System.out.println("Proporciona el sonido: ");
         sonido=objsc.nextLine();
         objsc.nextLine();
         System.out.println("Proporciona el especie: ");
         especie=objsc.nextLine();
         objsc.nextLine();
         System.out.println("Es domestico: ");
         domestico=objsc.nextLine();
         objsc.nextLine();


      }else if (menuMamif==2){


      }else if (menuMamif==3){
        break;
      }




    }
    }else if( menuSelec==2 ){


    }else if( menuSelec==3 ){


    }

  }




   //    System.out.println("Ingrese un numero: ");
   //    int valorn = objsc.nextInt();
   //    Objsc.nextLine();
   //    System.out.println("Ingrese un texto: ");
   //    String valort = Objsc.nextLine();
   //    System.out.println(valorn + "    " + valort);
   //  String tipoAnimal;
   //
   //      // TODO code application logic here
   //  MamiferoTerrestre m;
   //  m= new MamiferoTerrestre();
   //  m.Comer();
   //  m.Dormir(5);
   //  m.setSonido("Ladrar");
   //  m.HacerSonido();
   //  m.caminar(2);
   // tipoAnimal=m.getTipo(); System.out.println("El animal es un... "+tipoAnimal);
   //
   // MamiferoTerrestre mt;
   // mt=new MamiferoTerrestre("Leon", 2.5f, "naranja", 10, false, "Felino", "Ruge");
   //     System.out.println("Inicia Objeto Nuevo mt...");
   //     mt.Comer();
   //     mt.Dormir(6);
   //     mt.HacerSonido();
   //     mt.caminar(4);
   //    System.out.println("El Mamifero Terrestre es..."+mt.getTipo());
   //    System.out.println("El Mamifero Terrestre es..."+mt.nombre);
   //
   //    // Arreglos
   //
   //    MamiferoTerrestre[] aMamiferoT= new MamiferoTerrestre[2];
   //
   //    aMamiferoT[0]=m;
   //    aMamiferoT[1]=mt;


   }



}
