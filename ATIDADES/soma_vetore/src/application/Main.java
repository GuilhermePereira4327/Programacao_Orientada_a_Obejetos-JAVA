package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.Position;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		Position[] posicao = new Position[n];
		
		for(int i = 0; i < posicao.length; i++) {
			System.out.print("Digite um numero : ");
			posicao[i] = new Position(sc.nextDouble());
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		for(int i = 0; i < posicao.length; i++) {
			System.out.print(posicao[i].getPositions() + " ");
		}
		
		double soma = 0.0;
		System.out.printf("\nSOMA = ");
		for(int i = 0; i < posicao.length; i++) {
			soma += posicao[i].getPositions();
		}
		System.out.printf("%.2f\n", soma);
		
		double media =  soma / n;
		System.out.printf("MEDIA = %.2f", media);
		
		sc.close();
	}

}

