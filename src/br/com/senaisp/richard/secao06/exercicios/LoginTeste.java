package br.com.senaisp.richard.secao06.exercicios;

import java.io.Console;
import java.util.Scanner;

public class LoginTeste {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//Para não mostrar a senha na digitação
		//Só funcionará na linha de execução fora do eclipse
		Console cons = System.console();
		Login log = new Login("Admin","@dm1n@2023");
		boolean ret;
		do {
			System.out.println("Digite login: ");
			String user = scn.nextLine();
			System.out.println("Digite a senha:");
			//Vamos testar usando o console
			//String senha = scn.nextLine();
			String senha = new String(cons.readPassword());
			ret = log.efetuarLogin(user, senha);
			if (!ret) {
				System.out.println("Usuário ou senha inválidos!");
			}
		}while(!ret&&log.getTentativas()<
				log.getQtdeTentativasLimite());
		if (!ret && 
				log.getTentativas()>= log.getQtdeTentativasLimite()) {
			System.out.println("Sistema Bloqueado! :-(");
		} else {
			System.out.println("Sistema Liberado! :-)");
		}
		scn.close();
	}

}
/*
C:\Users\sn1069942\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.6.v20230204-1729\jre\bin\java.exe -D -classpath "C:\Users\sn1069942\richard1\eclipse-workspace\projetoFoundationRichard\bin" br.com.senaisp.richard.secao06.exercicios.LoginTeste

*/