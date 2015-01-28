
public class Conta {
	
	private int cem;
	private int cinquenta;
	private int vinte;
	private int dez;
		
	public void sacar(double valor){
		cem = (int) valor / 100;
		valor = valor - (cem * 100);
		
		cinquenta = (int) valor / 50;
		valor = valor - (cinquenta * 50);
		
		vinte = (int) valor / 20;
		valor = valor - (vinte * 20);
		
		dez = (int) valor / 10;
		valor = valor - (dez * 10);
		
		if (valor == 0){
			System.out.println("Notas de 100 :" + cem);
			System.out.println("Notas de 50 :" + cinquenta);
			System.out.println("Notas de 20 :" + vinte);
			System.out.println("Notas de 10 :" + dez);
		} else		
		System.out.println("Impossível realizar o saque");
	}
}
