package Practica5;

public class Ejercicio21 {

	public static void main(String[] args) {
		int[] array = new int[] { 0, 2, 2, 4, 4}, mostrados = new int[array.length];// mostrados inicializar en null
																		// para que no tome el 0
		//Indice para ir colocando los mostrados
		int k = 0;
		boolean esta = false;
		
		System.out.println("Arreglo original: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("Elementos no repetidos: ");
		
		for (int i = 0; i < array.length; i++) {
			//supongo que cada elemento no esta en mostrados (que no este repetido)
			esta = false;
			//Para recorrer todo el array de mostrados. Debe recorrer todo.
			for (int j = 0; j < mostrados.length; j++) {
				//considero aparte el caso del 0 porque inicialmente el array se inicializa en 0 por defecto.
				if (array[i] == 0 && i == 0) {
					break;
					//Busco si está en mostrados. Si es así, está repetido.
				} else if (array[i] == mostrados[j]) {
					esta = true;
					break;
				} 
			}
			//Si no esta repetido, lo agrego en mostrados y lo muestro en pantalla.
			if (!esta) {
				mostrados[k] = array[i];
				k++;
				System.out.println(array[i]);
			}	
		}
		
/*	System.out.println("Arreglo mostrados: ");
		for (int i = 0; i < mostrados.length; i++) {
			System.out.println(mostrados[i]);
		}*/

	}

}
