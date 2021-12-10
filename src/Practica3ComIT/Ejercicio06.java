package Practica3ComIT;

import java.util.Scanner;

/*
 * 6)	Escriba un programa que reciba un año y un mes e
 *  informe por consola la cantidad de de días que tiene 
 *  ese mes de ese año. 
 *  No se olviden de ¡Considerar los años bisiestos!
 */
public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcularDias();

	}

	public static void calcularDias() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el año: ");
		int anio = scanner.nextInt();
		System.out.println("Ingrese el mes: ");
		int mes = scanner.nextInt();
		int dias;
		String nombreMes;
		// Mejor que con letras, usar numeros para meses y poder aplicar el case. No es
		// necesario mostrar el nombre del mes.
		// Y asi directamente puedo agrupar los casos y usar menos codigo.
		if ((anio % 4 == 0 && (anio % 100 != 0)) || ((anio % 100 != 0) && (anio % 400 == 0)) && mes == 2) {
			dias = 29;
			System.out.println("La cantidad de de días que tiene el mes " + mes + " del año " + anio + " es: " + dias);
		} else {

			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12:

				dias = 31;
				System.out.println(
						"La cantidad de de días que tiene el mes " + mes + " del año " + anio + " es: " + dias);
				break;

			case 2:

				dias = 28;
				System.out.println(
						"La cantidad de de días que tiene el mes " + mes + " del año " + anio + " es: " + dias);
				break;

			case 4, 6, 9, 11:

				dias = 30;
				System.out.println(
						"La cantidad de de días que tiene el mes " + mes + " del año " + anio + " es: " + dias);
				break;

			default:
				System.out.println("El mes no existe.");
				break;

			}
		}

	}
}
