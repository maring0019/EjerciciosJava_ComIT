package Practica3ComIT;
/*
 * 14)	Modifique el algoritmo para anterior para imprimir una cantidad arbitraria de N números pares.
Numero entero entre M y N con M menor que N y ambos incluidos, usar  int valorEntero  = Math.floor(Math.random()*(N-M+1)+M);

Valor  double : int valorEntero  = Math.random()*(N-M)+M;

 */
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numerosParesAleatorios();
	}

	public static void numerosParesAleatorios() {
		int numeroPar=0;
		int N=10;
		int M=1;
		double valorEntero  = Math.floor (Math.random()*(N-M+1)+M);
		System.out.println("Cantidad de numeros pares a mostrar: " + valorEntero);
		for (int i = 0; i < valorEntero; i++) {
			
			System.out.println(numeroPar);
			numeroPar+=2;
		}
	}
}
