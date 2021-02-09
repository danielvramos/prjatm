package br.edu.infnet.prjatm;
import java.io.Console;
import java.io.IOException;
import java.util.Scanner;
public class Atm {
	public static void main(String[] args) {
		
		Console console = System.console();
		
		
		if(console == null) {
			System.out.println("Bem vindo!" );
			System.out.print("Por favor entre com seu número de conta: ");
			Scanner scan = new Scanner(System.in);
			int numeroContaDigitado = scan.nextInt();
			
			if(contaExiste(numeroContaDigitado)) {
				System.out.print("Digite seu PIN: ");
				scan = new Scanner(System.in);
				int numeroPinDigitado = scan.nextInt();
				}
			exibeMainMenu();
			}
		else {
			System.out.println("Bem vindo!" );
			System.out.print("Por favor entre com seu número de conta:");
			Scanner scan = new Scanner(System.in);
			int numeroContaDigitado = scan.nextInt();
			
			if(contaExiste(numeroContaDigitado)) {
				char[] passArray = console.readPassword("Digite seu PIN: ");
				System.out.println("Conta --->" + new String (passArray));
			}
		}
		
		
	}
	public static boolean contaExiste(int numeroConta) {
		return true;
	}
	
	public static void exibeMainMenu() {
		
		
		
		final String os = System.getProperty("os.name");
        if (os.contains("Windows"))
			try {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} catch (InterruptedException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		else
			try {
				Runtime.getRuntime().exec("clear");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	} 
	
}
