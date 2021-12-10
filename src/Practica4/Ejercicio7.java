package Practica4;
/*
 *7) ¿Cuál es la diferencia entre estas sentencias? ¿Explique la diferencia y si hay errores de compilación? 

 */
public class Ejercicio7 {

	public static void main(String[] args) {
	
		
		//a.El error es que el int[] tipo array no lo puede tomar como int para n
		
		//int[] u = {}, n = 9;
		
		
		//System.out.println("u:" + u); 
		//System.out.println("n: " + n);
		
		//b. Aca si lo toma porque el int no esta como un array
		
		int  u[] = new int[] {1, 2}, n = 2; 
		System.out.println("u:" + u); //[LPractica4.Persona;@7de26db8
		System.out.println("n: " + n);
		
		
		
		

	}

}
