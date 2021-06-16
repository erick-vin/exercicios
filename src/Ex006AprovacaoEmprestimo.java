import java.util.Scanner;

public class Ex006AprovacaoEmprestimo {

	public static void main(String[] args) {
		
		/* Escreva um programa para aprovar o emprestimo
		 * banc�rio para a compra de uma casa. O programa
		 * vai perguntar o valor da casa, o sal�rio do comprador
		 * e em quantos anos ele vai pagar.
		 * 
		 * Calcule o valor da presta��o mensal.
		 * sabendo que ela n�o pode exceder 30% do 
		 * sal�rio ou ent�o o empr�stimo ser� negado.*/
		
		Scanner sc = new Scanner(System.in);
		
		double valorCasa, salarioComprador, duracaoEmprestimo, prestacao, minimo;
		
		System.out.println("============================ \n"
				         + "   Simula��o Empr�stimo \n"
				         + "============================ \n");
		
		System.out.print("Qual o Valor da casa: R$");
		valorCasa = sc.nextDouble();
		
		System.out.print("Salario do Comprador: R$");
		salarioComprador = sc.nextDouble();
		
		System.out.print("Quantidade de anos que ser� pago: ");
		duracaoEmprestimo = sc.nextDouble();
		
		prestacao = valorCasa / (duracaoEmprestimo * 12);
		minimo = salarioComprador * 30 / 100;
		
		System.out.printf("Para pagar uma casa de R$ %.2f em %.0f \n", valorCasa, duracaoEmprestimo);
		System.out.printf("a presta��o ser� de R$ %.2f", prestacao);
		
		if (prestacao <= minimo) {
			System.out.println("Empr�stimo pode ser CONCEDIDO!");
		}
		else {
			System.out.println("Empr�stimo NEGADO!");
		}
		
		sc.close();

	}

}
