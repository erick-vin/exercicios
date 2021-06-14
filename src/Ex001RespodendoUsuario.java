import java.util.Scanner;
public class Ex001RespodendoUsuario {

	public static void main(String[] args) {
		
		/* Criar um programa que peça o nome do usuario 
		 * e depois responda o usuario o chamando 
		 * pelo nome informado. */
		
		Scanner sc = new Scanner(System.in);
		String nome;
		
		System.out.print("Digite o seu nome: ");
		nome = sc.next();
		
		System.out.println("Muito Prazer em te conhecer " + nome);
		
		sc.close();
	}

}
