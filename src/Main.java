import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetManager petManager = new PetManager();



        System.out.println("Lista de pets");
        petManager.listPets();
    }
}
