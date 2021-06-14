import java.util.Scanner;

public class Ex002SomandoDoisNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2, resposta;
		
		System.out.printf("======================== \n"
				        + "  Somando dois Números \n"
				        + "======================== \n");
		
		System.out.print("Digite o primeiro número: ");
		numero1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		numero2 = sc.nextInt();
		
		resposta = numero1 + numero2;
		
		System.out.printf("A Soma de %d mais %d é igual a %d", numero1, numero2, resposta);
		
		sc.close();
	}

}
