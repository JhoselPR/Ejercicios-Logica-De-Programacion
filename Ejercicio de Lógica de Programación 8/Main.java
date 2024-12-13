package ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

// Ejercicio 8

public class Main {

	public static boolean isPrime(int n) {
		if (n <= 1) return false;
		for (int i=2; i<=Math.sqrt(n); i++) {
			if (n%i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		ArrayList<Integer> sortedNums = new ArrayList<>();
		System.out.println("Ingresa 10 números");
		for (int i=0; i<10; i++) {
			nums[i] = sc.nextInt();
			if (isPrime(nums[i])) sortedNums.add(nums[i]);
		}
		
		System.out.println("Array original");
		for (int j=0; j<nums.length; j++) {
			if (!isPrime(nums[j])) sortedNums.add(nums[j]);
			System.out.println("Pos["+j+"] = "+nums[j]);
		}
		
		System.out.println("Array ordenado con los números primos al inicio");
		for (int k=0; k<sortedNums.size(); k++) {
			System.out.println("Pos["+k+"] = "+sortedNums.get(k));
		}
		
		sc.close();
	}

}
