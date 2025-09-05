package com.Financeiro.banco;
import com.Financeiro.banco.ContaBancaria;
import com.Financeiro.banco.ContaCorrente;
import com.Financeiro.banco.ContaPoupanca;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
       int opcao;
      
		System.out.println(" ===== Sistema Bancario techBanck ====");
		
		System.out.println("==== Conta Corrente ====");
		ContaCorrente ContaCorrente = new ContaCorrente ("12345-6", 2000.0, "Maria Soares",100.0 );
		
		System.out.println("Titular:" + ContaCorrente.getTitular());
		System.out.println("Saldo inicial: R$" + ContaCorrente.getsaldo());
		
		System.out.println("\n--- CONTA POUPANÇA ---");
		
		ContaPoupanca ContaPoupanca = new ContaPoupanca("09876-5", 3000.0, "João Maria", 100.0);
		System.out.println("Titular:" + ContaPoupanca.getTitular());
		System.out.println("Saldo inicial: R$" + ContaPoupanca.getsaldo());
		
		
		
		do {
           System.out.println("\n=========== MENU PRINCIPAL ===========");
           System.out.println("1️  - Depositar em Conta Corrente");
           System.out.println("2️  - Sacar de Conta Corrente");
           System.out.println("3️  - Depositar em Poupança");
           System.out.println("4️  - Sacar de Poupança");
           System.out.println("5️  - Aplicar Rendimento na Poupança");
           System.out.println("6 - Ver Saldos");
           System.out.println("7  - Ver Informações das Contas");
           System.out.println("0️  - Sair");
          
           System.out.print("Escolha uma opção: ");
          
           opcao = scanner.nextInt();
          
           switch (opcao){
           case 1:{
        	   System.out.println("Valor para depositar na conta corrente: R$");
        	   double valorDeposito = scanner.nextDouble();
        	   ContaCorrente.depositar(valorDeposito);
        	   break;
           }
           case 2: {
        	   System.out.println("Valor para sacar na conta corrente: R$");
        	   double sacar = scanner.nextDouble();
        	   ContaCorrente.sacar(valorsaque);
        	   break;
        	   
           }
           case 3:{
        	   System.out.println("Valor para depositar na conta poupança: R$");
        	   double deposito = scanner.nextDouble();
        	   ContaPoupanca.depositar(valorDeposito);
        	   break;
           }
           case 4:{
        	   System.out.println("Valor para sacar na poupança: R$");
        	   double sacar = scanner.nextDouble();
        	   ContaPoupanca.sacar(valorsaque);
        	   break;
           }
           case 5:{
        	   System.out.println("Valor para Render: R$");
        	   double taxa = scanner.nextDouble();
        	   ContaPoupanca.aplicarRendimento(depositar);
        	   break;
           }
           case 6:{
        	  System.out.println("Saldo Dísponivel: "+ saldo);       	  
           }
           case 7:{
        	  System.out.println("Titular: " + Titular); 
        	  System.out.println("Número da conta: "+ numeroConta);
         	  System.out.println("Saldo: "+ saldo);
         	  System.out.println("Rendimento: "+ taxa);
         	  System.out.println("Cheque especial: "+  LimiteChequeEspecial);
         	     
           }
           case 0:{
        	   System.out.println("Saindo do sistema!");
        	   break;
           default:
               System.out.println("Opção inválida! Por favor, tente novamente.");
               break;
           }
           
		}
		}
		 while (opcao != 0);
		 
		scanner.close();
		
	}
}

