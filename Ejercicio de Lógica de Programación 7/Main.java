package ejercicio7;

import java.util.Scanner;
import java.text.Normalizer;

// Ejercicio 7
// Nota: en el ejemplo del ejercicio la salida está mal, tiene 60 minutos menos de lo que debería ser.

public class Main {
	
	//Función para remover las tildes de la palabra
	public static String stripAccents(String s) {
	    s = Normalizer.normalize(s, Normalizer.Form.NFD);
	    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	    return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minsToWeekend = 0;
		String day = "";
		int hour = -100;
		int minutes = -100;
		
		while(true) {
			System.out.println("Ingresa un día (lunes a viernes)");
			day = sc.nextLine().trim().toLowerCase();
			day = stripAccents(day);
			if (day.equals("lunes") || day.equals("martes") || day.equals("miercoles") || day.equals("jueves") || day.equals("viernes") || day.equals("sabado") || day.equals("domingo")){
				break;
			}else {
				System.out.println("Por favor, ingresa un día válido");
				continue;
			}
		}
		
		while(hour>23 || hour<0) {
			System.out.println("Ingresa la hora (0-23)");
			hour = sc.nextInt();
			if (hour>23 || hour<0) System.out.println("Hora inválida.");
		}
		
		while(minutes>59 || minutes<0) {
			System.out.println("Ingresa los minutos (0-59)");
			minutes = sc.nextInt();
			if (minutes>59 || minutes<0) System.out.println("Minutos inválidos.");
		}
		
		int dayMinutes = 1440 - (minutes+hour*60);
		
		switch(day.trim().toLowerCase()) {
		case "lunes":
			minsToWeekend = 3*1440 + 900 + dayMinutes;
			break;
		case "martes":
			minsToWeekend = 2*1440 + 900 + dayMinutes;
			break;
		case "miercoles":
			minsToWeekend = 1*1440 + 900 + dayMinutes;
			break;
		case "jueves":
			minsToWeekend = 900 + dayMinutes;
			break;
		case "viernes":
			if (dayMinutes <= 540) {
				System.out.println("Ya es fin de semana.");
			}else {
				minsToWeekend = dayMinutes - 540;
			}
			break;
		case "sabado":
			System.out.println("Ya es fin de semana.");
			break;
		case "domingo":
			System.out.println("Ya es fin de semana.");
			break;
		default:
			System.out.println("No es un día válido.");
		}
		if (minsToWeekend !=  0) System.out.println("Faltan "+minsToWeekend+" minutos para el fin de semana.");

		sc.close();
	}

}
