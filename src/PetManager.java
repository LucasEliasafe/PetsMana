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
}
