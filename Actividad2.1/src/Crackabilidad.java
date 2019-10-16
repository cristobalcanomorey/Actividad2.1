import java.math.BigDecimal;
import java.util.Hashtable;
import java.util.Set;

public class Crackabilidad {

	private double chars = 256;
	private TimeData tiempoQTarda;
	private Hashtable<String, Integer> procesadores = new Hashtable<String,Integer>();
	private String tipoDeProcesador = "";

	public Crackabilidad(String password, String tipoProcesador) {
		this.procesadores.put("cpu", 1000);
		this.procesadores.put("gpu", 12000);
		this.procesadores.put("grid", 1500000);
		
		Set<String> keys = procesadores.keySet();
		
		for (String key : keys) {
			if(key.equals(tipoProcesador)) {
				this.tipoDeProcesador = tipoProcesador;
				break;
			}
		}
		
		BigDecimal milis = calculoTiempo(password.length());
		this.tiempoQTarda = tiempoLegible(milis);
	}
	
	private BigDecimal calculoTiempo(int longitudPassword) {
		BigDecimal combinaciones = new BigDecimal(Math.pow(chars, (double)longitudPassword));
		int div = procesadores.get(tipoDeProcesador);
		BigDecimal segundos = combinaciones.divide(new BigDecimal(div));
		return segundos;
	}
	
	public TimeData tiempoLegible(BigDecimal milis) {
		TimeData tiempo = new TimeData(milis);
		return tiempo;
	}

	public TimeData getTiempoQTarda() {
		return tiempoQTarda;
	}

	public String getTipoDeProcesador() {
		return tipoDeProcesador;
	}
	
}
