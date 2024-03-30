package dispositivoPadre;

public abstract class DispositivoDigital {
	private int peso; // indica el peso en kg
	private double precio; // indica el precio en € con 2 decimales
	private String Marca; // indica la marca de la empresa fabricante
	private char CertificadoEficiencia; // sello de eficiencia segun consumo por actividad
	private short Consumo; // indica el consumo en vatios

	public DispositivoDigital(int peso, double precio, String marca, short consumo) {
		this.peso = peso;
		this.precio = precio;
		Marca = marca;
		Consumo = consumo;
	}

	public int getPeso() {
		return peso;
	}

	public double getPrecio() {
		return precio;
	}

	public String getMarca() {
		return Marca;
	}

	public char getCertificadoEficiencia() {
		return CertificadoEficiencia;
	}

	public short getConsumo() {
		return Consumo;
	}

	@Override
	public String toString() {
		return String.format("Dispositivo digital\n===================|n", "Dispositivo %s || ", this.getMarca(),
				"Consumo: [%d] || ", this.getConsumo(), "Sello Eficiencia [%c] ||", this.getCertificadoEficiencia(),
				"Posibilidad funcion Eco: [%s]", "Peso [%d] || ", this.getPeso(), "Precio: [%.2f]",
				this.getPrecio());
	}

	/*
	 * @Override public String toString() { return super.toString(); }
	 */


	public abstract char selloEficiencia();

}
