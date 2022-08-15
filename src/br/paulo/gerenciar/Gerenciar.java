package br.paulo.gerenciar;

import java.util.List;

public class Gerenciar {
	
	public Gerenciar(String acao, List<String> usuarios, String user) {
		if(acao.equals("1"))
			editUserLogin(usuarios, user);
		else if(acao.equals("2"))
			editUserLogin(usuarios, user);
		else if(acao.equals("3"))
			editUserName(usuarios, user);
		else if(acao.equals("4"))
			editUserPw(usuarios, user);
		else if(acao.equals("5"))
			editUserLevel(usuarios, user);
		else if(acao.equals("6"))
			removeUser(usuarios, user);
	}
	public void editUserLogin(List<String> usuarios, String user) {
		
	}
	public void editUserName(List<String> usuarios, String user) {
		
	}
	public void editUserPw(List<String> usuarios, String user) {
		
	}
	public void editUserLevel(List<String> usuarios, String user) {
		
	}
	public void removeUser(List<String> usuarios, String user) {
		for(int i = 0; i < usuarios.size(); i++) {
			if(usuarios.get(i).split(";")[0].equals(user)) {
				usuarios.remove(i);
				System.out.println("Usuário " + user + " removido.");
				return;
			}
			System.out.println("Usuário não encontrado.");
		}
	}
}
