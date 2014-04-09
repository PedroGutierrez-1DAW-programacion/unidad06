package ej04_validarCuentaBancaria;

public class Validar {
	private int[] cuenta = new int[20];
	private boolean validado = false;
	private boolean valido;
	private final int[] nVal = new int[]{6, 3, 7, 9, 10, 5, 8, 4, 2, 1};

	public Validar(String cuenta){
		this.cuenta = toIntArray(cuenta.replaceAll("[^0-9]", ""));
	}
	
	private int[] toIntArray(String cuenta) {
		char[] numeros = cuenta.toCharArray();
		int[] array = new int[cuenta.length()];
		
		for(int i=0; i<numeros.length; i++)
			array[i] = Integer.parseInt("" + numeros[i]);
			
		return array;
	}

	public boolean esValido(){
		if(validado)
			return this.valido;
		
		this.valido = validarCuenta();
		
		this.validado = true;
		return this.valido;
	}

	private boolean validarCuenta() {
		if(this.cuenta[8] != numeroParaValidar(subArray(this.cuenta, 0,8))) return false;
		if(this.cuenta[9] != numeroParaValidar(subArray(this.cuenta, 10,10))) return false;
			
		return true;
	}

	private int numeroParaValidar(int[] numeros) {
		int n = 0;
		
		for(int i=0; i<numeros.length; i++)
			n += this.nVal[i] * numeros[numeros.length - i - 1];
		
		return 11 - (n % 11);
	}

	private int[] subArray(int[] array, int inicio, int largo) {
		int[] resp = new int[largo];
		int pos = 0;
		
		for(int i=inicio; i<(inicio+largo); i++)
			resp[pos++] = array[i];
		
		return resp;
	}
	
	public String toString(){
		String ret = "";
		
		for(int n : this.cuenta)
			ret += n;
		
		ret += this.esValido() ?
			"\t[Es válido]" :
			"\t[No es válido]";
			
		return ret;
	}
}
