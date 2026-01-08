package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Position;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		Position[] posicao = new Position[n];
		sc.nextLine();
		
		for(int i = 0; i < posicao.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			posicao[i] = new Position(name, age);
			sc.nextLine();
		}
		
		int counter = 0;
		int maiorIdade = posicao[0].getAge();
		for(int i = 1; i<posicao.length; i++) {
			if(posicao[i].getAge() > maiorIdade) {
				maiorIdade = posicao[i].getAge();
				counter = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s\n", posicao[counter].getName());
		
		sc.close();
	}

}
