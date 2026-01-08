package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Position;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas numeros serao digitadas? ");
		int n = sc.nextInt();
		Position[] posicao = new Position[n];
		
		for(int i = 0; i < posicao.length; i++) {
			System.out.print("Digite um numero: ");
			posicao[i] = new Position(sc.nextDouble());
		}
		
		System.out.println();
		int counter = 0;
		double maiorValor = 0.0;
		System.out.print("NUMEROS NEGATIVOS: ");
		for(int i = 0; i < posicao.length; i++) {
			if(maiorValor < posicao[i].getPositions()) {
				maiorValor = posicao[i].getPositions();
				counter = i;
			}
		}
		System.out.println(maiorValor);
		System.out.printf("\nPOSICAO DO MAIOR VALOR = %d\n", counter);
		
		sc.close();
	}

}

