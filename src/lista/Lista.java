package lista;

import lista.No;
import modelo.Produto;

public class Lista {
    private No inicio;
    private No aux;
    private No atual;

    Produto p = new Produto();

    // Metodo para Inserir
    public void inserir(Produto produto){
        // 1° Caso: Se não existir um inicio, o objeto será o inicio
        if(inicio == null){
            inicio = new No(produto, null);
            aux = inicio;
        } else { // 2° Caso: Se já existir um inicio, então o objeto será o proximo da lista
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

}
