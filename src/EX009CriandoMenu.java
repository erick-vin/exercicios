import java.util.Scanner;

public class EX009CriandoMenu {

	public static void main(String[] args) {
		// Criar um Menu de opções

		Scanner sc = new Scanner(System.in);
		int numero1, numero2;

		int contador1 = 0;

		while (contador1 < 1) {

			System.out.println("Informe os Valores - ");

			System.out.print("Primeiro Valor: ");
			numero1 = sc.nextInt();

			System.out.print("Segundo Valor: ");
			numero2 = sc.nextInt();

			int contador2 = 0;
			while (contador2 < 1) {
				System.out.print("\n ======================= \n" 
			                   + "    MENU DE OPÇÕES \n"
			                   + "======================= \n \n" 
			                   + "[1] Somar \n" 
			                   + "[2] Multiplicar \n" 
			                   + "[3] Maior \n"
			                   + "----------------- \n" 
			                   + "[4] Novos números \n" 
			                   + "[5] sair do programa \n");

				int resposta = sc.nextInt();
				
				if (resposta == 1) {
					int calculo = numero1 + numero2;
					System.out.printf("A soma de %d e %d é igual %d \n", numero1, numero2, calculo);
				}
				else if (resposta == 2){
					int calculo = numero1 * numero2;
					System.out.printf("A Multiplicação de %d e %d é igual %d \n", numero1, numero2, calculo);
				}
				else if (resposta == 3) {
					if (numero1 > numero2) {
						System.out.printf("Entre %d e %d, O número %d é maior.\n", numero1, numero2, numero1);
					}
					else {
						System.out.printf("Entre %d e %d, o número %d é maior. \n", numero1, numero2, numero2);
					}
				}
				else if (resposta == 4) {
					contador2 = 1;
				}
				else if (resposta == 5) {
					contador1 = 1;
					contador2 = 1; 
				}
				else {
					System.out.println("Opção invalida, tente novamente!");
				}
			}
		}
		
		System.out.println("Programa Finalizado!");
		
		sc.close();
	}

}
