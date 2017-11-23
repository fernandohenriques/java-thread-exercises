package model;

import java.util.*;

public class Vendas {

	private int id;
	private Filial filial;
	private Date data_venda;
	private Produto produto;
	private int qtde;
	private double valor_venda;
	
	public Vendas(Filial filial, Date data_venda, Produto produto, int qtde, double valor_venda) {
		this.filial = filial;
		this.data_venda = data_venda;
		this.produto = produto;
		this.qtde = qtde;
		this.valor_venda = valor_venda;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Filial getFilial() {
		return filial;
	}
	public void setFilial(Filial filial) {
		this.filial = filial;
	}
	public Date getData_venda() {
		return data_venda;
	}
	public void setData_venda(Date data_venda) {
		this.data_venda = data_venda;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public double getValor_venda() {
		return valor_venda;
	}
	public void setValor_venda(double valor_venda) {
		this.valor_venda = valor_venda;
	}
	
}
