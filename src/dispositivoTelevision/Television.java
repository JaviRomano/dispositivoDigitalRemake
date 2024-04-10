package dispositivoTelevision;

import dispositivoPadre.DispositivoDigital;

public class Television extends DispositivoDigital {

	private byte pulgadas;
	private int altoPix;
	private int anchoPix;

	public Television(int peso, double precio, String marca, short consumo, byte pulgadas, int altoPix, int anchoPix, int id) {
		super(peso, precio, marca, consumo, id);
		this.pulgadas = pulgadas;
		this.altoPix = altoPix;
		this.anchoPix = anchoPix;
	}

	public static void damePixelesTotalesEstaticos(int altoPix, int anchoPix) { 
		System.out.printf("\nLos pixeles totales de este tamaño de pantalla son: %d\n", altoPix * anchoPix);
	}
	
	public String dameResolucion() {
		int resolucion = altoPix * anchoPix;
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

	@Override
	public char selloEficiencia() { 
		int eficiencia = ((altoPix * anchoPix * pulgadas)) / getConsumo();
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
				+ "kg] ||  Precio: [" + this.getPrecio() + "€] ||  id: ["+ getId() + "]");
	}

}