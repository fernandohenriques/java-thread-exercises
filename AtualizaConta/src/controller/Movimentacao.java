package controller;

import java.text.SimpleDateFormat;
import java.util.*;
import model.Conta;

public class Movimentacao implements Runnable {
	
	private int nThread;
	private int nMov;
	private Date dataMov;
	private Conta contaOrigem;
	private Conta contaDestino;
	private double valor;
	
	public Movimentacao(int n, Date d, Conta contaOrigem, Conta contaDestino, double valor){
		this.nMov = n;
		this.dataMov = d;
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
		this.valor = valor;
	}
	
	public synchronized void transferencia(){
		this.contaOrigem.setSaldo(this.contaOrigem.getSaldo() - this.valor);
		this.contaDestino.setSaldo(this.contaDestino.getSaldo() + this.valor);
		
		SimpleDateFormat Format = new SimpleDateFormat("dd/MM/yyyy");
	
		System.out.println("\nThread nº "+this.nThread+":\n\n"
				+ "\nTransferência nº "+this.nMov+", em "+Format.format(this.dataMov)+". "
				+ "Resultado: \n"+contaOrigem+"\n"+contaDestino
		);
	}
	
	public void setNthread(int n){
		this.nThread = n;
	}
	
	public void run() {
		//Executa a movimentação entre as contas
		this.transferencia();	
	}

}
