import java.util.ArrayList;
import java.util.Properties;

public class PasswordsComunes {

	private ArrayList<String> passwordsComunes = new ArrayList<String>();

	public PasswordsComunes(Properties prop) {
		ArrayList<String> pas = new ArrayList<String>();

		for (String key : prop.stringPropertyNames()) {
			pas.add(key);
		}

	}

	public boolean esComun(String password) throws Exception{
		if(password == null) {
			throw new Exception();
		} else {
			for (String pas : passwordsComunes) {
				if (pas.equals(password)) {
					return true;
				}
			}
			return false;
		}
		
	}

}
