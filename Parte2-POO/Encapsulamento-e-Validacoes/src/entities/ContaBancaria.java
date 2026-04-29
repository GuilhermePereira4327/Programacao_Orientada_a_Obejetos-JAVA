package entities;

public class ContaBancaria {
	private String titular;
	private Double saldo;
	private Integer numeroDaConta;
	
	public ContaBancaria(String titular, Double saldo, Integer numeroDaConta) {
		this.titular = titular;
		this.saldo = saldo;
		this.numeroDaConta = numeroDaConta;
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void depositar(Double valor) {
		this.saldo += valor;
	}
	
	public String sacar(Double valor) {
		if(valor <= 0 || valor <= 4) {
			return "Saldo indisponivel, ou abaixo do necessario";
		}
		
		saldo -= valor;
		return "Saque de R$ " + String.format("%.2f", valor) + " feito com sucesso!";
	}
	
	public String exibirSaldo() {
		return "Saldo: R$ " + String.format("%.2f", saldo);
	}
}
