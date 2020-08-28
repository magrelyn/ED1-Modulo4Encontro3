package modelo;

/**
 * Classe que implementa uma pilha em java usando a classe {@link Lista}.
 * 
 * @author wande
 * @see <a style="margin-left: 1em;" href=
 *      "https://github.com/magrelyn/ED1-Modulo4Encontro3">Documentacao</a>
 */
public class Pilha extends Lista {

	protected int topo;

	public Pilha() {
		this.topo = 0;
	}

	public boolean push(Object elemento) {

		if (this.adiciona((String) elemento)) {
			this.topo++;
			return true;
		}

		return false;
	}

	public Object pop() {
		Object resp;
		resp = (Object) this.busca(this.topo - 1);
		this.remove(this.topo - 1);
		this.topo--;
		return resp;
	}

	public boolean isEmpty() {
		if (this.topo == 0)
			return true;
		else
			return false;
	}

	public Object top() {
		return this.busca(this.topo - 1);
	}

	public void copia(Pilha p) {
		Pilha aux = new Pilha();

		for (int i = 0; i < this.topo; i++) {
			aux.push(this.busca(i));
		}

		for (int i = 0; i < this.topo; i++) {
			p.push(aux.pop());
		}
	}
}
