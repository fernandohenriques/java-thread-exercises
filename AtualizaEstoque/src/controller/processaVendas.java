package controller;

import model.*;

public class processaVendas implements Runnable {
	private Filial f;
	private double valor;
	
	public processaVendas(Filial f, double valor){
		this.f = f;
		this.valor = valor;
	}
	
	public synchronized void totalPorFilial(){
		this.f.setTotaldeVendas(this.f.getTotaldeVendas()+this.valor);
	}
	
	public void run() {
        this.totalPorFilial();
	}
}
