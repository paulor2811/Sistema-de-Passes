package br.paulo.login;

import java.util.Scanner;

public class Register {
	
	String userNome, userLogin, userPw, userLevel;
	Scanner ler;
	

	public String Register() {
		ler = new Scanner(System.in);
		
		System.out.print("Nome do usuário>> ");
		setUserNome(ler.nextLine());
		
		System.out.print("Login do usuário>> ");
		setUserLogin(ler.nextLine());
		
		System.out.print("Senha do usuário>> ");
		setUserPw(ler.nextLine());
		
		System.out.print("Level do usuário>> ");
		setUserLevel(ler.nextLine());
		
		return userLogin + ";" + userPw;
	}
	
	/*
	 * Devolve o nome do usuário
	 */
	public String getUserNome() {
		return userNome;
	}
	
	/*
	 * Seta o nome do usuário
	 */
	public void setUserNome(String userNome) {
		this.userNome = userNome;
	}
	
	/*
	 * Devolve o nome de login do usuário
	 */
	public String getUserLogin() {
		return userLogin;
	}

	/*
	 * Seta o nome de login do usuário
	 */
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	
	/*
	 * Devolve a senha do usuário
	 */
	public String getUserPw() {
		return userPw;
	}

	/*
	 * Seta a senha do usuário
	 */
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	/*
	 * Devolve o level de acesso do usuário
	 */
	public String getUserLevel() {
		return userLevel;
	}
	
	/*
	 * Seta o level de acesso do usuário
	 */
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
}
