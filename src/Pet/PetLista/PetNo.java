package Pet.PetLista;
import Pet.PetModelo.Pet;

public class PetNo {
    private Pet pet;
    private PetNo prox;

    public PetNo(Pet pet, PetNo no) {
        this.pet = pet;
        this.prox = no;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public PetNo getProx() {
        return prox;
    }

    public void setProx(PetNo no) {
        this.prox = no;
    }
}
