package Practica3ComIT;
/*
 * 13)	Escriba un programa que imprima los 10 primeros 
 * n�meros pares. Luego modif�quelo para que, adem�s de
 *   imprimirlos calcule su suma. Hacer lo mismo con los impares.
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numerosPares();

	}

	
	public static void numerosPares() {
	
		int par=0, impar=1;
		int sumaPar=0, sumaImpar=0;
		System.out.println("numeros pares: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(par);
			par+=2;
			sumaPar+=par;
		}
		System.out.println("suma par: " + sumaPar);
		
		System.out.println("numeros impares: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(impar);
			impar+=2;
			sumaImpar+=impar;
		}
		System.out.println("suma impar: " + sumaImpar);
	}
}


