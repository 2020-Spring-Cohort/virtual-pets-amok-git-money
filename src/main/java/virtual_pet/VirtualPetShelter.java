package virtual_pet;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    public static Map<String,VirtualPet> petList = new HashMap<>();

    public static void addANewPet( VirtualPet virtualPet) {
petList.put(virtualPet.petName,virtualPet);
    }


    public static void displayAllPets() {
        for(Map.Entry <String,VirtualPet> pet: petList.entrySet()) {
            System.out.println("Pet Name : " + pet.getValue().petName);
            System.out.println("Boredm Level : " + pet.getValue().boredomLevel);
            System.out.println(" Cleanliness : " + pet.getValue().cleanliness);
            System.out.println("Color : " + pet.getValue().color);
            System.out.println("Health : " + pet.getValue().health);
            System.out.println("Weight : " + pet.getValue().weight);
            System.out.println("Thirst : " + pet.getValue().thirst);
            System.out.println("Hunger :" + pet.getValue().hunger);


        } }

        public static void feedAPet(String name) {
            for(Map.Entry <String,VirtualPet> pet: petList.entrySet()){
                if(pet.getKey().equals(name) ){pet.getValue().feed();
                    System.out.println(name+" Has been fed");}
            }

        }





}
