
package test;

import bloquesinicializacion.Persona;

public class TestBloquesInicializacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println("IdPersona1 " + persona1);
        System.out.println("ContadorPersona = " + Persona.getContadorPersonas());
        

        Persona persona2 = new Persona();
        System.out.println("IdPersona2 " + persona2);
        System.out.println("ContadorPersona = " + Persona.getContadorPersonas());

        
    }
}
