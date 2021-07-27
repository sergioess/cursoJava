
package modificadoresdeacceso1;


class Clase1Default {
    
    String atributoDefault = "Valor Atributo Default";
    
    Clase1Default()
    {
        System.out.println("Constructor Default");
    }
    
 
    
    
    void metodoProtected()
    {
        System.out.println("Metodo Default");
    }

    String getAtributoDefault() {
        return atributoDefault;
    }

    void setAtributoDefault(String atributoDefault) {
        this.atributoDefault = atributoDefault;
    }
}
