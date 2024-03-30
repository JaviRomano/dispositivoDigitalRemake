package dispositivoTelevision;

import dispositivoPadre.DispositivoDigital;

public class Television extends DispositivoDigital {

	private byte pulgadas; // tamaño de la diagonal de la pantalla medido en pulgadas.

	/* 02 - biFunction - BinaryOperator */ // (int x, int y) -> { return x + y; }
	// (x, y)/*solo si son del mismo tipo*/ -> x + y;

	public Television(int peso, double precio, String marca, char certificadoEficiencia, short consumo,
			boolean modoEco) {
		super(peso, precio, marca, certificadoEficiencia, consumo, modoEco);
	}

	public static int resolucion(int altoPix, int anchoPix) {
		{
			return altoPix * anchoPix;
		}
	}
	
	@Override
	public char selloEficiencia() {
		/*
		 * resolucion x pulgadas = nivelIntensidad 
		 * nivelIntensidad / consumo = numeroEficiencia si numeroEficiencia >= x = certificacion S si
		 * numeroEficiencia >= x = certificacion A si numeroEficiencia >= x = cert.
		 * B si numeroEficiencia < x = cert. c
		 */
	}
	
	
	/*
	 * switch case para nombrar la resolucion fullHD, QHD, UHD(4k), 8k
	 * 
	 * 
	 * 
	 */

}