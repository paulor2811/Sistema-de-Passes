package br.paulo.cadastro;

import java.util.Scanner;

public class Cadastro {

	
	String clienteNome, clienteTelefone, clienteCPF, clienteCidade;
	
	public Cadastro() {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Nome do cliente: ");
		setClienteNome(ler.nextLine());
		
		System.out.print("Telefone do cliente: ");
		setClienteTelefone(ler.nextLine());
		
		System.out.print("CPF do cliente: ");
		setClienteCPF(ler.nextLine());
		
		System.out.print("Cidade do cliente: ");
		setClienteCidade(ler.nextLine());
	}
	
	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public String getClienteTelefone() {
		return clienteTelefone;
	}

	public void setClienteTelefone(String clienteTelefone) {
		this.clienteTelefone = clienteTelefone;
	}

	public String getClienteCPF() {
		return clienteCPF;
	}

	public void setClienteCPF(String clienteCPF) {
		this.clienteCPF = clienteCPF;
	}

	public String getClienteCidade() {
		return clienteCidade;
	}

	public void setClienteCidade(String clienteCidade) {
		this.clienteCidade = clienteCidade;
	}
	
}
