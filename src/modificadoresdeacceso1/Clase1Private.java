
package modificadoresdeacceso1;


class Clase1Private {
    
    private String atributoPrivate = "Valor Atributo Private";
    
    private Clase1Private()
    {
        System.out.println("Constructor Private");
    }
    
    public Clase1Private(String argumento)
    {
        this();
        System.out.println("Constructor público");
    }
 
    
    
    private void metodoPrivate()
    {
        System.out.println("Metodo Private");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }

}
