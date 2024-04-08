package dispositivoLavadora;

import dispositivoPadre.DispositivoDigital;

public class Lavadora extends DispositivoDigital {

	private long rpm; // revoluciones por minuto del tambor de lavadora.
	private float capacidad; // capacidad en kg del interior del tambor.

	
	public Lavadora(double precio, String marca) {
		this(45, precio, marca, (short) 350, 22000, 12.2);
	}
	
	public Lavadora(int peso, double precio, String marca, short consumo, long rpm, double capacidad) {
		super(peso, precio, marca, consumo);
		this.rpm = rpm;
		this.capacidad = (float) capacidad;
	}

	/*
	 * Calcula la fuerza necesaria en funcion de la capacidad y revoluciones del tambor.
	 */
	private int dameNivelFuerza() {
		return (int) (rpm * capacidad);
	}
	
	private int dameNumeroEficiencia() {
		return (dameNivelFuerza() / getConsumo());
	}

	@Override
	public char selloEficiencia() {
		if (dameNumeroEficiencia() > 500) {
			return 'S';
		} else if (dameNumeroEficiencia() > 400) {
			return 'A';
		} else if (dameNumeroEficiencia() > 350) {
			return 'B';
		} else if (dameNumeroEficiencia() > 200) {
			return 'C';
		} else if (dameNumeroEficiencia() > 100) {
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
				+ "] || Peso [" + this.getPeso() + "kg] ||  Precio: [" + this.getPrecio() + "€] || Nº eficiencia: "
				+ this.dameNivelFuerza() + " || NumEfic: " + this.dameNumeroEficiencia());
	}

}