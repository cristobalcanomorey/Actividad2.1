import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Hashtable;
import java.util.Set;

public class Crackabilidad {

	private double chars = 256;
	private TimeData tiempoQTarda;
	private Hashtable<String, Integer> procesadores = new Hashtable<String, Integer>();
	private String tipoDeProcesador = "";

	/***
	 * Crea un objeto Crackabilidad con el procesador y la contraseña y manda
	 * calcular lo que tardaría.
	 * 
	 * @param password       Contraseña que escribe el usuario
	 * @param tipoProcesador Procesador que selecciona el usuario
	 */
	public Crackabilidad(String password, String tipoProcesador) {
		this.procesadores.put("cpu", 1000);
		this.procesadores.put("gpu", 12000);
		this.procesadores.put("grid", 1500000);

		Set<String> keys = procesadores.keySet();

		for (String key : keys) {
			if (key.equals(tipoProcesador)) {
				this.tipoDeProcesador = tipoProcesador;
				break;
			}
		}

		BigDecimal milis = calculoTiempo(password.length());
		this.tiempoQTarda = tiempoLegible(milis);
	}

	/***
	 * Calcula lo que tardaría.
	 * 
	 * @param longitudPassword tamaño de la contraseña
	 * @return Los segundos que tardaría
	 */
	private BigDecimal calculoTiempo(int longitudPassword) {
		BigDecimal combinaciones = new BigDecimal(Math.pow(chars, (double) longitudPassword));
		int div = procesadores.get(tipoDeProcesador);
		BigDecimal segundos = combinaciones.divide(new BigDecimal(div), RoundingMode.HALF_UP);
		return segundos;
	}

	/***
	 * Crea un objeto TimeData con los segundos.
	 * 
	 * @param secs Segundos que tardaría.
	 * @return TimeData con lo que tardaría.
	 */
	public TimeData tiempoLegible(BigDecimal secs) {
		TimeData tiempo = new TimeData(secs);
		return tiempo;
	}

	/***
	 * Método get para el tiempo que tardaría.
	 * 
	 * @return El tiempo que tardaría
	 */
	public TimeData getTiempoQTarda() {
		return tiempoQTarda;
	}

	/***
	 * Método get para el tipo de procesador elegido.
	 * 
	 * @return Tipo de procesador
	 */
	public String getTipoDeProcesador() {
		return tipoDeProcesador;
	}

}
