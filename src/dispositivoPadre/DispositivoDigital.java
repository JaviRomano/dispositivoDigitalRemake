package dispositivoPadre;

public abstract class DispositivoDigital {
	private int peso;
	private double precio;
	private String Marca;
	private short Consumo;

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

	public short getConsumo() {
		return Consumo;
	}

	@Override
	public String toString() {
		return String.format("=================== \n%s ", getClass().getSimpleName());
	}

	public abstract char selloEficiencia();

}
