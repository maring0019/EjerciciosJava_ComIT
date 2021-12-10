package Practica3ComIT;

/* 7)	Pasar un período expresado en segundos a un período expresado
 *  en días, horas, minutos y segundos.
 
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pasarTiempoHHMMSS();
	}

	public static void pasarTiempoHHMMSS() {
		int tiempo = 87470;

		int horas = 0;
		int minutos = 0;
		int segundos = tiempo;
		int dias = 0;
		
		if (tiempo < 60) {
			
			segundos = tiempo;
		} else if (tiempo < 3600) {
			
			minutos = tiempo / 60;
			segundos = tiempo % 60;
		} else if (tiempo <86400){
			horas = tiempo / 3600;
			minutos = (tiempo % 3600) / 60;
			segundos = ((tiempo % 3600) % 60);
		} else {
			dias = tiempo/86400;
			horas = (tiempo % 86400)/3600;
			minutos = ((tiempo % 86400)%3600)/60; //(tiempo % 3600) / 60; por que funciona igual?
			segundos = ((tiempo % 86400)%3600)%60;//((tiempo % 3600) % 60); por que funciona igual?
		}

		System.out.println("El tiempo expresado en Dias HH:MM:SS es " + dias + " dias "+ horas + ":" + minutos + ":" + segundos);

	}
}

//tener cuidado en no repetir las definiciones de las variables int horas, int horas.
//1 hora 3600 segundoa
//1 minuto 60 segundos
// 1 dia 86400 segundos
