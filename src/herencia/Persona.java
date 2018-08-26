
package herencia;


public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private String direccion;
    
    //Constructor
    public Persona(String nombre, int edad, String sexo, String direccion){
    
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
        
      //Los metodos GET permiten recuperar el valor de un articulo
      //de la clase

      //Loa metodos SET permiten cambiar el valor de un atributo
      //de la clase  
   
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    
    
        
    
    }
    
}



