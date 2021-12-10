import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor entero: ");
		valor = scanner.nextFloat();
		double incrementoIVA = (1.21*valor);
		System.out.println(" El valor con el incremento del IVA del 21% es: " + incrementoIVA);
		scanner.close();
	}

}
