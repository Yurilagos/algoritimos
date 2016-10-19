import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int array[] = new int[10];
		int par[] = new int[10];
		int impar[] = new int[10];
		System.out.println("Sejam Bem Vindos!");

		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o numero " + (i+1) + ": ");
			array[i] = ler.nextInt();

			if (array[i] % 2 == 0) {
				par[i] = array[i];
			}
			if (array[i] % 2 == 1) {
				impar[i] = array[i];
			}
		}
		System.out.println("os numeros pares digitados");

		for (int i = 0; i < 10;i++) {
			if (par[i] != 0) {
				System.out.println(par[i]);
			}
		}
		System.out.println("os numeros impares digitados");

		for (int i = 0; i < 10;i++) {
			if (impar[i] != 0) {
				System.out.println(impar[i]);
				ler.close();
			}
		}
	}
}
