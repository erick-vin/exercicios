import java.util.Scanner;

public class Ex006AprovacaoEmprestimo {

	public static void main(String[] args) {
		
		/* Escreva um programa para aprovar o emprestimo
		 * bancário para a compra de uma casa. O programa
		 * vai perguntar o valor da casa, o salário do comprador
		 * e em quantos anos ele vai pagar.
		 * 
		 * Calcule o valor da prestação mensal.
		 * sabendo que ela não pode exceder 30% do 
		 * salário ou então o empréstimo será negado.*/
		
		Scanner sc = new Scanner(System.in);
		
		double valorCasa, salarioComprador, duracaoEmprestimo, prestacao, minimo;
		
		System.out.println("============================ \n"
				         + "   Simulação Empréstimo \n"
				         + "============================ \n");
		
		System.out.print("Qual o Valor da casa: R$");
		valorCasa = sc.nextDouble();
		
		System.out.print("Salario do Comprador: R$");
		salarioComprador = sc.nextDouble();
		
		System.out.print("Quantidade de anos que será pago: ");
		duracaoEmprestimo = sc.nextDouble();
		
		prestacao = valorCasa / (duracaoEmprestimo * 12);
		minimo = salarioComprador * 30 / 100;
		
		System.out.printf("Para pagar uma casa de R$ %.2f em %.0f \n", valorCasa, duracaoEmprestimo);
		System.out.printf("a prestação será de R$ %.2f", prestacao);
		
		if (prestacao <= minimo) {
			System.out.println("Empréstimo pode ser CONCEDIDO!");
		}
		else {
			System.out.println("Empréstimo NEGADO!");
		}
		
		sc.close();

	}

}
