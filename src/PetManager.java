import java.util.ArrayList;
import java.util.List;

public class PetManager {
    private List<Pet> pets, type;

    public PetManager() {
        this.pets = new ArrayList<>();
    }

    public void addPet(String name, String type) {
        Pet pet = new Pet(name, type);
        this.pets.add(pet);
        System.out.println("Pet adicionado com sucesso: "+ pet);
        System.out.println("Tipo adicionado com sucesso: "+ type);
    }

    public void removePet(String name, String Type) {
        Pet petToRemove = null;
        for (Pet pet : pets) {
            if (pet.getName().equalsIgnoreCase(name) && pet.getType().equalsIgnoreCase(Type)) {
                petToRemove = pet;
                break;
            }
        }
        if (petToRemove != null) {
            pets.remove(petToRemove);
            System.out.println(name + " do tipo " + type + "foi removido.");
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
