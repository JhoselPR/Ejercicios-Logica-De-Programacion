package ejercicio10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// Ejercicio 10

public class Main {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int correctAnswers = 0;
			String answer = "";
			HashMap<String, String> dictionary = new HashMap<>();
			
			dictionary.put("gato", "cat");
	        dictionary.put("perro", "dog");
	        dictionary.put("casa", "house");
	        dictionary.put("árbol", "tree");
	        dictionary.put("libro", "book");
	        dictionary.put("coche", "car");
	        dictionary.put("computadora", "computer");
	        dictionary.put("teléfono", "phone");
	        dictionary.put("agua", "water");
	        dictionary.put("comida", "food");
	        dictionary.put("sol", "sun");
	        dictionary.put("luna", "moon");
	        dictionary.put("estrella", "star");
	        dictionary.put("flor", "flower");
	        dictionary.put("río", "river");
	        dictionary.put("cielo", "sky");
	        dictionary.put("llave", "key");
	        dictionary.put("amigo", "friend");
	        dictionary.put("amor", "love");
	        dictionary.put("música", "music");
	        
	        ArrayList<String> words = new ArrayList<>(dictionary.keySet());
	        Collections.shuffle(words);
	        List<String> randomWords = words.subList(0, 5);
	        
	        System.out.println("Escribe la traducción de las siguientes palabras");
	        for (String word : randomWords) {
	        	System.out.println(word);
	        	answer = sc.nextLine().trim().toLowerCase();
	        	if (dictionary.get(word).equals(answer)) {
	        		correctAnswers += 1;
	        	}else {
	        		System.out.println("Respuesta incorrecta.");
	        	}
	        }
	        System.out.println("Tuviste "+correctAnswers+" respuestas correctas.");
	        
	  
	        sc.close();
		}

}
