import java.util.Scanner;

/*1)	Escriba un programa que calcule e imprima el producto de tres n�meros enteros. (Ej. num1 * num2 * num3)*/
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el primer n�mero, num1: ");
		num1 = scanner.nextInt();
		System.out.println("Ingrese el segundo n�mero, num2: ");
		num2 = scanner.nextInt();
		System.out.println("Ingrese el tercer n�mero, num3: ");
		num3 = scanner.nextInt();
		
		int producto = num1 * num2 * num3;
		System.out.println("EL producto de num1 * num2 * num3 es: " + producto);
		scanner.close(); // me sale error si no lo pongo. 
	}

}
