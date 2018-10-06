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
public class MamiferoTerrestre extends Mamifero implements ITerrestre {

    // es obligatorio implementador los metodos abstractos
    // de Animal --> HacerSonido

    private String tipo;


    // Constructor para inicializar las variables

    public MamiferoTerrestre() {
        super();
    }

    public MamiferoTerrestre(String nombre,
                             float tamano,
                             String color,
                             int tiempoVida,
                             boolean domestico,
                             String tipo,
                             String sonido){
        super();

        this.nombre=nombre;
        this.tamano=tamano;
        this.color=color;
        this.domestico=domestico;
        this.tiempoVida=tiempoVida;
        this.tipo=tipo;
        this.sonido=sonido;



        }

    // asignado a sonido un valor con setter

    public void setSonido(String sonidolocal) {
    this.sonido=sonidolocal;

    }

    public String getTipo() {
    return this.tipo;}

    @Override
    public void HacerSonido() {
    System.out.println("Este Mamimero Terrestre hace..." + this.sonido );
    }

    @Override
    public void caminar(int patas) {
    System.out.println("El "+this.nombre+" camina con "+ patas + "patas");
    }

}
