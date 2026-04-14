package Pet.Principal;

import Pet.PetLista.PetLista;
import Pet.PetModelo.Pet;

public class UsaListaPet {
    public static void main(String[] args) {
        PetLista lista = new PetLista();

        lista.inserirPet(new Pet("Rex", 5, "Cachorro"));
        lista.inserirPet(new Pet("Mia", 3, "Gato"));
        lista.inserirPet(new Pet("Loro", 2, "Papagaio"));

        System.out.println("Lista de pets:");
        lista.exibirPet();

        System.out.println("\nPesquisa por id 2:");
        Pet pet = lista.pesquisarPet(2);

        if (pet != null) {
            System.out.println(pet);
        } else {
            System.out.println("Pet não encontrado");
        }
    }
}