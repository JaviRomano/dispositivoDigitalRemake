package dispositivoLavadora;

import dispositivoPadre.DispositivoDigital;

public class Lavadora extends DispositivoDigital {
	
	private long rpm;
	private float capacidad;
	
	public Lavadora(double precio, String marca, int id) {
		this(45, precio, marca, (short) 350, 22000, 12.2, id);
	}
	
	public Lavadora(int peso, double precio, String marca, short consumo, long rpm, double capacidad, int id) {
		super(peso, precio, marca, consumo, id);
		this.rpm = rpm;
		this.capacidad = (float) capacidad;
	}

	@Override
	public char selloEficiencia() {
		int numeroEficiencia = (((int)(rpm * capacidad)) / getConsumo());
		if (numeroEficiencia > 500) {
			return 'S';
		} else if (numeroEficiencia > 400) {
			return 'A';
		} else if (numeroEficiencia > 350) {
			return 'B';
		} else if (numeroEficiencia > 200) {
			return 'C';
		} else if (numeroEficiencia > 100) {
			return 'D';
		}
		return 'E';
	}

	private String funcionSecado(long rpm) {
		return rpm < 15000 ? "solo lavadora." : "lavadora y secadora.";
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + this.getMarca() + " || Consumo: [" + getConsumo()
				+ "W] || Funcion " + this.funcionSecado(rpm) + " || Sello Eficiencia [" + this.selloEficiencia()
				+ "] || Peso [" + this.getPeso() + "kg] ||  Precio: [" + this.getPrecio()
				+ "€] ||  id: ["+ this.getId() + "]");
	}

}