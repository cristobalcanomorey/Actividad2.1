import java.math.BigDecimal;

public class TimeData {
	private BigDecimal segundos = null;
	private BigDecimal minutos = null;
	private BigDecimal horas = null;
	private BigDecimal dias = null;
	private BigDecimal meses = null;
	private BigDecimal years = null;
	
	public TimeData(BigDecimal s) {
		this.segundos = s;
		this.minutos = segundos.divide(new BigDecimal(60));
		this.horas = minutos.divide(new BigDecimal(60));
		this.dias = horas.divide(new BigDecimal(24));
		this.meses = dias.divide(new BigDecimal(30));
		this.years = meses.divide(new BigDecimal(12));
		
	}

	public BigDecimal getSegundos() {
		return segundos;
	}

	public BigDecimal getMinutos() {
		return minutos;
	}

	public BigDecimal getHoras() {
		return horas;
	}

	public BigDecimal getDias() {
		return dias;
	}

	public BigDecimal getYears() {
		return years;
	}
	
	public BigDecimal getMeses() {
		return meses;
	}
	
	public String toString() {
		return "tardaría " + years.toString() + " años, "+meses.toString()+" meses, "+dias.toString() + " dias, " +horas.toString()+ " horas, " +minutos.toString()+ " minutos y " +segundos.toString()+ " segundos.";
		
	}
	
}
