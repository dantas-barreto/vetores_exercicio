package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Locatario;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int quartosAlugados = teclado.nextInt();
		Locatario[] vetor = new Locatario[10];
		
		for (int i = 0; i < quartosAlugados; i++) {
			teclado.nextLine();
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			String nome = teclado.nextLine();
			System.out.print("Email: ");
			String email = teclado.nextLine();
			System.out.print("Room: ");
			int quarto = teclado.nextInt();
			vetor[quarto - 1] = new Locatario(nome, email, quarto);
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < 9; i++) {
			if (vetor[i] != null) {
				System.out.println(vetor[i]);
			}
		}
		
		teclado.close();
	}

}
