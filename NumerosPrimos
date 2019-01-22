package br.com.bradseg;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int x = 0;
		int opcao = 0;
		while (x == 0) {
			System.out.println("Sistema número Primo:");

			System.out.println("Digite a opção desejada");
			System.out.println("1 - Imprimir todos os números primos até um determinado valor");
			System.out.println("2 - Verificar se determinado número é Primo");
			System.out.println("3 - sair");
			opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Escolha o intervalo de números primos que deseja imprimir:");
				System.out.println("Digite o Primeiro Número: ");
				int num1 = ler.nextInt();
				System.out.println("Digite o Segundo Número: ");
				int num2 = ler.nextInt();

				if (num1 < num2) {
					devolveResultado(num1, num2);
				} else {
					devolveResultado(num2, num1);
				}

				break;
			case 2:
				System.out.println("Digite o número que deseja verificar: ");
				int valor = ler.nextInt();
				if (verificaSeEPrimo(valor)) {
					System.out.println("O número: " + valor + " É Primo \n");
				} else {
					System.out.println("O número: " + valor + " Não É Primo \n");
				}

				break;
			case 3:
				x = -1;
				System.out.println("\n Volte Sempre!");
				break;

			default:
				System.out.println("Digite um valor válido!");
				break;
			}

		}

	}

	private static void devolveResultado(int menor, int maior) {
		for (; menor < maior; menor++) {
			if (verificaSeEPrimo(menor)) {
				System.out.print(menor + ", ");
			}

		}
		
		System.out.println("\n \n ========================================= \n");

	}

	public static boolean verificaSeEPrimo(int valor) {
		int contador = 0;
		for (int i = 1; i <= valor; i++) {

			if (valor % i == 0) {
				contador++;
			}

		}
		if (contador == 2) {
			return true;
		}
		return false;
	}

}
