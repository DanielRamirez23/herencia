 
package herencia;

import java.util.Scanner;

 
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona1 = new Persona("Oscar",20,"hombre","Celaya");
        
        System.out.println(persona1.getNombre());
        
        Alumno alumno1 = new Alumno(
                "Emilio",//nombre
                22,//edad
                "Hombre",//sexo
                "Celaya",//direccion
                "A001",//clave
                "A",//grupo
                1,//semestre
                "Sistemas"//carrera
 
                
        );
        
        System.out.println(alumno1.getCarrera() );
        
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String sexo;
        String direccion;
        String clave;
        String grupo;
        int semestre;
        String carrera;
        
        System.out.println("Ingrese el nombre del alumno");
        nombre = entrada.next();
        
        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();
        
        System.out.println("Ingrese el sexo");
        sexo = entrada.next();
        
        System.out.println("Ingrese la direccion");
        direccion = entrada.next();
        
        System.out.println("Ingrese la clave");
        clave = entrada.next();
        
        System.out.println("Ingrese el grupo");
        grupo = entrada.next();
        
        System.out.println("Ingrese el semestre");
        semestre = entrada.nextInt();
        
        System.out.println("Ingrese la carrera");
        carrera = entrada.next();
        
        Alumno alumno_nuevo = new Alumno(
        nombre,
        edad,
        sexo,
        direccion,
        clave,
        grupo,
        semestre,
        carrera
     );
        
     System.out.println( alumno_nuevo.getNombre());
       
        
    }
    
}
