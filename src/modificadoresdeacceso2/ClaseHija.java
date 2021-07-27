
package modificadoresdeacceso2;

import modificadoresdeacceso1.Clase1Protected;


public class ClaseHija extends Clase1Protected {
    
    public ClaseHija()
    {
        super(); //llama al constructor protected de la clase padre
        this.atributoProtected = "Modificacion atributo protected";
        this.metodoProtected();
    }
    
}
