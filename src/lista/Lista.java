package lista;

import lista.No;
import modelo.Produto;

public class Lista {
    private No inicio;
    private No aux;
    private No atual;


    // Metodo para Inserir
    public void inserir(Produto produto){
        // 1° Caso: Se não existir um inicio, o objeto será o inicio
        if(inicio == null){
            inicio = new No(produto, null);
            aux = inicio;
        } else { // 2° Caso: Se já existir um início, então o objeto será o proximo da lista
            atual = new No(produto, null); // Cria o Produto e recebe que é o atual
            aux.setProx(atual); // Sett o antigo aux como o atual (fala que o antigo aponta pro novo)
            aux = atual; // E seta o auxiliar para mirar no atual, indo do primeiro pro 2° se for o caso
        }
        // REGRA MENTAL:
/*
        se estiver vazia, o novo vira o início
        caso contrario, se estiver vazia, liga no final
*/
    }

    // Metodo para Exibir - Passa um por um, busca Linear
    public void exibir() {
        No andaLista = inicio; // Variavel vai servir para andar pela lista
        while (andaLista != null ){ // Basicamente, enquanto ainda existir um nó, continue
            System.out.println(andaLista.getProduto()); // Vai pegar a informação do Produto dentro do nó que estiver e imprimir
            andaLista = andaLista.getProx(); // Agora o andaLista não vai mais apontar pro nó atual, mas sim para o proximo.
            // E fim do laço, ele avança até o proximo ser vazio, que quer dizer que não existem mais nós, e para.
        }

    }

    // Metodo para Pesquisar (Recebe um ID, e retorna o Prod depois de achar o ID)
    public Produto pesquisar(int id){
        No andaLista = inicio;
        while(andaLista != null){
            if(andaLista.getProduto().getID() == id){
            return andaLista.getProduto();
            }
            andaLista = andaLista.getProx();
        }
        return null;
    }


}
