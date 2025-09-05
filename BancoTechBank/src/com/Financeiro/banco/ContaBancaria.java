package com.Financeiro.banco;

public class ContaBancaria {
	public static void main(String[] args) {
		
	}
		private String numeroConta;
		private double saldo;
		private String Titular;
		
		public ContaBancaria(String numeroConta, double saldo, String Titular) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.Titular = Titular;
		
		}
		
		public void depositar (double valor) {
			if (valor > 0) {
				saldo += valor;
				System.out.println("Depositar de R$" + valor + "Realizado com sucesso!");
				
			}
		}
		public boolean sacar(double valor) {
			if (valor > 0 && saldo >= valor) {
				saldo -= valor;
				System.out.println("Saque de R$" + valor +  "Realizado com sucesso!");
				return true;
			}
			
			System.out.println("Saldo R$" + valor + " insuficiente");
			return true;
			
		}
		public String getnumeroConta() { return numeroConta;
		}
		public double getsaldo() { return saldo;
		}
		public String getTitular() { return Titular;
		

	}
	
	}

