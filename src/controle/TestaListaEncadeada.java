package controle;

import modelo.Pilha;

public class TestaListaEncadeada {

	public static void main(String[] args) {

		Pilha pilha1 = new Pilha();

		System.out.println(pilha1.push("X"));
		System.out.println(pilha1.push("Z"));
		System.out.println(pilha1.push("N"));
		
		System.out.println(pilha1.toString());
		
		System.out.println(pilha1.pop());
		System.out.println(pilha1.toString());
		

	}

}
