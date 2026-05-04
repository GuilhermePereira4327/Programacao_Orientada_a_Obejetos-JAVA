package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Position;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas numeros serao digitadas? ");
		int n = sc.nextInt();
		Position[] posicao = new Position[n];
		
		for(int i = 0; i < posicao.length; i++) {
			System.out.print("Digite um numero: ");
			posicao[i] = new Position(sc.nextInt());
		}
		
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i < posicao.length; i++) {
			if(posicao[i].getPositions() < 0) {
				System.out.println(posicao[i].getPositions());
			}
		}
		
		sc.close();
	}

}
