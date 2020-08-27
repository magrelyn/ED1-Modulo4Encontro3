package modelo;

public class NoLista {

	private String info;
	private NoLista prox;

	public NoLista() {
	}

	public NoLista(String valor) {
		this.setInfo(valor);
		this.setProx(null);
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public NoLista getProx() {
		return prox;
	}

	public void setProx(NoLista prox) {
		this.prox = prox;
	}

	@Override
	public String toString() {
		return "NoLista [info=" + info + ", prox=" + prox + "]";
	}	

}
