package dispositivoPadre;

public abstract class DispositivoDigital {
	
	private int id;
	private int peso;
	private double precio;
	private String marca;
	private short consumo;
	private static int nextId = 1;
	

	public DispositivoDigital(int peso, double precio, String marca, short consumo, int id) {
		this.id = nextId++;
		this.peso = peso;
		this.precio = precio;
		this.marca = marca;
		this.consumo = consumo;
	}	
	
	public int getId() {
		return id;
	}

	public static int getNextId() {
		return nextId;
	}

	public int getPeso() {
		return peso;
	}

	public double getPrecio() {
		return precio;
	}

	public String getMarca() {
		return marca;
	}

	public short getConsumo() {
		return consumo;
	}

	@Override
	public String toString() {
		return String.format("%s ", getClass().getSimpleName());
	}

	public abstract char selloEficiencia();

}
