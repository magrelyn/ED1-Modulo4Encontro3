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
		resp = (Object) this.busca(this.topo-1);
		this.remove(this.topo-1);
		return resp;
	}

	
	

}
