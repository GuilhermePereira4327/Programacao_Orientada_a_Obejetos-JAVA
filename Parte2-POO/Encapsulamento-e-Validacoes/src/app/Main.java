package app;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		ContaBancaria banco = new ContaBancaria("Guilherme pereira", 100.00, 1598);
		banco.depositar(15.0);
		System.out.println(banco.exibirSaldo().toString());
		System.out.println(banco.sacar(50.68).toString());
		System.out.println(banco.exibirSaldo().toString());
		

	}

}
