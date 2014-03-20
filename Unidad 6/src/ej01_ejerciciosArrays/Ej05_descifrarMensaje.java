package ej01_ejerciciosArrays;

import java.util.Scanner;

public class Ej05_descifrarMensaje {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char[] mensaje;
		
		System.out.print("Intoduce el mensaje: ");
		mensaje = teclado.nextLine().toCharArray();
		
		for(int i=mensaje.length-1; i>=0; i--)
			mensaje[i] -= (i != mensaje.length-1 ?
				mensaje[i+1] :
				4) + 3;
		System.out.print("Mensaje descifrado:  ");
		System.out.print(new String(mensaje));
		
		teclado.close();
	}
}
