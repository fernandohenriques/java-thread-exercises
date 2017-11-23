package model;

public class Conta {
	
	private String numeroConta;
	private double saldo;
	
	public Conta(String conta, double saldo) {
		this.numeroConta = conta;
		this.saldo = saldo;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "A conta " + numeroConta + " possui saldo de " + saldo + " no momento.";
	}

}
