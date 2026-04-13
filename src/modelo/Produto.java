package modelo;

public class Produto {
    private String nome; // Nome do Produto
    private double preco; // Preço do Produto
    private int ID; // Identificador do Produto
    private static int contador = 1; // Gerar ID AUTO_INCREMENT

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.ID = contador++;
    }

    // Getters:
    /*
    São métodos usados para consultar valores privados da classe.
    Como os atributos estão com private, não devemos acessar diretamente de fora.
    Então usamos getters.
     */

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getID() {
        return ID;
    }

    // Setter para atualizar preço na lista
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Fazer parecer bonito quando imprimir
    @Override
    public String toString() {
        return "Produto { " +
                "nome = '" + nome + '\'' +
                ", preço = " + preco +
                ", ID = " + ID +
                '}';
    }
    // EXPLICAÇÃO --| toString |--
/*
    O que é toString()?
    É o método que define como o objeto será mostrado em text.
    Sem ele, ao imprimir o objeto, apareceria algo feio, como:
    modelo.Produto@1ab23cd
    Com toString(), aparecerá algo como:
    Produto { nome = 'Café', preco = 40.34, id = 1 }
*/

/*
    Terminado agora a classe Produto faz as seguintes funções:
    1- Guarda Nome
    2- Guarda Preço
    3- Gera ID automático
    4- Permite Consultar Atributos
    5- Permite Atualizar Preço
    6- Sabe se exibir em texto
*/
}
