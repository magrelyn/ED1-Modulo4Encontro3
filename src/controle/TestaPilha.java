package controle;

import modelo.Pilha;

public class TestaPilha {

	public static void main(String[] args) {

		Pilha pilha1 = new Pilha();

		System.out.println(pilha1.push("X"));
		System.out.println(pilha1.push("Z"));
		System.out.println(pilha1.push("N"));
		
		System.out.println(pilha1.toString());
		
		System.out.println(pilha1.pop());
		System.out.println(pilha1.toString());
		
		System.out.println(pilha1.top());
		
		pilha1.pop();
		pilha1.pop();
		
		System.out.println(pilha1.isEmpty());
		
		// copia 
		
		Pilha p2 = new Pilha();
		
		pilha1.push("X");
		pilha1.push("Z");
		pilha1.push("N");
		pilha1.push("W");

		pilha1.copia(p2);
		
		System.out.println(pilha1.toString());
		System.out.println(p2.toString());

		
		for (int i = 0; i < 4; i++) {
			System.out.print(pilha1.pop() + ", ");
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < 4; i++) {
			System.out.print(p2.pop() + ", ");
		}
		

	}

}
