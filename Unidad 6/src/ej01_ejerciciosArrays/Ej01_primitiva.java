package ej01_ejerciciosArrays;

public class Ej01_primitiva {
	public final static int numerosPorPrimitiva = 5;
	public final static int numeroMaximoPrimitiva = 50;

	public static void main(String[] args) {
		
		boolean[] primitiva = new boolean[numeroMaximoPrimitiva];
		
		primitiva = generarPrimitiva(primitiva);
		
		mostrarPrimitiva(primitiva);
	}

	private static boolean[] generarPrimitiva(boolean[] primitiva) {
		int numeros = numerosPorPrimitiva;
		while(numeros != 0){
			int n = aleatorio(1,numeroMaximoPrimitiva) - 1;
			if(!primitiva[n]){
				primitiva[n] = true;
				numeros--;
			}
		}
		return primitiva;
	}

	private static void mostrarPrimitiva(boolean[] primitiva) {
		System.out.println("+----------+");
		System.out.println("| Numeros: |");
		for(int i=0; i<primitiva.length; i++)
			if(primitiva[i])
				System.out.printf("|%6s    |\n", i+1);
		System.out.println("+----------+");
	}
	
	private static int aleatorio(int base, int rango) {
		return (int) (base + (Math.random() * rango));
	}

}
