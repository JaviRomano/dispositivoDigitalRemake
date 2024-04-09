package dispositivoTelevision;

import dispositivoPadre.DispositivoDigital;

public class Television extends DispositivoDigital {

	private byte pulgadas; // Tamaño de la diagonal de la pantalla medido en pulgadas.
	private int altoPix; // Cantidad de pixeles de altura de la pantalla.
	private int anchoPix; // Cantidad de pixeles de anchura de la pantalla.

	public Television(int peso, double precio, String marca, short consumo, byte pulgadas, int altoPix, int anchoPix) {
		super(peso, precio, marca, consumo);
		this.pulgadas = pulgadas;
		this.altoPix = altoPix;
		this.anchoPix = anchoPix;
	}

	/*
	 * no necesita crear instancia
	 */
	public static void damePixelesTotalesEstaticos(int altoPix, int anchoPix) { 
		System.out.printf("\nLos pixeles totales de este tamaño de pantalla son: %d\n", altoPix * anchoPix);
	}
	
	/*
	 * Calcula el total de píxeles del área de la pantalla.
	 */
	private int damePixelesTotales() { 
		return altoPix * anchoPix;
	}
	
	/*
	 * en funcion al total de pixeles del area de pantalla, categorizamos según estándares de salida de video.
	 */
	public String dameResolucion() {
		int resolucion = damePixelesTotales();
		String tipoResolucion = "Este TV no soporta el formato de emisión actual.";
		switch (resolucion) {
		case 8_294_400:
			return tipoResolucion = "4K";
		case 3_686_400:
			return tipoResolucion = "Falso 2k (1440p)";
		case 2_073_600:
			return tipoResolucion = "FullHD";
		case 921_600:
			return tipoResolucion = "HD";
		default:
			return tipoResolucion;	
		}		
	}

	/*
	 *  a partir del método anterior, categorizamos en base a la eficiencia en el consumo del Televisor.
	 */	
	@Override
	public char selloEficiencia() { 
		int eficiencia = ((damePixelesTotales() * pulgadas)) / getConsumo();
		if (eficiencia >= 1200000) {
			return 'S';
		} else if (eficiencia >= 850000) {
			return 'A';
		} else if (eficiencia >= 700000) {
			return 'B';
		} else if (eficiencia >= 300000) {
			return 'C';
		} else if (eficiencia >= 50000) {
			return 'D';
		}
		return 'E';
	}

	@Override
	public String toString() {
		return String.format(super.toString() + this.getMarca() + " || Tamaño: " + this.pulgadas
				+ " pulgadas || Consumo: [" + this.getConsumo() + "W] || " + this.dameResolucion()
				+ " || Sello Eficiencia [" + this.selloEficiencia() + "] || Peso [" + this.getPeso()
				+ "kg] ||  Precio: [" + this.getPrecio() + "€] || PixTotales: " + damePixelesTotales());
	}

}