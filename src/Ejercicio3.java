import java.util.Scanner;

/*
 3)	Escriba un programa que muestre por pantalla un mensaje a su elección, espere a que el usuario presione la tecla Enter, y luego muestre un segundo mensaje y finalice.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el primer mensaje: ");
		String string = scanner.next();
		System.out.println("Su primer mensaje fue: " + string);
		System.out.println("Ingrese el segundo mensaje: ");
		String string2 = scanner.next();
		System.out.println("Su segundo mensaje fue: " + string2);
		*/
		
		Scanner t = new Scanner(System.in);
		  /*Crear e Instanciar la clase de tu métod */
		System.out.println("Este es el primer mensaje: hola. Si quiere ver el segundo mensaje, presione enter. ");
		  /* Entrada del Usuario */
		   String enterkey = t.nextLine(); 
		   /*Comparación para saber si se presiono Enter*/
		  if (enterkey.isEmpty()) {
		     /*Si es así , llamas a tu método girarDados */
			  System.out.println("Segundo mensaje: espero que te encuentres bien.");
		  }
	}

}
