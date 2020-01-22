package virtual_pet;


import javax.naming.Name;
import java.util.Scanner;

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

        game();



        }
    public  static void menu(){
        System.out.println("MENU");
        System.out.println("[1] Feed the pet");
        System.out.println("[2]  Take the pet to the doctor");
        System.out.println("[3] Play with the pet");
        System.out.println("[4] Give water to the pet");
        System.out.println("[5] Clean the pet");


       }

       public static void game(){
           Scanner input = new Scanner(System.in);
           int choice= input.nextInt();
           input.nextLine();

           switch (choice){

               case 1:
                   System.out.println(" Name of pet to feed" + "\n"+ "Enter \"all\" if you want to feed all the pets");

                   String petName=input.nextLine();
                   VirtualPetShelter.feedAPet(petName);

           }
       }

}
