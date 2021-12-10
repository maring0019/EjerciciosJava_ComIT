package Practica3ComIT;
/*
 * 24)	La ecuación para estimar la población en un periodo de “N” años a tasa de
 * crecimiento porcentual “R” consiste 
 * P0 + (1 + (R / 100))^N
 * donde P0 consiste en una medición de
 *  población para un año que se toma como base.
Considerando la ciudad de buenos aires cuyo R es 1,7% (0,17) y P0 vale 9.927.000 
(censo de 1980), escribir un algoritmo para estimar la poblaciones previstas entre 
los años 1980 y 2050 con intervalos de 10 años.
Para poner a prueba la bondad del ajuste estadístico se puede realizar este
 test con dos criterios: Tomar como base el año 1980 o bien tomar como base 
 para un año el resultado de lo proyectado para el año anterior.

 */
import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		poblacionPrevista();

	}

	static void poblacionPrevista() {

		Scanner scanner = new Scanner(System.in);

		double P0 = 9927000;
		final double R = 0.17;
		int N = 10;
		int inicio = 1980;
		int fin = 2050;

		System.out.println("Valor de P0: " + P0);
		System.out.println("Valor de R: " + R);
		System.out.println("Valor de N: " + N);
		System.out.println("Año de inicio: " + inicio);
		System.out.println("Año de fin: " + fin);

		int periodos = (fin - inicio) / N;
		System.out.println("Periodos: " + periodos);
		double base=(1 + (R / 100));
		double problacionEstimada;
		int anio = 1990;
		System.out.println("Problación estimada cada diez años");
		System.out.println("Problacion estimada (" + inicio + "): " + P0);
		for (int i = 1; i <= periodos; i++) {// o con inicio y fin e i+=10
			// o Math.pow(base, N) que si funciona para decimales
			problacionEstimada = P0 + potencia(base, N);
			System.out.println("Problacion estimada (" + anio + "): " + problacionEstimada);
			P0 = problacionEstimada;
			anio += 10;
		}
	
				
	}
	
	static double potencia(double base ,int potencia) {
		
		int cantidad=0;
		int resultado=1;
		while(cantidad<potencia) {
			cantidad++;
			resultado*=base;
		}
		
		
	return resultado;
	}

}
