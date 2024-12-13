package ejercicio9;

import java.text.Normalizer;
import java.util.HashMap;
import java.util.Scanner;

// Ejercicio 9

public class Main {

	//Función para remover las tildes de la palabra
		public static String stripAccents(String s) {
		    s = Normalizer.normalize(s, Normalizer.Form.NFD);
		    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		    return s;
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dictionary = new HashMap<>();
		
		dictionary.put("gato", "cat");
        dictionary.put("perro", "dog");
        dictionary.put("casa", "house");
        dictionary.put("arbol", "tree");
        dictionary.put("libro", "book");
        dictionary.put("coche", "car");
        dictionary.put("computadora", "computer");
        dictionary.put("telefono", "phone");
        dictionary.put("agua", "water");
        dictionary.put("comida", "food");
        dictionary.put("sol", "sun");
        dictionary.put("luna", "moon");
        dictionary.put("estrella", "star");
        dictionary.put("flor", "flower");
        dictionary.put("rio", "river");
        dictionary.put("cielo", "sky");
        dictionary.put("llave", "key");
        dictionary.put("amigo", "friend");
        dictionary.put("amor", "love");
        dictionary.put("musica", "music");
        
        System.out.println("Ingresa una palabra para buscar su traducción al inglés en el diccionario:");
        String word = sc.nextLine();
        word = word.trim().toLowerCase();
        word = stripAccents(word);
        if (dictionary.containsKey(word)) {
        	System.out.println(dictionary.get(word));
        }else {
        	System.out.println("La palabra no se encuentra en el diccionario");
        }
        sc.close();
	}

}
