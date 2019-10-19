import java.util.ArrayList;

public class PasswordsComunes {

	private ArrayList<String> passwordsComunes = new ArrayList<String>();

	public PasswordsComunes() {
		String passwords[] = {"123456","123456789","qwerty","password","111111","12345678","abc123","1234567","password1","12345"};
		
		for (int i = 0; i < passwords.length; i++) {
			this.passwordsComunes.add(passwords[i]);
		}
	}

	public boolean esComun(String password){
		for (String pas : passwordsComunes) {
			if (pas.equals(password)) {
				return true;
			}
		}
		return false;
		
	}

}
