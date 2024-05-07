

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {

		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um n�mero para verificar se � primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO n�mero " + numero + " � primo.");
		} else {
			System.out.println("\nO n�mero " + numero + " n�o � primo.");
		}

		scanner.close();

	}

}