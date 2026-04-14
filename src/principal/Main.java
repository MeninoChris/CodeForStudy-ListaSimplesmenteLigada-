package principal;

import lista.Lista;
import lista.No;
import modelo.Produto;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista(); // Instanciando Objeto Lista, da classe Lista

        lista.inserir(new Produto("Café", 46.00)); // Cria objeto produto (ID automaticamente é 1)
        lista.inserir(new Produto("Azeite", 36.00));
        lista.inserir(new Produto("Arroz", 20.00));

        // Antes da exibição mostra um texto
        System.out.println("\n Lista de Produtos: ");
        lista.exibir();

        System.out.println("\n Pesquisa");
        Produto guardaRes = lista.pesquisar(2); // Pega o que retorna e guarda na variavel guardaRes
        if( guardaRes != null){
            System.out.println("O produto encontrado foi: " + guardaRes); // Caso ache o ‘ID’, ele so mostra o produto
        } else{
            System.out.println("Produto não encontrado.");
        }

        // Atualização
        System.out.println("\nAtualizando o preço: ");
        boolean atualizado = lista.atualizar(2, 30.00);

        if(atualizado){
            System.out.println("O preço do produto foi atualizado com sucesso");
        } else {
            System.out.println("O produto não foi encontrado");
        }

        // Exibindo lista apos a atualização
        System.out.println("\nLista com produtos atualizados:");
        lista.exibir();

        // Tirando algum produto da Lista
        System.out.println("\nRemovendo o ID 2");
        boolean removido = lista.remover(2);

        if(removido){
            System.out.println("O produto com o ID selecionado foi removido com sucesso");
        } else{
            System.out.println("O produto com o ID selecionado não foi encontrado");
        }

        System.out.println("\nLista após remoção");
        lista.exibir();

    }
}