import java.util.Scanner;
import java.util.Random;

public class Ex005JogaDaAdivinhacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random sorte = new Random();
		
		int numeroUsuario, numeroSorte;
		
		System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--= \n"
			           	 + "  Vou pensar em um numero entre 0 e 5. Tente adivinhar... \n"
			           	 + "=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--= \n");
		
		numeroSorte = sorte.nextInt(6);
		
		System.out.print("Em que n�mero eu pensei: ");
		numeroUsuario = sc.nextInt();
		
		if (numeroSorte == numeroUsuario) {
			System.out.println("Parab�ns! Voc� conseguiu me vencer!");
		}
		else {
			System.out.printf("Ganhei! Eu pensei no n�mero %d e n�o no %d!", numeroSorte, numeroUsuario);
		}
		
		sc.close();
		
	}

}
