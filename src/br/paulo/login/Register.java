package br.paulo.login;

import java.util.Scanner;

public class Register {
	
	String userNome, userLogin, userPw, userLevel;
	Scanner ler;
	

	public String Register() {
		ler = new Scanner(System.in);
		
		System.out.print("Nome do usu�rio>> ");
		setUserNome(ler.nextLine());
		
		System.out.print("Login do usu�rio>> ");
		setUserLogin(ler.nextLine());
		
		System.out.print("Senha do usu�rio>> ");
		setUserPw(ler.nextLine());
		
		System.out.print("Level do usu�rio>> ");
		setUserLevel(ler.nextLine());
		
		return userLogin + ";" + userPw;
	}
	
	/*
	 * Devolve o nome do usu�rio
	 */
	public String getUserNome() {
		return userNome;
	}
	
	/*
	 * Seta o nome do usu�rio
	 */
	public void setUserNome(String userNome) {
		this.userNome = userNome;
	}
	
	/*
	 * Devolve o nome de login do usu�rio
	 */
	public String getUserLogin() {
		return userLogin;
	}

	/*
	 * Seta o nome de login do usu�rio
	 */
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	
	/*
	 * Devolve a senha do usu�rio
	 */
	public String getUserPw() {
		return userPw;
	}

	/*
	 * Seta a senha do usu�rio
	 */
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	/*
	 * Devolve o level de acesso do usu�rio
	 */
	public String getUserLevel() {
		return userLevel;
	}
	
	/*
	 * Seta o level de acesso do usu�rio
	 */
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
}
