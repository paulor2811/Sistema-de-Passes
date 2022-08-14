package br.paulo.login;

import java.util.Scanner;

public class Register {
	
	String userNome, userLogin, userPw, userLevel;
	
	

	public String Register() {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Nome do usuário: ");
		setUserNome(ler.nextLine());
		
		System.out.print("Login do usuário: ");
		setUserLogin(ler.nextLine());
		
		System.out.print("Senha do usuário: ");
		setUserPw(ler.nextLine());
		
		System.out.print("Level do usuário: ");
		setUserLevel(ler.nextLine());
		
		return userLogin + ";" + userPw;
	}
	
	public String getUserNome() {
		return userNome;
	}

	public void setUserNome(String userNome) {
		this.userNome = userNome;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
}
