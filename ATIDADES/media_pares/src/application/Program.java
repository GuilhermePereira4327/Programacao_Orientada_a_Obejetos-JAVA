package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Position;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elemnetos vai ter p vetor? ");
		int n = sc.nextInt();
		Position[] posicao = new Position[n];
		
		for(int i = 0; i < posicao.length; i++) {
			System.out.print("Digite um numero: ");
			posicao[i] = new Position(sc.nextInt());
		}
		
		int counter = 0;
		double media = 0.0;
		double somaMedia = 0.0;
		for(int i = 0; i < posicao.length; i++) {
			if(posicao[i].getValue() % 2 == 0) {
				somaMedia += posicao[i].getValue();
				counter += 1;
			}
		}
		
		if(somaMedia == 0 || counter == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			media = somaMedia / counter;
			System.out.println("MEDIA DOS PARES = " + String.format("%.1f", media));
		}
		
		sc.close();
	}

}
