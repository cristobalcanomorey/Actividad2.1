
public class HtmlConstructor {

	private String hastaBody = "";	//<html ... <body>
	private String contenido = "";	//<h1> introduce una...
	private String cierraBody = "</body>";
	private String abreResul = "<div id=\"resultado\">";
	private String cierraResul = "</div>";
	private String resul = "";
	
	public HtmlConstructor() {
		
	}
	
	public void setResul(String resultado) {
		if(resultado != null) {
			this.resul = "Se tardarían "+resultado+ " en descifrar tu contraseña";
		}
	}
	
	public String toString() {
		return hastaBody + contenido + abreResul + resul + cierraResul + cierraBody;
	}
	
}
