package model;

public class Filial {
	private int id;
	private String nome;
	private double totaldeVendas = 0;
	
	public Filial(String nome, double totaldeVendas) {
		this.nome = nome;
		this.totaldeVendas = totaldeVendas; 
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
	
	public void setTotaldeVendas(double total) {
		this.totaldeVendas = total;
	}
	
	public double getTotaldeVendas() {
		return this.totaldeVendas;
	}
	
}
