import java.util.Scanner;
import java.util.Random;

public class Ex007JogoPedraPapelTesoura {

	public static void main(String[] args) {
		// Criar Jogo "Pedra, Papel e Tesoura

		Scanner sc = new Scanner(System.in);
		String[] itens = new String[3];
		Random sorte = new Random();
		int jogadaComputador, jogadaUsuario;
		
		jogadaComputador = sorte.nextInt(2);
		itens[0] = "PEDRA";
		itens[1] = "PAPEL";
		itens[2] = "TESOURA";
		
		
		System.out.println("===================================== \n"
				         + "   Jogo: PEDRA - PAPEL - TESOURA \n"
				         + "===================================== \n");
		
		System.out.print("Suas opções: \n"
				+ "[0] PEDRA \n"
				+ "[1] PAPEL \n"
				+ "[2] TESOURA \n"
				+ "Qual é a sua Jogada? ");
		
		jogadaUsuario = sc.nextInt();
		System.out.printf("--------------------- \n"
				        + "Computador jogou %s \n"
				        + "Jogador jogou %s \n"
				        + "--------------------- \n", itens[jogadaComputador], itens[jogadaUsuario]);
		
		if (jogadaComputador == 0) { // computador jogou PEDRA
			
			if (jogadaUsuario == 0) { 
				System.out.println("EMPATE!");
			}
			else if (jogadaUsuario == 1) {
				System.out.println("JOGADOR VENCE!");
			}
			else if(jogadaUsuario == 2) {
				System.out.println("COMPUTADOR VENCE!");
			}
			else {
				System.out.println("JOGADA INVÁLIDA");
			}
			
		}
		else if (jogadaComputador == 1){ // computador jogou PAPEL
			
			if (jogadaUsuario == 0) {
				System.out.println("COMPUTADOR VENCE!");
			}
			else if (jogadaUsuario == 1) {
				System.out.println("EMPATE!");
			}
			else if (jogadaUsuario == 2) {
				System.out.println("JOGADOR VENCE!");
			}
			else {
				System.out.println("JOGADA INVÁLIDA!");
			}
		}
		else { // computador jogou TESOURA
			
			if (jogadaUsuario == 0) {
				System.out.println("JOGADOR VENCE!");
			}
			else if (jogadaUsuario == 1) {
				System.out.println("COMPUTADOR VENCE!");
			}
			else if (jogadaUsuario == 2) {
				System.out.println("EMPATE!");
			}
			else {
				System.out.println("JOGADA INVÁLIDA!");
			}
		}
		
		
		sc.close();
		
	}

}
