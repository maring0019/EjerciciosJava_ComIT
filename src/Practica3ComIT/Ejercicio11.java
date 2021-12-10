package Practica3ComIT;
/*
 * 11)	Habiendo una fusión entre ambos bancos “Imperio - Robin Hood” 
 * se aplica las dos reglas, para todo cheque, sin importar el saldo,
 *  se debita un 0,6% y al importe resultante se le debita el 2%. 
 *  (Un débito es una resta que se realiza a un saldo que tenemos. 
 *  Si tenemos 100$ y le debitamos un 2% entonces me quedo con 98$.)
 *   Se quiere realizar un algoritmo que muestre el neto depositado.
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		calcularNetoDepositado();
	}

	public static void calcularNetoDepositado() {
		int deposito = 1500;
		double porcentajeDebitado=0.026;
		double netoDepositado;
		
		int debito = (int)(porcentajeDebitado*deposito);
		netoDepositado = deposito - debito; 
		
		System.out.println("Tu deposito inicial es: " + deposito  + ". El neto depositado es: " + netoDepositado);
		
	}
}
