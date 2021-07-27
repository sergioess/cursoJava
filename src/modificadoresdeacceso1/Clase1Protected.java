
package modificadoresdeacceso1;


public class Clase1Protected {
    
    protected String atributoProtected = "Valor Atributo Protected";
    
    protected Clase1Protected()
    {
        System.out.println("Constructor Protected");
    }
    
    public Clase1Protected(String arg)
    {
        System.out.println("Constructor Público");
    }
    
    
    
    protected void metodoProtected()
    {
        System.out.println("Metodo Protected");
    }

    public String getAtributoProtected() {
        return atributoProtected;
    }

    public void setAtributoProtected(String atributoProtected) {
        this.atributoProtected = atributoProtected;
    }
    
}
