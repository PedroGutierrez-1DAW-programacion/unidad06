package ej05_strings;

public class Ej04_cifradorCesar {

	public static void main(String[] args) {
		
		String frase = "hola";
		
		System.out.println(cifradorCesar(frase, 1)); // ipmb
		System.out.println(cifradorCesar(frase, 3)); // krod
	}

	private static String cifradorCesar(String frase, int n) {
		String let = "abcdefghijklmnopqrstuvwxyz";
		String cifrado = "";
		
		for(int i=0; i<frase.length(); i++)
			cifrado += let.charAt((let.indexOf(frase.charAt(i)) + n) % let.length());
		
		return cifrado;
	}
	
	

}
