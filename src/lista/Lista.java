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

    // Metodo para atualizar
    public boolean atualizar(int id, double preco){ // Usasse boolean caso queira que seja informacional, para saber se foi sucesso ou deu errado
        No andaLista = inicio;
        while (andaLista != null){ // Percorre enquanto a lista existir
            if(andaLista.getProduto().getID() == id){ // Compara com o ID selecionado pelo usuario
                andaLista.getProduto().setPreco(preco); // Caso verdade, pega o produto e atualiza com o setPreco e pelo preço que o usuario colocou
                return true; // E retornará true
            }
            andaLista = andaLista.getProx();
        }
        return false;
    }
    // A logica é, proura pelo ID que o usuario colocou, percorre pelo while e se achar atualiza o preço

    // Metodo para Remover Usando os 3° Casos, Prim, Ultimo e do Meio
    public boolean remover(int id){
        No remov = inicio; // Vai ser a variavel que irá parar no Nó que quer remover
        No anterior = inicio; // A variavel que vai ficar antes do nó que quer remover
        while(remov != null){ // Percorre enquanto existir lista
            if(remov.getProduto().getID() == id){ // Pega o id que o usuario colocar e compara com os produtos
                break; // Caso ache o ID ele vai parar o while, fazendo o remov ficar no nó que pariu
            }
            anterior = remov; // Aqui falamos que o anterior é igual ao remov pois antes de atualizar o remov, que vai pro proximo, ele fica no valor antes dele
            remov = remov.getProx(); // Nesse caso, digamos assim, o remov foi pro proximo, agora o anterior está antes do remov
        }
        if(remov != null){
            if(remov == inicio){ // 1° Caso, se quisermos remover o Inicio
                inicio = remov.getProx(); // Agora o inicio passa a apontar para B em vez do A
                remov.setProx(null); // Desligamos o nó da estrutura
            } else if(remov == aux){ // 2° Caso, se quisermos remover o ultimo nó
                aux = anterior; // Auxiliar passa a apontar para onde o anterior estiver
                anterior.setProx(null); // Agora o B, digamos assim deixa de apontar para o C (O PROXIMO)
            } else{ // 3° Caso, caso queira remover um do meio
                anterior.setProx(remov.getProx()); // Faz apontar o anterior para o proximo do proximo
                // basicamente ele vai setar o proximo como a informação  que volta do getProx onde está o remov
                remov.setProx(null); // Aqui só desligamos o Prox do nó onde está o Remov
            }
            return true;
        }
        return false;
    }

    // Agora vamos fazer o metodo para apagar a lista
    public void apagarLista(){
        inicio = null;
        aux = null;
        atual = null;
        // A lista existe por causa das referencias, se elas forem vazias, então a lista se apaga sozinha.

    }

    public void aumentoPrecoLista(double percentual){
        No andaLista = inicio;
        while(andaLista != null){ // Vai fazer ate a lista existir, já que nao modificamos para ser em um produto só
            Produto prod = andaLista.getProduto(); // Dessa forma ele vai guarda o valor do produto que estiver parado o andaLista e guardar dentro do prod
            double novoPreco = prod.getPreco() + (prod.getPreco() * percentual / 100); // Basicamente vai guardar dentro do novo preco, o preço atual
            // que vai ser somado ao preçodele mesmo vezes o percentual que o usuario quer aumentar dividido por 100, calculo de porcentagem basica
            prod.setPreco(novoPreco); // seta o preço do produto escolhido com o novo preço

            // Caso queiramos parar em um so produto criariamos a variavel id, fariamos a verificação e depois de tudo e depois um break para parar o while
        }
    }
}
