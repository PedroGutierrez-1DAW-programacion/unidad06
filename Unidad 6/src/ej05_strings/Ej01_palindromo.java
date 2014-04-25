package ej05_strings;

public class Ej01_palindromo {

	public static void main(String[] args) {
		
		String frase = "daba la zorra arroz al abad";
		
		System.out.println(esPalindromo(frase));

	}

	private static boolean esPalindromo(String frase) {
		boolean esPalindromo = true;
		
		for(int i=0; i<frase.length()/2 && esPalindromo; i++)
			if(frase.charAt(i) != frase.charAt(frase.length() - i - 1))
				esPalindromo = false;
		
		return esPalindromo;
	}

}
