package animales;

public class MamiferoAcuatico extends Mamifero implements IAcuatica {

private int cantidadAgua;

  public MamiferoAcuatico(float tamano, String nombre, String color, int tiempoVida, String sonido){  //constructor es el primero que se ejecuta para crear el objeto
    super(); // Ejecuta el constructor del padre en este caso Mamifero
    this.tamano=tamano;
    this.nombre=nombre;
    this.color=color;
    this.tiempoVida=tiempoVida;
    this.sonido=sonido;


  }

  public void setCantidadAgua (int cAgua) {

    this.cantidadAgua=cAgua;

  }

  public void HacerSonido(){
    System.out.println("El "+this.nombre+" hace el siguiente sonido "+this.sonido);


  }


  public void nadar(double velocidad) {     /*nadar es un metodo definido en la interface y es obligatorio implementarlo
                                              porque todos los metodos de la interface se deben de implementar*/
  System.out.println("El "+this.nombre+" nada a una velocidad de "+velocidad);

  }

 public int salpicar() {
   return this.cantidadAgua;
 }

public void  sumergirse(double profundidad) {

  System.out.println("El "+this.nombre+" se sumerge a una profundidad de "+profundidad);

}


}
