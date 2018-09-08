package personas;

public class Persona {
    //Atributos
    //variables de instancia
    public float estatura;
    private String nombre;
    private int edad;
    
    // Constructor -- edo inicial del objeto
    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.estatura = 0.0f;
        System.out.println("Constructor Persona vacio");
                
    }
     public Persona(String nombre, int edad, float estatura){
        //shadowing
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        System.out.println("Constructor Persona con variables locales" + "  "+nombre +"  "+ edad+"  "+ estatura);
        System.out.println("Constructor Persona con Parametros De Clase" + "  "+this.nombre +"  "+ this.edad+"  "+ this.estatura);

         
         //Boxing de un primitivo a un objeto
         Integer n = edad;
         
         //Unboxing de un obj a un primitivo
         edad = n;         
               
       
    }
     public String getNombre(){
     return this.nombre;
          
     }
     public void setNombre(String n) {
     this.nombre=n;
         
     
     }
     
     //estas funciones ya se deben de invocar
    public void respirar(){
        System.out.println("Persona  "+this.nombre+"   "+"Respirando...");
    

        
    }
}
