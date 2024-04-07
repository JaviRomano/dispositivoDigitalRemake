package dispositivoTelevision;

import dispositivoPadre.DispositivoDigital;

public class Television extends DispositivoDigital {

	private static byte pulgadas; // tamaño de la diagonal de la pantalla medido en pulgadas.
	private static int altoPix;
	private static int anchoPix;
	private int consumoPantalla = (damePixelesTotales() * pulgadas);
	private int numeroEficiencia = (consumoPantalla / getConsumo());

	public Television(int peso, double precio, String marca, short consumo, byte pulgadas, int altoPix, int anchoPix) {
		super(peso, precio, marca, consumo);
		Television.pulgadas = pulgadas;
		Television.altoPix = altoPix;
		Television.anchoPix = anchoPix;
	}
	
	public static int damePixelesTotales() {
		return altoPix * anchoPix;
	}
	
	public static int dameConsumoPantalla() {
		return (damePixelesTotales() * pulgadas);
	}

	public String dameResolucion() {
		String tipoResolucion = "Este TV no soporta el formato de emisión actual.";
		switch (damePixelesTotales()) {
		case 8294400:
			tipoResolucion = "4K";
		case 3686400:
			tipoResolucion = "Falso 2k - 1440p";
		case 2073600:
			tipoResolucion = "FullHD";
		case 921600:
			tipoResolucion = "HD";
		}
		return tipoResolucion;
	}

	@Override
	public char selloEficiencia() {
		if (numeroEficiencia >= 1200000) {
			return 'S';
		} else if (numeroEficiencia >= 850000) {
			return 'A';
		} else if (numeroEficiencia >= 700000) {
			return 'B';
		} else if (numeroEficiencia >= 300000) {
			return 'C';
		} else if (numeroEficiencia >= 50000) {
			return 'D';
		}
		return 'E';
	}

	@Override
	public String toString() {
		return String.format("===================\n" + "TV " + this.getMarca() + " || Tamaño: " + Television.pulgadas +
				"pulgadas || Consumo: [" + this.getConsumo() + "W] || " + this.dameResolucion() + " || Sello Eficiencia [" +
				this.selloEficiencia() + "] || Peso [" + this.getPeso() + "kg] ||  Precio: [" + this.getPrecio() +
				"€] - Nº eficiencia: " + numeroEficiencia + " || PixTotales: " +  damePixelesTotales());
	}


}