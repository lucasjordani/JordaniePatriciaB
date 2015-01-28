
public class Conta {
	
	private int cem = 2;
	private int cinquenta = 2;
	private int vinte = 3;
	private int dez = 5;
		
	public void sacarInfinito(double valor){
		
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
	
	public void sacarFinito(double valor){
		
		if (((int) valor / 100) <= cem)
			cem = (int) valor / 100;
		
		valor = valor - (cem * 100);
		
		if (((int) valor / 50) <= cinquenta)
			cinquenta = (int) valor / 50;
		
		valor = valor - (cinquenta * 50);
			
		if (((int) valor / 20) <= vinte)
			vinte = (int) valor / 20;
		
		valor = valor - (vinte * 20);
		
		if (((int) valor / 10) <= dez)
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
