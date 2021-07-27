
package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;


public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1" + Dias.LUNES);
               
        indicarDiaSemana(Dias.LUNES);
        
        
        //Nueva enumeracion CONTINENTES
        System.out.println("Coentinente 4: " + Continentes.AMERICA);
        System.out.println("Número de paises en el 4 continente es: " + Continentes.AMERICA.getPaises());
        Continentes.AMERICA.getPaises();
    }
    
    private static void indicarDiaSemana(Dias dias)
    {
        switch(dias)
        {
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer día de la semana");
                break;
        }
    }
}
