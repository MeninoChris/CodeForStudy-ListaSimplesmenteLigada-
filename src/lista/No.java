package lista;

import modelo.Produto;

public class No {
    private Produto produto;
    private No prox;

    private No(Produto produto, No prox) {
        this.produto = produto;
        this.prox = prox;
    }

    public Produto getProduto() {
        return produto;
    }

    public No getProx() {
        return prox;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
