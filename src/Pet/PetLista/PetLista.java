package Pet.PetLista;
import Pet.PetModelo.Pet;

public class PetLista {
   private PetNo inicio;
   private PetNo aux;
   private PetNo atual;

   public void inserirPet(Pet pet){
       if(inicio == null){
           inicio = new PetNo(pet, null);
           aux = inicio;
       } else {
           atual = new PetNo(pet, null);
           aux.setProx(atual);
           aux = atual;
       }
   }
   public void exibirPet(){
       PetNo andaLista = inicio;
       while(andaLista != null){
           System.out.println(andaLista.getPet());
           andaLista = andaLista.getProx();
       }
   }

   public Pet pesquisarPet(int id){
       PetNo andaLista = inicio;
       while(andaLista != null){
           if(andaLista.getPet().getID() == id){
               return andaLista.getPet();
           }
           andaLista = andaLista.getProx();
       }
       return null;
   }




}
