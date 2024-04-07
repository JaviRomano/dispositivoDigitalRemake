package dispositivoDigitalMain;

import dispositivoLavadora.Lavadora;
import dispositivoTelevision.Television;

public class Main {
		public static void main(String[] args) {
			
			Lavadora l1 = new Lavadora(83, (double) 648.99, "Balay", (short) 1650, (long) 25000, (float) 18.5);
			System.out.println(l1.toString());
			Television t1 = new Television(6, (double) 299.90, "Samsung", (short) 88, (byte) 32, 1080, 1920);
			System.out.println(t1.toString());
			Television t2 = new Television(12, (double) 499.90, "LG", (short) 165, (byte) 42, 2160, 3840);
			System.out.println(t2.toString());
			Television t3 = new Television(15, (double) 649.90, "Thompson", (short) 250, (byte) 55, 1440, 2560);
			System.out.println(t3.toString());
			Television t4 = new Television(4, (double) 149.90, "LG", (short) 70, (byte) 22, 720, 1080);
			System.out.println(t4.toString());
		}
}