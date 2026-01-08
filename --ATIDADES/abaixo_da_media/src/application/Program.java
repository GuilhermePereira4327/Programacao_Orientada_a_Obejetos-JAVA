package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Position;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		Position[] posicao = new Position[n];
		
		for(int i = 0; i < posicao.length; i++) {
			System.out.print("Digite um numero: ");
			posicao[i] = new Position(sc.nextDouble());
		}
		System.out.println();
		
		double media = 0.0;
		double soma = 0.0;
		System.out.print("MEDIA DO VETOR = ");
		for(int i = 0; i < posicao.length; i++) {
			soma += posicao[i].getPositions();
		}
		media = soma / n;
		System.out.println(String.format("%.3f", media));
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < posicao.length; i++) {
			if(posicao[i].getPositions() < media) {
				System.out.println(String.format("%.1f", posicao[i].getPositions()));
			}
		}
		
		sc.close();

	}

}
