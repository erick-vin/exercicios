import java.util.Scanner;

public class Ex004MediaAlunos {

	public static void main(String[] args) {
		/*O Programa lê duas notas de um aluno
		 * e calcula sua média e diz se o aluno 
		 * foi aprovado ou reprovado,
		 * media de aprovação maior ou igual a 7*/
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("================== \n"
			           	 + " MEDIA DOS ALUNOS \n"
			           	 + "================== \n");
		
		System.out.print("Digite a Primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Digite a Segunda nota: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		System.out.printf("O aluno teve media %.2f \n", media);
		
		if (media >= 7) {
			System.out.println("Ele foi APROVADO!");
		}
		else {
			System.out.println("Ele foi REPROVADO!");
		}
		
		
		sc.close();

	}

}
