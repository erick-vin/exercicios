import java.util.Scanner;

public class Ex002SomandoDoisNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2, resposta;
		
		System.out.printf("======================== \n"
				        + "  Somando dois N�meros \n"
				        + "======================== \n");
		
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = sc.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		numero2 = sc.nextInt();
		
		resposta = numero1 + numero2;
		
		System.out.printf("A Soma de %d mais %d � igual a %d", numero1, numero2, resposta);
		
		sc.close();
	}

}
