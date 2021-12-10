package Practica3ComIT;

import java.util.Scanner;
/*
 * 21)	Explicar, l�nea a l�nea, el funcionamiento del programa mostrado a continuaci�n: 
 * 
 * Respuesta: lo que hace el programa es calcular la cantidad de a�os necesarios para
 * obtener el dinero deseado. A partir de un dinero depositado y la tasa de inter�s.
 */
public class Ejercicio21 {

	public static void main(String[] args) {
		//Definicion de las variables
		double dineroDepositado, tasaDeInteres, dineroDeseado;
		//definicion y creacion del objeto Scanner
		Scanner scanner = new Scanner (System.in);
		//Ingreso por teclado del valor dineroDepositado
		System.out.println("�Cu�nto dinero tiene depositado actualmente?");
		dineroDepositado = scanner.nextDouble();
		//Ingreso por teclado el valor inter�s
		System.out.println("�Qu� inter�s posee el dep�sito? (de 0 a 100) ");
		tasaDeInteres = scanner.nextDouble();
		//Ingreso por teclado del valor dineroDeseado
		System.out.println("�Cu�nto dinero desear�as tener en el banco?");
		dineroDeseado = scanner.nextDouble();
		//Total de a�os para lograr el dinero deseado.
		int totalDeAnios = 0;
		//Ciclo para calcular la cantidad de a�os para obtener el dineroDeseado
		do
		{
			dineroDepositado += dineroDepositado * tasaDeInteres / 100; 
			++totalDeAnios;

		} 
		//El ciclo se repite mientras no se haya logrado el dinero deseado
		while (dineroDepositado < dineroDeseado);
		//Muestra los a�os necesarios para obtener el dineroDeseado
		System.out.println("En " + totalDeAnios + "a�os vos tendr�s " + dineroDeseado + " depositados en el banco.");
		//Pide ingresar enter para poder finalizar
		System.out.println("Presiona Enter para finalizar");
		scanner.nextLine();


	}

}
