package virtual_pet;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    public static Map<String, VirtualPet> petList = new HashMap<>();

    public static void addANewPet(VirtualPet virtualPet) {
        petList.put(virtualPet.petName, virtualPet);
    }


    public static void displayAllPets() {
        for (Map.Entry<String, VirtualPet> pet : petList.entrySet()) {
            System.out.println("Pet Name : " + pet.getValue().petName);
            System.out.println("Boredom : " + pet.getValue().boredomLevel);
            System.out.println("Cleanliness : " + pet.getValue().cleanliness);
            System.out.println("Color : " + pet.getValue().color);
            System.out.println("Health : " + pet.getValue().health);
            System.out.println("Weight : " + pet.getValue().weight);
            System.out.println("Thirst : " + pet.getValue().thirst);
            System.out.println("Hunger :" + pet.getValue().hunger);


        }
    }

    public static void feedAPet(String name) {
        if(name.equalsIgnoreCase("All")){
            for (Map.Entry<String, VirtualPet> pet : petList.entrySet()){
                pet.getValue().feed();

                pet.getValue().tick();
                System.out.println(pet.getValue().petName + " Has Ticked");


            }
            System.out.println("All pets have been fed");
        }
        else if (petList.containsKey(name)) {
            for (Map.Entry<String, VirtualPet> pet : petList.entrySet()) {
                if (pet.getKey().equals(name)) {
                    pet.getValue().feed();
                    System.out.println(name + " Has been fed");
                }
            }


        } else {
            System.out.println("That animal is not here");
        }

    }


    public static void bringToVet(String name) {
        if (petList.containsKey(name)){
        for (Map.Entry<String, VirtualPet> pet : petList.entrySet()) {
            if (pet.getKey().equals(name)) {
                pet.getValue().takeToDoctor();
                System.out.println(name + " Has been gone to the doctor");
            }
        }
        }else{
            System.out.println("That pet is not here");
        }
        tickAllPets();
    }
    public static void tickAllPets(){
        for (Map.Entry<String, VirtualPet> pet : petList.entrySet()) {
                pet.getValue().tick();
        }
    }

    public static void playWithPet(String name) {
        if (petList.containsKey(name)){
            for (Map.Entry<String, VirtualPet> pet : petList.entrySet()) {
                if (pet.getKey().equals(name)) {
                    pet.getValue().play();
                    System.out.println("You played with " + name);
                }
            }
        }else{
            System.out.println("That pet is not here");
        }
        tickAllPets();
    }

    public static void giveWaterToPet(String name) {
        if (petList.containsKey(name)){
            for (Map.Entry<String, VirtualPet> pet : petList.entrySet()) {
                if (pet.getKey().equals(name)) {
                    pet.getValue().waterPet();
                    System.out.println("You gave water to " + name);
                }
            }
        }else{
            System.out.println("That pet is not here");
        }
        tickAllPets();
    }
}


