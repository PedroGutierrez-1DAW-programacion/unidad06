package ej04_validarCuentaBancaria;

public class Main {

	public static void main(String[] args) {

		System.out.println(new Validar("2100 0813 61 0123456789"));
		System.out.println(new Validar("2100-0813-61-0123456789"));
		System.out.println(new Validar("21000813610123456789"));
		System.out.println(new Validar("2100-0813-6101-2345-6789"));
		System.out.println(new Validar("2100-0813-6101-2345-6789"));

	}

}
