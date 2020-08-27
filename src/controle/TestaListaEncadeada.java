package controle;

import modelo.Lista;

public class TestaListaEncadeada {

	public static void main(String[] args) {

		Lista lista = new Lista();

		System.out.println("Testando metodos de adicao na Lista:\n\n");

		lista.adiciona("B");
		// 0
		// B
		lista.adiciona(0, "A");
		// 0 1
		// A B
		lista.adiciona("C");
		// 0 1 2
		// A B C
		lista.adiciona("E");
		// 0 1 2 3
		// A B C E
		lista.adiciona(3, "D");
		// 0 1 2 3 4
		// A B C D E
		lista.adiciona("G");
		// 0 1 2 3 4 5
		// A B C D E G
		lista.adiciona(5, "F");
		// 0 1 2 3 4 5 6
		// A B C D E F G

		// esperado retorno false, 'X' nao estrara na lista
		// 0 1 2 3 4 5 6 | 7
		// A B C D E F G | X
		lista.adiciona(7, "X");

		System.out.println(lista.toString());
		System.out.println(lista.tamanho());

		System.out.println("Testando metodos de busca na Lista:\n\n");

		System.out.println(lista.busca(2));
		System.out.println(lista.busca(6));
		// esperado uma exception de retorno
		// System.out.println(lista.busca(7));

		System.out.println(lista.busca("A"));
		System.out.println(lista.busca("D"));
		System.out.println(lista.busca("X"));

		System.out.println("Testando metodos de remocao na Lista:\n\n");

		// 0 1 2 3 4 5 6
		// A B C D E F G
		lista.remove(0);
		// 0 1 2 3 4 5
		// B C D E F G 
		lista.remove(5);
		// 0 1 2 3 4
		// B C D E F
		lista.remove(4);
		// 0 1 2 3
		// B C D E
		lista.remove(2);
		// 0 1 2
		// B C E
		lista.remove(1);
		// 0 1
		// B E

		System.out.println(lista);
		System.out.println(lista.tamanho());

	}

}
