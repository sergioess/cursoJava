
package test;


public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,2,5,8,12,200);
        
        variosParametros("Sergio", 100,200,300,400);
    }
    
    private static void variosParametros(String nombre, int... numeros)
    {
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento = " + numeros[i]);
        }
    }
    
    
}
