
public class HtmlConstructor {

	private String hastaBody = "<!DOCTYPE html>\n" + 
			"<html>\n" + 
			"	<head>\n" + 
			"    	<title>TODO supply a title</title>\n" + 
			"    	<meta charset=\"UTF-8\">\n" + 
			"    	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + 
			"	</head>\n" + 
			"	<body>";	//<html ... <body>
	private String contenido = "<h1>¿Es segura tu contraseña?</h1>\n" + 
			"    	<h3>Calcula cuanto tardaría un hacker en averiguar tu contraseña usando fuerza bruta</h3>";	//<h1> introduce una...
	private String formulario ="<form method=\"GET\" action=\"Main\">\n" + 
			"        	<input type=\"password\" name=\"password\" value=\"Escribe la contraseña\"/>\n" + 
			"        	<p>¿Qué tecnología quieres comprobar?</p>\n" + 
			"        	<input type=\"radio\" name=\"cpu\" value=\"cpu\"/>\n" + 
			"        	<input type=\"radio\" name=\"gpu\" value=\"gpu\"/>\n" + 
			"        	<input type=\"radio\" name=\"grid\" value=\"grid\"/>\n" + 
			"        	<input type=\"submit\" value=\"Calcula\"/>\n" + 
			"    	</form>";
	private String abreResul = "<div id=\"resultado\">";
	private String resul = "";
	private String cierraResul = "</div>";
	private String cierraBody = "</body></html>";
		
	public HtmlConstructor() {
		
	}
	
	public void setResul(String resultado) {
		if(resultado != null) {
			this.resul = "Se tardarían "+resultado+ " en descifrar tu contraseña";
		}
	}
	
	public String toString() {
		return hastaBody + contenido +formulario + abreResul + resul + cierraResul + cierraBody;
	}
	
}
