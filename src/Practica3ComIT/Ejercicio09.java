package Practica3ComIT;
/*
 * 9)	El Banco �Robin Hood� que para dep�sitos mayores a 2000$, el banco se quedar� con un 2% en concepto de comisi�n. Se quiere realizar un algoritmo para determinar el neto depositado (o sea, lo que efectivamente se acredita en mi cuenta al descontarle la comisi�n o impuesto).


Recuerden la regla de 3 simple que nos permite sacar porcentajes:

Si tengo que X es el 100%, entonces cuanto es el 2% de x.
X ____ 100
? ____ 2
Resuelvo �?� haciendo X * 2 / 100, donde 2 es el porcentaje que quiero calcular de X.

 */
public class Ejercicio09 {

	public static void main(String[] args) {
		calcularNetoDepositado();
		

	}

	public static void calcularNetoDepositado() {
		int deposito = 3000;
		double porcentajeRetencion=2;
		double netoDepositado;
		if(deposito>2000) {
			double retencion = (deposito*porcentajeRetencion)/100;
			netoDepositado = deposito - retencion;   
		} else {
			netoDepositado = deposito;
		}
		
		System.out.println("Tu deposito inicial es: " + deposito  + ". El neto depositado es: " + netoDepositado);
		
		
	}
}
