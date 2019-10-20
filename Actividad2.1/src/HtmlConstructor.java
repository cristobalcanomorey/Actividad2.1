
public class HtmlConstructor {

	private String hastaBody = "<html>\n" + 
			"    <head>\n" + 
			"        <title>TODO supply a title</title>\n" + 
			"        <meta charset=\"UTF-8\">\n" + 
			"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + 
			"        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n" + 
			"    </head>\n" + 
			"    <body>";	
	private String contenido = "<h1>¡No quieres saber de lo que son capaces!</h1>\n" + 
			"        <h3>¡Una contraseña <span class=\"importante\">fácil de recordar</span> es una contraseña <span class=\"importante\">fácil de robar</span>!</h3>\n" + 
			"        <img src=\"imgs/Hack.jpg\" alt=\"imgHacker\"/>";	
	private String formulario ="<form method=\"GET\" action=\"Main\">\n" + 
			"            <div>\n" + 
			"                <div id=\"izquierda\">\n" + 
			"                    <p>¿Es segura tu contraseña?</p>\n" + 
			"                    <input type=\"password\" name=\"password\" placeholder=\"Escribe la contraseña\" id=\"password\">\n" + 
			"                </div>\n" + 
			"                <div id=\"derecha\">\n" + 
			"                    <p>Pon a prueba sus 'ganzúas'</p>\n" + 
			"                    <input type=\"radio\" name=\"procesador\" value=\"cpu\" checked=\"\">CPU\n" + 
			"                    <input type=\"radio\" name=\"procesador\" value=\"gpu\">GPU\n" + 
			"                    <input type=\"radio\" name=\"procesador\" value=\"grid\">Grid\n" + 
			"                </div>\n" + 
			"            </div>\n" + 
			"            <input type=\"submit\" value=\"CALCULA\" id=\"boton\">\n" + 
			"        </form>";
	private String abreResul = "<div id=\"resultado\">";
	private String resul = "";
	private String cierraResul = "</div>";
	private String pie = "<footer id=\"pie\">\n" + 
			"            <h2>¡Comprueba <span class=\"importante\">tu contraseña</span> antes de que sea DEMASIADO TARDE!</h2>\n" + 
			"        </footer>";
	private String cierraBody = "</body></html>";
	
	/***
	 * Instancia la clase HtmlConstructor
	 */
	public HtmlConstructor() {
		
	}
	
	/***
	 * Escribe el resultado en la página web
	 * 
	 * @param resultado Resultado de la operación
	 */
	public void setResul(String resultado) {
		if(resultado != null) {
			this.resul = "Se tardarían "+resultado+ " en descifrar tu contraseña";
		}
	}
	
	/***
	 * Construye la página concatenando sus elementos.
	 */
	public String toString() {
		return hastaBody + contenido +formulario + abreResul + resul + cierraResul + pie + cierraBody;
	}
	
}
