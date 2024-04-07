package dispositivoLavadora;

import dispositivoPadre.DispositivoDigital;

public class Lavadora extends DispositivoDigital {

	private static long rpm;
	private float capacidad;
	private int nivelFuerza = (int) (rpm * capacidad);
	private int numeroEficiencia = (int) (nivelFuerza / this.getConsumo());

	public Lavadora(int peso, double precio, String marca, short consumo, long rpm, float capacidad) {
		super(peso, precio, marca, consumo);
		Lavadora.rpm = rpm;
		this.capacidad = capacidad;
	}
	
	public Lavadora(int peso, double precio, String marca, char certificadoEficiencia, short consumo,
			long rpm, float capacidad) {
		super(peso, precio, marca, consumo);
		certificadoEficiencia = selloEficiencia();
		Lavadora.rpm = rpm;
		this.capacidad = capacidad;
	}	
	
	@Override
	public char selloEficiencia() {
		if (numeroEficiencia >= 500) {
			return 'S';
		} else if (numeroEficiencia >= 400) {
			return 'A';
		} else if (numeroEficiencia >= 350) {
			return 'B';
		} else if (numeroEficiencia >= 200) {
			return 'C';
		} else if (numeroEficiencia >= 100) {
			return 'D';
		}
		return 'E';
	}

	private String funcionSecado(long rpm) {
		return rpm < 15000 ? "solo lavadora." : "lavadora y secadora.";		
	}

	@Override
	public String toString() {
		return String.format("===================\n" + "Lavadora " + this.getMarca()
				+ " || Consumo: [" + this.getConsumo() + "W] || Funcion " + this.funcionSecado(rpm)
				+ " || Sello Eficiencia [" + this.selloEficiencia() + "] || Peso [" + this.getPeso()
				+ "kg] ||  Precio: [" + this.getPrecio() + "€] - " + nivelFuerza);
	}

}