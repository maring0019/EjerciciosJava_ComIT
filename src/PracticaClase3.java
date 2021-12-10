import java.util.Scanner;
/*
 * Calculo de interes de un plazo fijo:
 * Capital a invertir:pesos
 * Tiempo de duraci�n del plazo fijo: cantidad de d�as
 * Tasa de inter�s que da el banco: 0,3 (30%). A fines de efectuar
 * calculos debe ser expresada num�ricamente y no en t�rminos porcentuales.
 	Formula: capital x (tasa de inter�s x el plazo /365) = intereses ganados
 	Para calcular el monto de un plazo fijo en pesos al final del periodo
 	considerado, sumarle el capital inicial los intereses generados:
 		capital + intereses generados = monto final del plazo fijo
 		
 		
 	Nota: validar que el capital no sea negativo y que los d�as est�n entre 1 y 365.
 */
public class PracticaClase3 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el capital a invertir: ");
		int capital = scanner.nextInt();
		System.out.println("Ingrese los d�as para el plazo fijo: ");
		int dias = scanner.nextInt();
		//Hace los c�lculos si cumple con las condiciones.
		if (capital > 0 && dias >0 && dias <366) {
			//Tasa de inter�s dada por el banco (valor fijo)
			double tasa = 0.3;
			double interesesGenerados = capital * tasa * (dias/365);
			double plazoFijo = capital + interesesGenerados;
			System.out.println("Monto final del plazo fijo: " + plazoFijo);
			
		}else {
			System.out.println("Su capital es negativo o la cantidad de d�as "
					+ "no est� entre 1 y 365. No se puede continuar.");
		}
		
		
		
		
	
		
	}

}
