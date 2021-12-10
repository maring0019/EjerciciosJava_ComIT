package Practica3ComIT;

import java.util.Scanner;
/*
 * 21)	Explicar, línea a línea, el funcionamiento del programa mostrado a continuación: 
 * 
 * Respuesta: lo que hace el programa es calcular la cantidad de años necesarios para
 * obtener el dinero deseado. A partir de un dinero depositado y la tasa de interés.
 */
public class Ejercicio21 {

	public static void main(String[] args) {
		//Definicion de las variables
		double dineroDepositado, tasaDeInteres, dineroDeseado;
		//definicion y creacion del objeto Scanner
		Scanner scanner = new Scanner (System.in);
		//Ingreso por teclado del valor dineroDepositado
		System.out.println("¿Cuánto dinero tiene depositado actualmente?");
		dineroDepositado = scanner.nextDouble();
		//Ingreso por teclado el valor interés
		System.out.println("¿Qué interés posee el depósito? (de 0 a 100) ");
		tasaDeInteres = scanner.nextDouble();
		//Ingreso por teclado del valor dineroDeseado
		System.out.println("¿Cuánto dinero desearías tener en el banco?");
		dineroDeseado = scanner.nextDouble();
		//Total de años para lograr el dinero deseado.
		int totalDeAnios = 0;
		//Ciclo para calcular la cantidad de años para obtener el dineroDeseado
		do
		{
			dineroDepositado += dineroDepositado * tasaDeInteres / 100; 
			++totalDeAnios;

		} 
		//El ciclo se repite mientras no se haya logrado el dinero deseado
		while (dineroDepositado < dineroDeseado);
		//Muestra los años necesarios para obtener el dineroDeseado
		System.out.println("En " + totalDeAnios + "años vos tendrás " + dineroDeseado + " depositados en el banco.");
		//Pide ingresar enter para poder finalizar
		System.out.println("Presiona Enter para finalizar");
		scanner.nextLine();


	}

}
