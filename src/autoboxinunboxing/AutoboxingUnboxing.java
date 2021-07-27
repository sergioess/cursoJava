
package autoboxinunboxing;


public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes de tipos Primitivos
        /*
            int - Integer
            long - Long
            float - Float
            double - Double
            boolean - Boolean
            byte - Byte
            char - Character
            short - Short
        
        */
        
        int entero = 10;
        Integer entero2 = 10;  //Autoboxin se envuelve el tipo primitivo en un Tipo Object
        System.out.println("entero2 = " + entero2);
        System.out.println("entero2 = " + entero2.toString());
        System.out.println("entero2 = " + entero2.floatValue());
        
        
        int entero3 = entero2;      //Esto es Unboxing
        System.out.println("entero3 = " + entero3);
        
    }
}
