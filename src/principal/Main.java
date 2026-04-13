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
        System.out.println("Lista de Produtos: ");
        lista.exibir();

    }
}