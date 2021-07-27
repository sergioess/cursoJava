
package usoforeach;


public class ForEach {
    public static void main(String[] args) {
        int edades[] = {5,6,8,7};
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
            
        }
        
        for(int edad : edades)
        {
            System.out.println("edad = " + edad);
            
        }
        
        
        Persona personas[] = {new Persona("Juan"), new Persona("Sergio"), new Persona("Silvia")};
        
        
        for(Persona persona : personas)
        {
            System.out.println("Array de Personas = " + persona);
            
        }
    }
}
