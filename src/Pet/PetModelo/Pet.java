package Pet.PetModelo;

public class Pet {
    private String nome;
    private int idade;
    private double peso;
    private String raca;
    private int ID;
    private static int contador = 1;

    public Pet(String nome, int idade, String especie){
        this.nome = nome;
        this.idade = idade;
        this.raca = especie;
        this.ID = contador++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "ID=" + ID +
                ", raça='" + raca + '\'' +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }
}
