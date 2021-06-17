import java.util.Scanner;

public class Ex008Tabuada {

	public static void main(String[] args) {
		// Fazer uma Tabuada
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("==================== \n"
				         + "       TABUADA       \n"
				         + "==================== \n");
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		System.out.printf("Tabuada do número %d \n \n", numero);
		
		for(int i=0; i<11; i++) {
			System.out.printf(" %d X %d = %d \n", numero, i, numero * i);
		}
		
		
		sc.close();

	}

}
