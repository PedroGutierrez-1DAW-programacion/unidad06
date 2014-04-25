package ej05_strings;

public class Ej05_rotarCadena {

	public static void main(String[] args) {
		
		String frase = "Rotamos la frase un poco.";

		System.out.println(rotarFrase(frase, 4));
		System.out.println(rotarFrase(frase, 12));

	}

	private static String rotarFrase(String frase, int n) {
		
		String rotado = frase.substring(frase.length() - n);
		
		frase = frase.replace(rotado, "");
		
		return rotado + frase;
	}
	
	

}
