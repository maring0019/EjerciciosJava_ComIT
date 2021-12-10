import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 2)	Cree una clase que imprima en consola el siguiente texto, respetando el formato dado a continuación:

Todo programa Java
consiste de,
al menos, una declaración de clase que usted, 
el programador,
debe definir.
Estas clases se conocen como clases definidas
por el programador o clases definidas por el usuario.
La palabra clave class introduce una declaración
de clase Java,
la cual debe ir seguida inmediatamente del nombre de la clase
(Texto_1 por ejemplo).
Las palabras clave o reservadas son de uso exclusivo de Java y 
siempre se escriben minúscula.
  */


public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	/*
		System.out.println("Todo programa Java");
		System.out.println("consiste de,");
		System.out.println("al menos, una declaración de clase que usted,");
		System.out.println("el programador,");
		System.out.println("debe definir.");
		System.out.println("Estas clases se conocen como clases definidas");
		System.out.println("por el programador o clases definidas por el usuario.");
		System.out.println("La palabra clave class introduce una declaración");
		System.out.println("de clase Java,");
		System.out.println("la cual debe ir seguida inmediatamente del nombre de la clase");
		System.out.println("(Texto_1 por ejemplo).");
		System.out.println("Las palabras clave o reservadas son de uso exclusivo de Java y ");
		System.out.println("siempre se escriben minúscula.");
*/
		
		String fileName = "C:\\Users\\Usuario\\eclipse-workspace\\Practica2ComIT\\src\\archivo.txt";
		Scanner scan = new Scanner(new File(fileName));
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println(line);
		}
	}

}
