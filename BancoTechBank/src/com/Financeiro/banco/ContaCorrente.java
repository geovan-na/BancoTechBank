package com.Financeiro.banco;

public class ContaCorrente extends ContaBancaria{
	private double LimiteChequeEspecial;
	
	public ContaCorrente(String numeroConta, double saldo, String Titular, double LimiteChequeEspecial ) {
	super(numeroConta,saldo,Titular);
	this.LimiteChequeEspecial = LimiteChequeEspecial;
	}
		
	public boolean sacar(double valor) {
        if (valor > 0) {
            double saldoDisponivel = getsaldo() + LimiteChequeEspecial;
           
            if (saldoDisponivel >= valor) {
                if (getsaldo() >= valor) {
                   
                    saldo -= valor;
                    System.out.println("Saque de R$" + valor + " realizado com sucesso!");
                } else {
                  
                    double valorUsandoCheque = valor - getsaldo();
                    saldo = 0;
                    LimiteChequeEspecial -= valorUsandoCheque;
                    System.out.println("Saque de R$" + valor + " realizado com sucesso! (R$" + valorUsandoCheque + " utilizando o Limite Especial)");
                }
                return true;
            } else {
                System.out.println("Saldo insuficiente para saque de R$" + valor);
                return false;
            }
        }
       
        System.out.println("Valor de saque inválido!");
        return false;
    }


}
