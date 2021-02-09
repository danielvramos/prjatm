package br.edu.infnet.prjatm;
import java.io.Console;
import java.io.IOException;
import java.util.Scanner;
public class Atm {
	public static void main(String[] args) {
		
	
		
		
		
		System.out.println("Bem vindo!" );
		System.out.print("Por favor entre com seu número de conta: ");
		Scanner scan = new Scanner(System.in);
		String numeroConta = scan.next();
			
			
		System.out.print("Digite seu PIN: ");
		scan = new Scanner(System.in);
		int numeroPin = scan.nextInt();
		
		if(numeroConta.equals("123") && numeroPin == 456 ) {
			int opcao= 0;
			double saldo = 0;
			
			while(opcao != 4) {
				
				// atalho para copiar as linhas crtl+ alt+ seta pra baixo
				System.out.println("Menu");
				System.out.println("1 - Saldo");
				System.out.println("2 - Saque");
				System.out.println("3 - Deposito");
				System.out.println("4 - Sair");
				System.out.println("Entre com opção");
				
				opcao = scan.nextInt();
				
				
				
				switch(opcao) {
				case 1:
					System.out.println("Saldo");
					System.out.println("O saldo é "+ saldo);
				break;
				case 2:
					System.out.println("Saque");
					System.out.println("Qual o valor do saque?");
					double saque = scan.nextDouble();
					if(saque < saldo) {
						saldo -= saque;
					}
				break;
				case 3:
					System.out.println("Deposito");
					System.out.println("Qual o valor a ser depositado: ");
					double valorDepositado = scan.nextDouble();
					saldo += valorDepositado;
				case 4:
					System.out.println("Sair");
				break;
				default:
					System.out.println("Número errado!");
					
					
				}	
			}
		}
	} 
	
}
