package Practica4;
/*
 * 10) ¿Cuál sería el resultado del intento de compilar y ejecutar el siguiente programa? 
 * e. El programa se compila y se ejecuta sin error y se imprime 0 veinte veces. 
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		int size = 20; 
        int[] arr  = new int [size]; 

        for (int i = 0; i <size; ++i) {
                System.out.println (arr[i]); 
        }
	}

}

