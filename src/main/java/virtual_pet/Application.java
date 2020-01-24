package virtual_pet;


import javax.naming.Name;
import java.util.Scanner;

public class Application {
   static int quitGame = 0;

    public static void main(String[] args) {
        VirtualPetShelter.addANewPet(new VirtualPet("Sam", "Green"));
        VirtualPetShelter.addANewPet(new VirtualPet("Bob", "Blue"));
        VirtualPetShelter.addANewPet(new VirtualPet("Josh", "Purple"));
        System.out.println("|---------------------------|");
        System.out.println("|Welcome to virtual Pet Game|");
        System.out.println("|---------------------------|");
        System.out.println("");
        while(quitGame == 0) {


            menu();


            game();

        }

        }

    public  static void menu(){
        System.out.println("MENU");
        System.out.println("[1] See list of pets");
        System.out.println("[2] Feed the pet");
        System.out.println("[3] Take the pet to the doctor");
        System.out.println("[4] Play with the pet");
        System.out.println("[5] Give water to the pet");
        System.out.println("[6] Clean the pet");
        System.out.println("[7] Add A New Pet");
        System.out.println("[8] Quit Game");



    }

       public static void game(){
           Scanner input = new Scanner(System.in);
           int choice= input.nextInt();
           input.nextLine();

           switch (choice){

               case 1:
                   VirtualPetShelter.displayAllPets();
                   break;
               case 2:
                   System.out.println("Enter name of pet to feed" + "\n"+ "Enter \"all\" if you want to feed all the pets");

                   String animalToFeed=input.nextLine();
                   VirtualPetShelter.feedAPet(animalToFeed);
                   break;
               case 3:
                   System.out.println("Enter name of pet to take to doctor ");
                   String animalToTakeToDoctor = input.nextLine();
                   VirtualPetShelter.bringToVet(animalToTakeToDoctor);
                   break;
               case 4:
                   System.out.println("Enter name of pet to play with");
                   String animalToPlayWith = input.nextLine();
                   VirtualPetShelter.playWithPet(animalToPlayWith);
                   break;
               case 5:
                   System.out.println("Enter name of pet to water");
                   String animalToWater = input.nextLine();
                   VirtualPetShelter.giveWaterToPet(animalToWater);
                   break;
               case 6:
                   System.out.println("Enter name of pet to clean their cage");
                   String animalToClean = input.nextLine();
                   VirtualPetShelter.cleanCage(animalToClean);
                   break;
               case 7:
                   System.out.println("Enter name of new pet");
                   String nameOfNewPet = input.nextLine();
                   System.out.println("Enter color for new pet");
                   String colorOfNewPet = input.nextLine();
                   VirtualPetShelter.addANewPet(new VirtualPet(nameOfNewPet, colorOfNewPet));
                   System.out.println(nameOfNewPet + " has been added to the shelter");
                   break;
               case 8:
                   System.out.println("Exited Game");
                   quitGame = 1;
                   break;

           }
       }

}

