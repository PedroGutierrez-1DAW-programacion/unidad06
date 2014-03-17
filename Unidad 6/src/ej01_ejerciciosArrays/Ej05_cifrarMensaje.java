package ej01_ejerciciosArrays;

import java.util.Scanner;

public class Ej05_cifrarMensaje {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char[] mensaje;
		
		System.out.print("Intoduce el mensaje: ");
		mensaje = teclado.nextLine().toCharArray();
		
		if((new String(mensaje)).matches("[a-z0-9]+")){
			for(int i=0; i<mensaje.length; i++)
				mensaje[i] += (i != mensaje.length - 1 ?
					mensaje[i+1] :
					4) + 3;
			System.out.println("Mensaje cifrado:");
			System.out.println(new String(mensaje));
		}else{
			System.err.println("Has usado caracteres prohibidos.");
		}
		
		teclado.close();
	}

}
