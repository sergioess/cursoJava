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
public class ClaseHijaDefault extends Clase1Default{
    
    public ClaseHijaDefault()
    {
        super(); //llama al constructor protected de la clase padre
        this.atributoDefault = "Modificacion atributo default";
        this.metodoProtected();
    }
}
