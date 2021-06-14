import java.util.Scanner;

public class Ex003DadosDeUmNumero {

	public static void main(String[] args) {
		
		/* Criar um programa que pe�a um n�mero
		 * ao usuario e lhe d� algumas informa��es
		 * sobre esse n�mero. */
		
		Scanner sc = new Scanner(System.in);
		
		double numero;
		
		System.out.print("===================== \n"
				         + " Dados de um Numero \n"
				         + "===================== \n \n");
		
		System.out.println("Digite um N�mero,");
		System.out.print("Que lhe darei algumas informa��es: ");
		numero = sc.nextDouble();
		
		System.out.println("");
		System.out.println("Infoma��es: ");
		System.out.printf("- O antecessor do n�mero �: %.0f \n", numero - 1);
		System.out.printf("- O sucessor do n�mero �: %.0f \n", numero + 1);
		System.out.printf("- O dobro do n�mero �: %.0f \n", numero * 2);
		System.out.printf("- A Metade do n�mero �: %.2f \n", numero / 2);
		System.out.printf("- A raiz quadrada �: %.2f \n", Math.sqrt(numero));
		
		sc.close();
	}

}
