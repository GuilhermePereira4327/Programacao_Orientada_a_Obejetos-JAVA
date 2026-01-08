package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		People[] pessoas = new People[n];
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double heigth = sc.nextDouble();
			pessoas[i] = new People(name, age, heigth);
		}
		
		System.out.println();
		
		double media = 0.0;
		double somaMedia = 0.0;
		System.out.print("Altura media: ");
		for(int i = 0; i < pessoas.length; i++) {
			somaMedia += pessoas[i].getHeight();
		}
		media = somaMedia / n;
		System.out.println(String.format("%.2f", media));
		
		int counter = 0;
		System.out.print("Pessoas com menos de 16 anos: ");
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getAge() < 16) {
				counter += 1;
			}
		}
		double percento = ((double)counter * 100.0) / n;
		System.out.print(String.format("%.1f", percento));
		System.out.println("%");
		
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getAge() < 16) {
				System.out.println(pessoas[i].getName());
			}
		}
		
		sc.close();

	}

}
