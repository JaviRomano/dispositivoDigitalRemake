package dispositivoLavadora;

import dispositivoPadre.DispositivoDigital;

public class Lavadora extends DispositivoDigital {

	private long rpm;
	private float capacidad;
	private int nivelFuerza = (int) (rpm * capacidad);
	private int numeroEficiencia = (int) (nivelFuerza / this.getConsumo());

	public Lavadora(int peso, double precio, String marca, short consumo, long rpm, float capacidad) {
		super(peso, precio, marca, consumo);
		this.rpm = rpm;
		this.capacidad = capacidad;
	}
	
	public Lavadora(int peso, double precio, String marca, char certificadoEficiencia, short consumo,
			long rpm, float capacidad) {
		super(peso, precio, marca, consumo);
		certificadoEficiencia = selloEficiencia();
		this.rpm = rpm;
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

	private String funcionSecado() {
		if (rpm < 15000) {
			return "solo lavadora.";
		} else {
			return "lavadora y secadora.";
		}
	}

	@Override
	public String toString() {
		return String.format("Dispositivo digital\n===================\n" + "Lavadora " + this.getMarca()
				+ " || Consumo: [" + this.getConsumo() + "W] || Funcion " + this.funcionSecado()
				+ " || Sello Eficiencia [" + this.selloEficiencia() + "] || Peso [" + this.getPeso()
				+ "kg] ||  Precio: [" + this.getPrecio() + "€]");
	}


}