package dispositivoDigitalMain;

import dispositivoLavadora.Lavadora;

public class Main {
		public static void main(String[] args) {
			
			Lavadora l1 = new Lavadora(83, (double) 648.99, "Balay", (short) 1650, (long) 25000, (float) 18.5);
			System.out.println(l1.toString());
			
		}
}