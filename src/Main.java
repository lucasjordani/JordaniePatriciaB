import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println("Digite o valor a ser sacado: ");
		System.out.println("Notas disponíveis de 100, 50, 20 e 10");
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		//conta.sacarInfinito(valor);
		conta.sacarFinito(valor);
	}



}
