package entities;

public class Produto {
	
	private String nome;
	private Double preco;
	private Integer unidade;
	
	public Produto(String nome, Double preco, Integer unidade) {
		if(nome == null || preco == null || unidade == null) {
			throw new EntitiesException("Campos não preenchidos");
		}
		if(preco < 0.0 || unidade < 0) {
			throw new EntitiesException("Informações numericas incorretas");
		}
		this.nome = nome;
		this.preco = preco;
		this.unidade = unidade;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getUnidade() {
		return unidade;
	}
	
	private double total() {
		return preco * unidade;
	}
	
	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", total());
	}

}
