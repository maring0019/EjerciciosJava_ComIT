package Practica4;
/*
 * 1) Verdadero o Falso. IF (falso==true) {Justifique}.
a. Los Array pueden ser de cualquier tipo de dato, incluidos objetos. 
TRUE

 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Persona persona=new Persona(5);
		Persona persona1=new Persona(2);
		persona1=new Persona(4);
		Persona[] array = {persona, persona1};
		
		
		//que muestra?
		System.out.println(array); //[LPractica4.Persona;@7de26db8
		System.out.println("Edad 1 : " + array[0].edad + " Edad 2: "+  array[1].edad);
		
		
		

	}

}
