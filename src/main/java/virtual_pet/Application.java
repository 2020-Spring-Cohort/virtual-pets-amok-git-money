package virtual_pet;



public class Application {
    public static void main(String[] args) {
        System.out.println("|--------------------------|");
        System.out.println("|Welcome to virtual Pet Gme|");
        System.out.println("|--------------------------|");
        System.out.println("");

        menu();
        VirtualPetShelter.addANewPet(new VirtualPet("Sam", " Green"));
        VirtualPetShelter.addANewPet(new VirtualPet("Bob", " Blue"));
        VirtualPetShelter.addANewPet(new VirtualPet("Josh", " Purple"));

VirtualPetShelter.displayAllPets();
VirtualPetShelter.feedAPet("Sam");

        }
    public  static void menu(){
        System.out.println("MENU");
        System.out.println("[1] Start/ resume Game");
        System.out.println("[2] Start Game");
        System.out.println("[1] Start Game");
        System.out.println("[1] Start Game");
        System.out.println("[5] Quit Game");

       }

}
