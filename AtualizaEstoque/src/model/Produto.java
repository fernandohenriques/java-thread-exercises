package model;

public class Produto {

	private int id;
	private String nome;
	private	int qtde_estoque;
	private	int qtde_minima;
	
	public Produto(String nome, int qtde_estoque, int qtde_minima) {
		this.nome = nome;
		this.qtde_estoque = qtde_estoque;
		this.qtde_minima = qtde_minima;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtde_estoque() {
		return qtde_estoque;
	}
	public void setQtde_estoque(int qtde_estoque) {
		this.qtde_estoque = qtde_estoque;
	}
	public int getQtde_minima() {
		return qtde_minima;
	}
	public void setQtde_minima(int qtde_minima) {
		this.qtde_minima = qtde_minima;
	}
	
	
	
}
