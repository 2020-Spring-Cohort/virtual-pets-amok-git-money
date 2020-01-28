package virtual_pet;

import java.util.HashMap;
import java.util.Map;

public  class VirtualPetShelter {
    public  Map<String, VirtualPet> petList = new HashMap<>();

    public  void addANewPet(VirtualPet virtualPet) {

        petList.put(virtualPet.petName, virtualPet);
    }


    public  void displayAllPets() {
        String headerAlignFormat = "| %-15s | %-15s | %-15s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s |%n";

        System.out.printf(headerAlignFormat, "Name ","Color","Type","Boredom ","Clean","Oil","Health ","Weight ","Thirst ","Hunger ");
        System.out.println("+-----------------+-----------------+-----------------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+");

        String leftAlignFormatOrganic = "| %-15s | %-15s | %-15s | %-9d | %-9d | %-9s | %-9d | %-9d | %-9d | %-9d |%n";
        String leftAlignFormatRobotic = "| %-15s | %-15s | %-15s | %-9d | %-9s | %-9d | %-9d | %-9d | %-9d | %-9d |%n";

        for (Map.Entry<String, VirtualPet> pet : petList.entrySet()) {
            if (pet instanceof Organic) {
                System.out.printf(leftAlignFormatOrganic, pet.getValue().petName, pet.getValue().color, pet.getValue().getType() + " " + pet.getValue().getSpecies(), pet.getValue().boredomLevel, pet.getValue().cleanliness, "-", pet.getValue().health, pet.getValue().weight, pet.getValue().thirst, pet.getValue().hunger);
            } else {
                System.out.printf(leftAlignFormatRobotic, pet.getValue().petName, pet.getValue().color, pet.getValue().getType() + " " + pet.getValue().getSpecies(), pet.getValue().boredomLevel, "-", pet.getValue().getOilLevel(), pet.getValue().health, pet.getValue().weight, pet.getValue().thirst, pet.getValue().hunger);
            }
            System.out.println("+-----------------+-----------------+-----------------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+");

        }
        System.out.println("");

    }








    public  void feedAPet(String name) {
        if(name.equalsIgnoreCase("All")){
            for (Map.Entry<String, VirtualPet> pet : petList.entrySet()){
                pet.getValue().feed();

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


    public  void bringToVet(String name) {
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
    public  void tickAllPets(){
        for (Map.Entry<String, VirtualPet> pet : petList.entrySet()) {
                pet.getValue().tick();
        }
    }

    public  void playWithPet(String name) {
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
    }

    public  void giveWaterToPet(String name) {
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
    }

    public  void cleanCage(String name) {
        if (petList.containsKey(name)){
            for (Map.Entry<String, VirtualPet> pet : petList.entrySet()) {
                if (pet.getKey().equals(name)) {
                    pet.getValue().clean();
                    System.out.println("You cleaned " + name + "'s cage.");
                }
            }
        }else{
            System.out.println("That pet is not here");
        }
    }

    public void fillOil(String animalToFillOil) {

        if(petList.get(animalToFillOil) instanceof Robotic) {
            ((Robotic) petList.get(animalToFillOil)).maintenance();
            System.out.println("Maintenance successful!");
        }else{
            System.out.println(animalToFillOil + " is not Robotic");
        }
    }

    public void walkAPet(String animalToWalk) {
        if(petList.get(animalToWalk) instanceof Robotic) {
            ((Robotic) petList.get(animalToWalk)).walk();
            System.out.println("You walked your robotic pet");
        } else {
            ((Organic) petList.get(animalToWalk)).walk();
            System.out.println("You walked your organic pet");
        }
    }
}


