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

    }
}