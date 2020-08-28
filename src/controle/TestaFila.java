package controle;

import modelo.Fila;

public class TestaFila {

	public static void main(String[] args) {

		Fila f = new Fila();

		f.add("X");
		f.add("Z");
		f.add("N");
		f.add("H");
		f.add("U");
		f.add("W");
		f.add("U");

		System.out.println(f.toString());

		System.out.println(f.first());
		System.out.println(f.last());

		System.out.println(f.remove());
		System.out.println(f.remove());
		System.out.println(f.remove());
		System.out.println(f.remove());
		System.out.println(f.remove());
		System.out.println(f.remove());
		System.out.println(f.remove());

		System.out.println(f.isEmpty());

	}

}
