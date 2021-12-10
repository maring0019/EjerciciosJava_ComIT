package Practica4;
/*
 * 
Seleccione las respuestas correctas, justificando en cada caso.  

a. El programa no se compila. Correcta. Porque hay error de sintaxis. Es {}, no () en el array de números.

 */
public class Ejercicio11 {

	public static void main(String[] args) {
		String [] numeros = ("uno", "dos", "tres", "cuatro"); 

        if (args.length == 0) {
            System.out.println ("sin argumentos"); 
        }
        else {
            System.out.println (numeros[args.length] + "argumentos"); 
        } 


	}

}
