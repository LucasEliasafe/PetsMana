import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetManager petManager = new PetManager();

        while (true) {
            System.out.print("\nMenu");
            System.out.println("1. Add pet");
            System.out.println("2. Apagar Pet");
            System.out.println("3. Listar pets");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Pet: ");
                    String name = scanner.nextLine();
                    System.out.print("Tipo do Pet: ");
                    String type = scanner.nextLine();
                    petManager.addPet(name, type);
                break;
                case 2:
                    System.out.print("Nome do Pet a ser apagado: ");
                    String nameToRemove = scanner.nextLine();
                    petManager.removePet(nameToRemove);
                    break;
                case 3:
                    System.out.print("Lista de pets: ");
                    petManager.listPets();
                    break;
                case 4:
                    System.out.println("Saindo");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
