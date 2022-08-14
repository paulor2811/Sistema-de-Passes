import java.util.Scanner;

import br.paulo.login.Login;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		String entrada;
		
		Login login = new Login();
		login.InitObjects();
		while(true) {
			login.Login();
			if(login.getUserLogado() != null) {
				System.out.println("Usuário(a) " + login.getUserLogado() + " logado.");
				while(true) {
					System.out.print("1- Gerenciar Clientes\n2- Fazer Recargas\n3- Gerenciar Acesso ao Sistema\n4- Logout\n>>");
					entrada = ler.nextLine();
					if(Integer.parseInt(entrada) == 1) {
						return;
					} else if(Integer.parseInt(entrada) == 2) {
						
					} else if(Integer.parseInt(entrada) == 3) {
						while(true) {
							System.out.print("1- Registrar Acesso\n2- Remover Acesso\n>>");
							entrada = ler.nextLine();
							if(Integer.parseInt(entrada) == 1) {
								login.registerUser();
							}
							if(Integer.parseInt(entrada) == 0) {
								break; // Sobe
							}
						}
					} else if(Integer.parseInt(entrada) == 4) {
						login.setUserLogado(null);
						break;
					}
				}
			}
		}
	}

}
