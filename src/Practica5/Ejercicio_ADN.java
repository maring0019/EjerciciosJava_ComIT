/*
 6. Una cadena de ADN se representa como una secuencia circular de bases
(adenina, timina, citosina y guanina) que es única para cada ser vivo, por
ejemplo:
A T G
T C
A T G
Dicha cadena se puede representar como un vector de caracteres recorriéndola
en sentido horario desde la parte superior izquierda:
A T G C G T A T
Se pide diseñar una clase que represente una secuencia de ADN e incluya un
método booleano que nos devuelva true si dos cadenas de ADN coinciden.
MUY IMPORTANTE: La secuencia de ADN es cíclica, por lo que puede comenzar
en cualquier posición. Por ejemplo, las dos secuencias siguientes coinciden:
A T G C G T A T
A T A T G C G T
 */

package Practica5;

import java.util.Scanner;

public class Ejercicio_ADN {

	public static void main(String[] args) {

		char[] adn1 = new char[] { 'A', 'T', 'G', 'C', 'G' ,'T','A','T'};
		char[] adn2 = new char[]  { 'A', 'T', 'A', 'T', 'G' ,'C','G','T'};

	
		System.out.println("ADN 1");
		for (char i = 0; i < adn1.length; i++) {
			System.out.println(adn1[i]);
		}
		
		System.out.println("ADN 2");
		for (char i = 0; i < adn2.length; i++) {
			System.out.println(adn2[i]);
		}

		
		System.out.println("Match? " + adn(adn1,adn2));
		
	}
	
	static boolean adn(char[] adn1, char[] adn2) {
		boolean coincide=true;
		for (int j = 0; j < adn2.length; j++) {
			char aux;
			aux = adn2[(adn2.length - 1)];
			for (int i = adn2.length - 1; i > 0; i--) {
				adn2[i] = adn2[i - 1];
			}
			adn2[0] = aux;
			
			coincide = true;
			for (int i = 0; i < adn2.length; i++) {
				if (adn1[i] != adn2[i]) {
					coincide = false;
				}
			}
			if (coincide) {
				
				//System.out.println("Si son ...");
				
				break;
			}

		}

		System.out.println("ADN 2 desplazado");
		for (char i = 0; i < adn2.length; i++) {
			System.out.println(adn2[i]);
		}
		return coincide;
	}

}
