package br.paulo.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
	
	private Register registro = new Register();
	private List<String> usuarios;
	private Scanner ler;
	private String entrada, userLogado;

	public void Login() {
		
		System.out.print("1- Login\n2- Registrar Acesso\n>>");
		entrada = ler.nextLine();
		
		if(Integer.parseInt(entrada) == 1) {
			entrada = "";
			System.out.print("User>> ");
			entrada = ler.nextLine();
			System.out.print("Senha>> ");
			entrada += ";" + ler.nextLine();
			if(usuarios.contains(entrada)) {
				System.out.println("Usuário logado!");
				setUserLogado(entrada.split(";")[0]);
				return;
			}
			System.out.println("Usuário ou senha incorreta.");
		} else if(Integer.parseInt(entrada) == 2) {
			registerUser();
		}
	}
	
	/*
	 * Função responsável por criar um novo usuário no sistema
	 */
	public void registerUser() {
		usuarios.add(registro.Register());
		System.out.println("Usuário registrado.");
	}
	
	/*
	 * Inicia os objetos a serem usados
	 */
	public void InitObjects() {
		usuarios = new ArrayList<String>();
		ler = new Scanner(System.in);
	}
	
	public String getUserLogado() {
		return userLogado;
	}

	public void setUserLogado(String userLogado) {
		this.userLogado = userLogado;
	}
	
	public List<String> getList() {
		return usuarios;
	}
}
