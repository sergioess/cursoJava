
package modificadoresdeacceso1;


public class TestModificadorAccesoClaseDefault {
    
    public static void main(String[] args) {
        
        System.out.println("TODO DEBE ESTAR DESDE EL MISMO PAQUETE");
        
        Clase1Default claseDefault = new Clase1Default();
        claseDefault.atributoDefault = "Cambio desde la prueba";
        System.out.println("claseDefault = " + claseDefault.getAtributoDefault());
        
        ClaseHijaDefault claseHijaDefault = new ClaseHijaDefault();
        System.out.println("clasehija = " + claseHijaDefault);
        System.out.println("clasehija atributo default = " + claseHijaDefault.getAtributoDefault());
        
    }
    
}
