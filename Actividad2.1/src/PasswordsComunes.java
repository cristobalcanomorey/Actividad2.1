import java.util.ArrayList;

public class PasswordsComunes {

	private ArrayList<String> passwordsComunes = new ArrayList<String>();

	/***
	 * Guarda un array con los passwords más comunes
	 */
	public PasswordsComunes() {
		String passwords[] = { "123456", "123456789", "qwerty", "password", "111111", "12345678", "abc123", "1234567",
				"password1", "12345" };

		for (int i = 0; i < passwords.length; i++) {
			this.passwordsComunes.add(passwords[i]);
		}
	}

	/***
	 * Busca la contraseña en el array de passwords comunes.
	 * 
	 * @param password Contraseña del usuario
	 * @return True si es comun, false si no lo es
	 */
	public boolean esComun(String password) {
		for (String pas : passwordsComunes) {
			if (pas.equals(password)) {
				return true;
			}
		}
		return false;

	}

}
