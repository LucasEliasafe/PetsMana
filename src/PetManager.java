import java.util.ArrayList;
import java.util.List;

public class PetManager {
    private List<Pet> pets;

    public PetManager() {
        this.pets = new ArrayList<>();
    }

    public void addPet(String name, String type) {
        Pet pet = new Pet(name, type);
        this.pets.add(pet);
    }

    public void removePet(String name) {
        Pet petToRemove = null;
        for (Pet pet : pets) {
            if (pet.getName().equals(name)) {
                petToRemove = pet;
                break;
            }
        }
        if (petToRemove != null) {
            pets.remove(petToRemove);
            System.out.println(name + " foi removido.");
        } else {
            System.out.println("Pet não encontrado.");
        }
    }

    public void listPets() {
        if (pets.isEmpty()){
            System.out.println("No pets found");
        } else {
            for (Pet pet : pets) {
                System.out.println(pet);
            }
        }
    }
}
