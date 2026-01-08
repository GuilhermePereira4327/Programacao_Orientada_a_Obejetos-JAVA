package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Position;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		Position[] posicao = new Position[n];
		
		for(int i = 0; i < posicao.length; i++) {
			System.out.print("Digite um numero: ");
			posicao[i] = new Position(sc.nextInt());
		}
		
		System.out.println();
		System.out.println("NUMEORS PARES: ");
		for(int i = 0; i < posicao.length; i++) {
			if(posicao[i].getPositions() % 2 == 0) {
				System.out.print(posicao[i].getPositions() + " ");
			}
		}
		System.out.println();
		
		System.out.println();
		int quantity = 0;
		System.out.print("QUANTIDADE DE PARES = ");
		for(int i = 0; i < posicao.length; i++) {
			if(posicao[i].getPositions() % 2 == 0) {
				quantity += 1;
			}
		}
		System.out.println(quantity);
		
		sc.close();
	}

}
