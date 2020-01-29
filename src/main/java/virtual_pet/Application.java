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

//        System.out.println(Colors.BLUE+"|---------------------------|"+Colors.RESET);
//        System.out.println(Colors.BLUE+"|Welcome to virtual Pet Game|"+Colors.RESET);
//        System.out.println(Colors.BLUE+"|---------------------------|"+Colors.RESET);
        System.out.println();
        System.out.println();
        System.out.println("     /\\_/\\                            /\\_/\\");
        System.out.println("     (^ ^)                            {@ @}");
        System.out.println("     ==~==                            ==o==");
        System.out.println("      \\@/                              \\^/");
        System.out.println("      |=|                              ###_");
        System.out.println("(    /  \\    *********************    /    \\");
        System.out.println(" \\  /   | --------------------------- |     \\");
        System.out.println("  )/ |||| Welcome to virtual Pet Game ||||(  \\   \\");
        System.out.println(" (( /|||| --------------------------- |||| \\  )   )");
        System.out.println("   m !m!m    *********************    m!m! m-~(__/");

        System.out.println("");


        while(quitGame == 0) {


            menu();


            game(shelter);

        }

        }

    public  static void menu(){
        String menuAlignFormat = Colors.BLUE+" %-25s  %-25s %n"+Colors.RESET;

        System.out.println("                        "+"MENU"+"          ");
        System.out.println("");
        System.out.printf(menuAlignFormat,"[1] See list of pets","[7] Fill oil robotic pet");
        System.out.printf(menuAlignFormat,"[2] Feed the pet","[8] Walk a pet");
        System.out.printf(menuAlignFormat,"[3] Bring Pet to Vet","[9] Add A New Organic Pet");
        System.out.printf(menuAlignFormat,"[4] Play with the pet","[10] Add A New Robotic Pet");
        System.out.printf(menuAlignFormat,"[5] Give water to the pet","[11] Quit Game");
        System.out.printf(menuAlignFormat,"[6] Clean the pet cage","");





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
                   System.out.println(Colors.YELLOW+"Enter name of pet to feed" + "\n"+ "Enter \"all\" if you want to feed all the pets"+Colors.RESET);

                   String animalToFeed=input.nextLine();
                   shelter.feedAPet(animalToFeed);
                   shelter.tickAllPets();
                   break;
               case 3:
                   System.out.println(Colors.YELLOW+"Enter name of pet to take to doctor "+Colors.RESET);
                   String animalToTakeToDoctor = input.nextLine();
                   shelter.bringToVet(animalToTakeToDoctor);
                   shelter.tickAllPets();
                   break;
               case 4:
                   System.out.println(Colors.YELLOW+"Enter name of pet to play with"+Colors.RESET);
                   String animalToPlayWith = input.nextLine();
                   shelter.playWithPet(animalToPlayWith);
                   shelter.tickAllPets();
                   break;
               case 5:
                   System.out.println(Colors.YELLOW+"Enter name of pet to water"+Colors.RESET);
                   String animalToWater = input.nextLine();
                   shelter.giveWaterToPet(animalToWater);
                   shelter.tickAllPets();
                   break;
               case 6:
                   System.out.println(Colors.YELLOW+"Enter name of pet to clean their cage"+Colors.RESET);
                   String animalToClean = input.nextLine();
                   shelter.cleanCage(animalToClean);
                   shelter.tickAllPets();
                   break;
               case 7:
                   System.out.println(Colors.YELLOW+"Enter name of pet to fill their oil"+Colors.RESET);
                   String animalToFillOil = input.nextLine();
                   shelter.fillOil(animalToFillOil);
                   shelter.tickAllPets();
                   break;
               case 8:
                   System.out.println(Colors.YELLOW+"Enter name of pet to walk"+Colors.RESET);
                   String animalToWalk = input.nextLine();
                   shelter.walkAPet(animalToWalk);
                   shelter.tickAllPets();
                   break;
               case 9:
                   System.out.println(Colors.YELLOW+"Enter name of new Organic pet"+Colors.RESET);
                   String nameOfNewOrganicPet = input.nextLine();
                   System.out.println(Colors.YELLOW+"Enter color for new  Organic pet"+Colors.RESET);
                   String colorOfNewOrganicPet = input.nextLine();
                   System.out.println(Colors.YELLOW+"Enter species of pet ('Cat' or 'Dog'"+Colors.RESET);
                   String speciesOfNewOrganicPet = input.nextLine();
                   shelter.addANewPet(new Organic(nameOfNewOrganicPet, colorOfNewOrganicPet,speciesOfNewOrganicPet));
                   System.out.println(Colors.GREEN+nameOfNewOrganicPet + " has been added to the shelter"+Colors.RESET);
                   break;
               case 10:
                   System.out.println(Colors.YELLOW+"Enter name of new Robotic pet"+Colors.RESET);
                   String nameOfNewRoboticPet = input.nextLine();
                   System.out.println(Colors.YELLOW+"Enter color for new  Robotic pet"+Colors.RESET);
                   String colorOfNewRoboticPet = input.nextLine();
                   System.out.println(Colors.YELLOW+"Enter species of pet ('Cat' or 'Dog')"+Colors.RESET);
                   String speciesOfNewRoboticPet = input.nextLine();
                   shelter.addANewPet(new Robotic(nameOfNewRoboticPet, colorOfNewRoboticPet,speciesOfNewRoboticPet));
                   System.out.println(Colors.GREEN+nameOfNewRoboticPet + " has been added to the shelter"+Colors.RESET);
                   break;
               case 11:
                   System.out.println(Colors.GREEN+"Exited Game"+Colors.RESET);
                   quitGame = 1;
                   break;

           }
       }

}

