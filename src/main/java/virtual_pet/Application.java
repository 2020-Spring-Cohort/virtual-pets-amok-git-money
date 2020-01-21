package virtual_pet;



public class Application {
    public static void main(String[] args) {
        System.out.println("|--------------------------|");
        System.out.println("|Welcome to virtual Pet Gme|");
        System.out.println("|--------------------------|");
        System.out.println("");

        menu();
        VirtualPet virtualPet1=new VirtualPet("bob","red");
        VirtualPet virtualPet2=new VirtualPet("sou","green");
        VirtualPet virtualPet3=new VirtualPet("daq","violet");
        VirtualPetShelter.addANewPet();

VirtualPetShelter.displayAllPets();

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
