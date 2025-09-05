package com.Financeiro.banco;

public class ContaPoupanca extends ContaBancaria{
	private double taxaRendimento;
	public ContaPoupanca (String numeroConta, double saldo, String Titular, double taxa) {
		super(numeroConta, saldo, Titular);
		this.taxaRendimento = taxaRendimento * 0.10;
	}
	
	public void aplicarRendimento() {
		double Rendimento = getsaldo() * (taxaRendimento);
		depositar(Rendimento);
		System.out.println("Rendimento atual apliacado: R$" + Rendimento);
	}

}
