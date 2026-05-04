package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Positions;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		Positions[] p1 = new Positions[n];
		Positions[] p2 = new Positions[n];
		Positions[] result = new Positions[n];
		
		System.out.println("Digiet os valores do vetor A: ");
		for(int i = 0; i < p1.length; i++) {
			p1[i] = new Positions(sc.nextInt());
		}
		
		System.out.println("Digiet os valores do vetor B: ");
		for(int i = 0; i < p2.length; i++) {
			p2[i] = new Positions(sc.nextInt());
		}
		
		System.out.println("Digiet os valores do vetor B: ");
		for(int i = 0; i < p2.length; i++) {
			result[i] = new Positions(p1[i].getValue() + p2[i].getValue());
			System.out.println(result[i].getValue());
		}
		
		sc.close();

	}

}
