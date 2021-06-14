import java.util.Scanner;

public class Ex003DadosDeUmNumero {

	public static void main(String[] args) {
		
		/* Criar um programa que peça um número
		 * ao usuario e lhe dê algumas informações
		 * sobre esse número. */
		
		Scanner sc = new Scanner(System.in);
		
		double numero;
		
		System.out.print("===================== \n"
				         + " Dados de um Numero \n"
				         + "===================== \n \n");
		
		System.out.println("Digite um Número,");
		System.out.print("Que lhe darei algumas informações: ");
		numero = sc.nextDouble();
		
		System.out.println("");
		System.out.println("Infomações: ");
		System.out.printf("- O antecessor do número é: %.0f \n", numero - 1);
		System.out.printf("- O sucessor do número é: %.0f \n", numero + 1);
		System.out.printf("- O dobro do número é: %.0f \n", numero * 2);
		System.out.printf("- A Metade do número é: %.2f \n", numero / 2);
		System.out.printf("- A raiz quadrada é: %.2f \n", Math.sqrt(numero));
		
		sc.close();
	}

}
