/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadoresdeacceso1;

/**
 *
 * @author Sergio
 */
public class TestModificadorAccesoClasePrivate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Clase1Private claseprivate = new Clase1Private("ja");
        claseprivate.setAtributoPrivate("Cambio desde la prueba"); 
        System.out.println("claseDefault = " + claseprivate.getAtributoPrivate());
        
        ClaseHijaPrivate claseHijaPrivate = new ClaseHijaPrivate();
        System.out.println("clasehija = " + claseHijaPrivate);
        System.out.println("clasehija atributo default = " + claseHijaPrivate.getAtributoPrivate());
        
    }
    
}
