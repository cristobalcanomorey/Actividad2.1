

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter writer = response.getWriter();
//		HtmlConstructor pagina = new HtmlConstructor();
//		Properties properties = new Properties();
//		String fichero = getServletContext().getRealPath("/passwordsComunes.properties");
//		properties.load(new FileInputStream(fichero));
//		
//		PasswordsComunes paCom = new PasswordsComunes(properties);
////		HttpSession
//		String password = request.getParameter("password");	//request contraseña;
//		
//		try {
//			if(paCom.esComun(password)) {
//				//redirige a web
//				response.sendRedirect("https://edition.cnn.com/2019/04/22/uk/most-common-passwords-scli-gbr-intl/index.html");
//			} else {
//				//calcula tiempo
//				String procesador = "cpu";	//request procesador
//				Crackabilidad calc = new Crackabilidad(password, procesador);
//				pagina.setResul(calc.getTiempoQTarda().toString());
//			}
//		} catch (Exception e) {
//			
//		}
//		writer.print(pagina.toString());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
