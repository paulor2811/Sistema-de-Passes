import br.paulo.login.Login;

public class Main {
	
	final String user = "adm";
	final String pw = "adm";

	public static void main(String[] args) {
		
		Login login = new Login();
		login.InitObjects();
		while(true) {
			login.Login();
		}
	}

}
