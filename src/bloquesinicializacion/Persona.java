
package bloquesinicializacion;

//Bloques de código que se ejecutan antes del Constructor 


public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
        
        //la variable idpersona no es estatica y por eso no puede ser referenciada aca
        
        //Este bloque se ejecuta una única ves 
    }
    
    
    {
        //Estos es un bloque de inicializacion no estatico
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
        
        //Este bloque se crea cada vez que se crea un objeto de esta clse
    }
    
    public Persona()
    {
        System.out.println("Ejecucion del constructor");
    }
    
    public int getIdPersona()
    {
        return this.idPersona;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
    
}
