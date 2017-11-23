package controller;

import model.*;

public class processaEstoque implements Runnable {
	private Produto p;
	private int qtde_subtraida;
	
	public processaEstoque(Produto p, int qtde_subtraida){
		this.p = p;
		this.qtde_subtraida = qtde_subtraida;
	}
	
	public synchronized void debitaQtdeVendas(){
		p.setQtde_estoque(p.getQtde_estoque() - this.qtde_subtraida);
	}
	
	public void run() {
        this.debitaQtdeVendas();
	}

}
