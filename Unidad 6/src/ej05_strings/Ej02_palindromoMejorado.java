package ej05_strings;

public class Ej02_palindromoMejorado {

	public static void main(String[] args) {
		
		String frase1 = "daba la zorra arroz al abad";
		String frase2 = "Alli ves Sevilla";

		System.out.println(frase1);
		System.out.println(esPalindromo(frase1));
		System.out.println(esPalindromoMejorado(frase1));
		
		System.out.println();
		
		System.out.println(frase2);		
		System.out.println(esPalindromo(frase2));
		System.out.println(esPalindromoMejorado(frase2));

	}

	private static boolean esPalindromo(String frase) {
		boolean esPalindromo = true;
		
		for(int i=0; i<frase.length()/2 && esPalindromo; i++)
			if(frase.charAt(i) != frase.charAt(frase.length() - i - 1))
				esPalindromo = false;
		
		return esPalindromo;
	}

	private static boolean esPalindromoMejorado(String frase) {
		
		frase = frase.replaceAll(" ", "");
		frase = frase.toLowerCase();
		
		return esPalindromo(frase);
	}

}
