package Practica3ComIT;
/*
 * 10)	El Banco “Imperio” descuenta de los cheques depositados un 6 por mil 
 * (cada 1000$ depositados el banco se queda con 6$, quedando depositada 
 * en la cuenta del usuario 994$, o sea un 0,6%).
 *  Se quiere realizar un algoritmo que muestre el neto depositado.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		calcularNetoDepositado();

	}

	public static void calcularNetoDepositado() {
		int deposito = 1500;
		double porcentajeRetencion=0.006;
		double netoDepositado;
		if(deposito>=1000) {
			//la parte entera de dividir  por 1000 lo multiplico
			//por el porcentaje de retencion. Ya que cada $1000 resta $6
			/*
			 * Basta con que hagas un casting de la variable a su correspondiente tipo de dato
			 *  en este caso sea un int o un long

				Ejemplo
				
				Float a entero
				
				float real = 14.444f;
				int entero = (int)real;
				Double a entero
				
				double real = 14.444;
				int entero = (int)real;
				Lo mismo aplica para los long
			 * */
			//Paso a valor eentero para sacar la parte entera.
			int retencion = (int)((deposito/1000)*(porcentajeRetencion*1000));
			netoDepositado = deposito - retencion;   
		} else {
			netoDepositado = deposito;
		}
		
		System.out.println("Tu deposito inicial es: " + deposito  + ". El neto depositado es: " + netoDepositado);
		
		
	}
}


