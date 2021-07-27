
package test;

import modificadoresdeacceso1.Clase1;
import modificadoresdeacceso1.Clase1Protected;
import modificadoresdeacceso2.ClaseHija;


public class TestModificadoresDeAcceso {
    public static void main(String[] args) {
        System.out.println("Prueba Acceso PUBLIC");
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1);
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
        
        System.out.println("---");
        
        
        ////   PRUEBA DE CLASE CON PROTECTED  //////////
        System.out.println("Prueba Acceso PROTECTED");
        //Clase1Protected clas1P = new Clase1Protected();     //No se puede usar este constructor porque esta protegido
        Clase1Protected clas1P = new Clase1Protected("Publico");
        //tampoco se puede acceder al atributo protected
        //tampoco se piede acceder al método protected
        //solo desde una clase hija se puede acceder
        System.out.println("---");
        ClaseHija clasehija = new ClaseHija();
        System.out.println("clasehija = " + clasehija);
        System.out.println("clasehija atributo protected = " + clasehija.getAtributoProtected());
        
        
        
    }
}
