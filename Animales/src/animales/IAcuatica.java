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

// todas las interfaces son 100% abstractas -sus metodos son abstractos- y sus propiedades son constantes y no pueden cambiar

public interface IAcuatica {

    public abstract void nadar(double velocidad);
    public abstract int salpicar();
    public abstract void  sumergirse(double profundidad);  

}
