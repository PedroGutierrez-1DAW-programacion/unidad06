package ej05_strings;

public class Ej07_contarNumeros {

	public static void main(String[] args) {

		String cadena = "en programación 2 más 2 no son siempre 4, 24 de Abril de 2014."; // 2046
		
		System.out.println(sumaCadena(cadena));

	}

	private static int sumaCadena(String cadena) {
		
		String[] sNum = cadena.split("[^0-9]");
		int suma = 0;

		for(int i=0; i<sNum.length; i++)
			if(sNum[i].matches("[0-9]+"))
				suma += Integer.parseInt(sNum[i]);
		
		return suma;	
	}

}
