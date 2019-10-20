import java.math.BigDecimal;
import java.math.RoundingMode;

public class TimeData {
	private int segundos = 0;
	private int minutos = 0;
	private int horas = 0;
	private int dias = 0;
	private int meses = 0;
	private int years = 0;

	/***
	 * Reparte los segundos a diferentes unidades de tiempo.
	 * 
	 * @param s Segundos que tardaría
	 */
	public TimeData(BigDecimal s) {

		BigDecimal segundosTotal = s;
		this.segundos = segundosTotal.remainder(new BigDecimal(60)).intValue();
		segundosTotal = segundosTotal.divide(new BigDecimal(60), RoundingMode.HALF_UP);
		this.minutos = segundosTotal.remainder(new BigDecimal(60)).intValue();
		segundosTotal = segundosTotal.divide(new BigDecimal(60), RoundingMode.HALF_UP);
		this.horas = segundosTotal.remainder(new BigDecimal(24)).intValue();
		segundosTotal = segundosTotal.divide(new BigDecimal(24), RoundingMode.HALF_UP);
		this.dias = segundosTotal.remainder(new BigDecimal(30)).intValue();
		segundosTotal = segundosTotal.divide(new BigDecimal(30), RoundingMode.HALF_UP);
		this.meses = segundosTotal.remainder(new BigDecimal(12)).intValue();
		this.years = segundosTotal.divide(new BigDecimal(12), RoundingMode.HALF_UP).intValue();
	}

	public int getSegundos() {
		return segundos;
	}

	public int getMinutos() {
		return minutos;
	}

	public int getHoras() {
		return horas;
	}

	public int getDias() {
		return dias;
	}

	public int getYears() {
		return years;
	}

	public int getMeses() {
		return meses;
	}

	/***
	 * Concatena todas las unidades de tiempo en un string.
	 */
	public String toString() {
		return years + " años, " + meses + " meses, " + dias + " dias, " + horas + " horas, " + minutos + " minutos y "
				+ segundos + " segundos";

	}

}
