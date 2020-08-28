package modelo;

public class Fila extends Lista {

	public Fila() {
	}

	public boolean add(Object elemento) {
		if (this.adiciona((String) elemento))
			return true;
		else
			return false;
	}

	public Object remove() {
		Object resp;
		resp = (Object) this.busca(0);
		this.remove(0);
		return resp;
	}

	public boolean isEmpty() {
		if (this.tamanho() == 0)
			return true;
		else
			return false;
	}

	public Object first() {
		return (Object) this.busca(0);
	}

	public Object last() {
		return (Object) this.busca(this.tamanho() - 1);
	}
	
}
