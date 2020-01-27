package virtual_pet;


import javax.naming.Name;
import java.util.Scanner;

public class Application {
   static int quitGame = 0;


    public static void main(String[] args) {
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addANewPet(new Organic("Sam", "Green","Cat"));
        shelter.addANewPet(new Organic("Bob", "Blue","Dog"));
        shelter.addANewPet(new Robotic("Josh", "Purple","Dog"));

        System.out.println("|---------------------------|");
        System.out.println("|Welcome to virtual Pet Game|");
        System.out.println("|---------------------------|");
        System.out.println("");


        while(quitGame == 0) {


            menu();


            game(shelter);

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
        System.out.println("[7] Add A New Organic Pet");
        System.out.println("[8] Add A New Robotic Pet");
        System.out.println("[9] Quit Game");



    }

       public static void game(VirtualPetShelter shelter){

           Scanner input = new Scanner(System.in);
           int choice= input.nextInt();
           input.nextLine();

           switch (choice){

               case 1:
                   shelter.displayAllPets();
                   break;
               case 2:
                   System.out.println("Enter name of pet to feed" + "\n"+ "Enter \"all\" if you want to feed all the pets");

                   String animalToFeed=input.nextLine();
                   shelter.feedAPet(animalToFeed);
                   break;
               case 3:
                   System.out.println("Enter name of pet to take to doctor ");
                   String animalToTakeToDoctor = input.nextLine();
                   shelter.bringToVet(animalToTakeToDoctor);
                   break;
               case 4:
                   System.out.println("Enter name of pet to play with");
                   String animalToPlayWith = input.nextLine();
                   shelter.playWithPet(animalToPlayWith);
                   break;
               case 5:
                   System.out.println("Enter name of pet to water");
                   String animalToWater = input.nextLine();
                   shelter.giveWaterToPet(animalToWater);
                   break;
               case 6:
                   System.out.println("Enter name of pet to clean their cage");
                   String animalToClean = input.nextLine();
                   shelter.cleanCage(animalToClean);
                   break;
               case 7:
                   System.out.println("Enter name of new  Organic pet");
                   String nameOfNewOrganicPet = input.nextLine();
                   System.out.println("Enter color for new  Organic pet");
                   String colorOfNewOrganicPet = input.nextLine();
                   System.out.println("Enter species of pet ('Cat' or 'Dog'");
                   String speciesOfNewOrganicPet = input.nextLine();
                   shelter.addANewPet(new Organic(nameOfNewOrganicPet, colorOfNewOrganicPet,speciesOfNewOrganicPet));
                   System.out.println(nameOfNewOrganicPet + " has been added to the shelter");
                   break;
               case 8:
                   System.out.println("Enter name of new  Robotic pet");
                   String nameOfNewRoboticPet = input.nextLine();
                   System.out.println("Enter color for new  Robotic pet");
                   String colorOfNewRoboticPet = input.nextLine();
                   System.out.println("Enter species of pet ('Cat' or 'Dog'");
                   String speciesOfNewRoboticPet = input.nextLine();
                   shelter.addANewPet(new Organic(nameOfNewRoboticPet, colorOfNewRoboticPet,speciesOfNewRoboticPet));
                   System.out.println(nameOfNewRoboticPet + " has been added to the shelter");
                   break;
               case 9:
                   System.out.println("Exited Game");
                   quitGame = 1;
                   break;

           }
       }

}

