package ejercicio6;
import java.util.Scanner;
// Ejercicio 6

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una palabra o frase para ser mostrada de forma invertida.");
		String word = sc.nextLine();
		
		for (int i = word.length()-1; i>=0; i--) {
			System.out.print(word.charAt(i));
		}

		sc.close();
	}

}
