package modelo;
/**
 * Classe que implementa uma lista em java usando a classe {@link NoLista}.
 * @author wande
 */
public class Lista {
	
	private NoLista lista;
	private int tamanho;

	public Lista() {
		this.lista = null;
		this.tamanho = 0;
	}

	// adiciona inicio
	private void adicionaInicio(String valor) {		
		if (this.lista == null) {
			// lista vazia
			this.lista = new NoLista(valor);
			this.tamanho++;
		} else {
			
			// cria-se um novo no e atualiza o
			// NoLista do inicio
			NoLista novoNo = new NoLista(valor);
			novoNo.setProx(this.lista);
			this.lista = novoNo;
			this.tamanho++;
		}
	}

	/**
	 * Insere valor no fim da lista.
	 * 
	 * @param valor refere-se ao elemento que sera adicionado.
	 * @return true caso seja possivel adicionar, false caso nao.
	 */
	public boolean adiciona(String valor) {

		// retorna false se o valor for uma string vazia
		if (valor.equals("")) {
			return false;
		}

		if (this.lista == null) {
			// lista vazia
			this.lista = new NoLista(valor);
			this.tamanho++;
			return true;
		} else {
			// procura pelo fim da lista
			NoLista atual = this.lista;
			while (atual.getProx() != null)
				atual = atual.getProx();
			// insere o no no fim da lista
			atual.setProx(new NoLista(valor));
			this.tamanho++;
			return true;
		}

	}

	// verifica se a posicao existe
	private boolean posicaoEstaOcupada(int posicao) {
		return posicao >= 0 && posicao < this.tamanho;
	}

	// pega o NoLista da posicao informada
	private NoLista getNoLista(int posicao) {
		if (!this.posicaoEstaOcupada(posicao)) {
			throw new IllegalArgumentException("404: Posicao not existe :(");
		}

		NoLista atual = this.lista;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProx();
		}
		return atual;
	}
	
	/**
	 * Funcao para adicionar um elemento em uma posicao.
	 * 
	 * @param posicao refere-se a posicao na lista.
	 * @param elemento refere-se ao elemento a ser adicionado.
	 * @return verdadeiro caso seja possivel adicionar na posicao especificada, falso caso nao.
	 */
	public boolean adiciona(int posicao, String elemento) {

		if (!this.posicaoEstaOcupada(posicao)) {
			return false;
		}

		if (posicao == 0) { // No comeco
			this.adicionaInicio(elemento);
			return true;
		} else if (posicao == this.tamanho) { // No fim
			this.adiciona(elemento);
			return true;
		} else { // No meio
			NoLista anterior = this.getNoLista(posicao - 1);
			NoLista nova = new NoLista();
			nova.setInfo(elemento);
			nova.setProx(anterior.getProx());
			anterior.setProx(nova);
			this.tamanho++;
			return true;
		}
	}

	// Retorna o String que esta na posicao
	public String busca(int posicao) {
		if (!this.posicaoEstaOcupada(posicao)) {
			throw new IllegalArgumentException("404: Posicao not existe :(");
		} else {
			NoLista no = getNoLista(posicao);
			return no.getInfo();
		}
	}

	// busca pelo elemento no vetor
	// retorna a posicao do elemento no vetor
	// return -1 se nao encontrou o elemento
	public int busca(String elemento) {
		int i = 0;

		for (NoLista p = this.lista; p != null; p = p.getProx()) {
			if (p.getInfo().equals(elemento)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	private int getTamanho() {
		return tamanho;
	}

	// retorna o tamanho (quantidade de elementos)
	public int tamanho() {
		return this.getTamanho();
	}

	// remove o elemento que esta no inicio da lista
	private void removeDoInicio() {

		this.lista = this.lista.getProx();
		this.tamanho--;

	}

	// remove o elemento que esta no fim da lista
	public void removeDoFim() {
		NoLista ultimo = this.getNoLista(this.tamanho - 1);
		ultimo.setProx(null);
		this.tamanho--;
	}

	// remove o elemento que esta da posicao
	public void remove(int posicao) {
		if (!this.posicaoEstaOcupada(posicao)) {
			throw new IllegalArgumentException("404: Posicao not existe :(");
		}

		if (posicao == 0) { // no inicio
			this.removeDoInicio();
		} else if (posicao == this.tamanho - 1) { // no fim
			this.removeDoFim();
		} else {
			NoLista anterior = this.getNoLista(posicao - 1);
			NoLista atual = anterior.getProx();
			NoLista proxima = atual.getProx();

			anterior.setProx(proxima);
			// proxima.setAnterior(anterior);

			this.tamanho--;
		}

	}

	public String toString() {

		NoLista p = this.lista;
		StringBuilder s = new StringBuilder();

		s.append("[");

		for (int i = 0; i < (this.tamanho - 1); i++) {
			s.append(p.getInfo() + ", ");
			p = p.getProx();
		}

		if (this.tamanho > 0) {
			s.append(p.getInfo());
		}

		s.append("]");

		return s.toString();
	}

	public void show() {

		for (int i = 0; i < (this.tamanho - 1); i++) {
			System.out.println(this.lista.toString());
		}

	}

}
