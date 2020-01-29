package virtual_pet;

import java.util.HashMap;
import java.util.Map;

public  class VirtualPetShelter {
    String warningMessage = Colors.RED+"That Animal is not here !"+Colors.RESET;
    public  Map<String, VirtualPet> petList = new HashMap<>();

    public  void addANewPet(VirtualPet virtualPet) {

        petList.put(virtualPet.petName, virtualPet);
    }


    public  void displayAllPets() {
        String headerAlignFormat = Colors.BLUE+"| %-15s | %-15s | %-15s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s |%n"+Colors.RESET;

        System.out.printf(headerAlignFormat,"Name ","Color","Type","Boredom ","Clean","Oil","Health ","Weight ","Thirst ","Hunger ");
        System.out.println(Colors.BLUE+"+-----------------+-----------------+-----------------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+"+Colors.RESET);

        String leftAlignFormatOrganic = Colors.BLUE+"| %-15s | %-15s | %-15s | %-9d | %-9d | %-9s | %-9d | %-9d | %-9d | %-9d |%n"+Colors.RESET;
        String leftAlignFormatRobotic = Colors.BLUE+"| %-15s | %-15s | %-15s | %-9d | %-9s | %-9d | %-9d | %-9d | %-9d | %-9d |%n"+Colors.RESET;

        for (Map.Entry<String, VirtualPet> pet : petList.entrySet()) {
            if (pet.getValue() instanceof Organic) {
                System.out.printf(leftAlignFormatOrganic, pet.getValue().petName, pet.getValue().color, pet.getValue().getType() + " " + pet.getValue().getSpecies(), pet.getValue().boredomLevel, ((Organic)pet.getValue()).getCleanliness(), "-", pet.getValue().health, pet.getValue().weight, pet.getValue().thirst, pet.getValue().hunger);
            } else {
                System.out.printf(leftAlignFormatRobotic, pet.getValue().petName, pet.getValue().color, pet.getValue().getType() + " " + pet.getValue().getSpecies(), pet.getValue().boredomLevel, "-", ((Robotic)pet.getValue()).getOilLevel(), pet.getValue().health, pet.getValue().weight, pet.getValue().thirst, pet.getValue().hunger);
            }
            System.out.println(Colors.BLUE+"+-----------------+-----------------+-----------------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+"+Colors.RESET);

        }
        System.out.println("");

    }








    public  void feedAPet(String name) {
        if(name.equalsIgnoreCase("All")){
            for (Map.Entry<String, VirtualPet> pet : petList.entrySet()){
                pet.getValue().feed();

            }
            System.out.println(Colors.GREEN+"All pets have been fed"+Colors.RESET);
        }
        else if (petList.containsKey(name)) {
            for (Map.Entry<String, VirtualPet> pet : petList.entrySet()) {
                if (pet.getKey().equals(name)) {
                    pet.getValue().feed();
                    System.out.println(Colors.GREEN+name + " Has been fed"+Colors.RESET);
                }
            }


        } else {
            System.out.println(warningMessage);
        }

    }


    public  void bringToVet(String name) {
        if (petList.containsKey(name)){
        for (Map.Entry<String, VirtualPet> pet : petList.entrySet()) {
            if (pet.getKey().equals(name)) {
                pet.getValue().takeToDoctor();
                System.out.println(Colors.GREEN+name + " Has been gone to the doctor"+Colors.RESET);
            }
        }
        }else{
            System.out.println(warningMessage);
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
                    System.out.println(Colors.GREEN+"You played with " + name+Colors.RESET);
                }
            }
        }else{
            System.out.println(warningMessage);
        }
    }

    public  void giveWaterToPet(String name) {
        if (petList.containsKey(name)){
            for (Map.Entry<String, VirtualPet> pet : petList.entrySet()) {
                if (pet.getKey().equals(name)) {
                    pet.getValue().waterPet();
                    System.out.println(Colors.GREEN+"You gave water to " + name+Colors.RESET);
                }
            }
        }else{
            System.out.println(warningMessage);
        }
    }

    public  void cleanCage(String name) {
        if (petList.containsKey(name)){
            for (Map.Entry<String, VirtualPet> pet : petList.entrySet()) {
                if (pet.getKey().equals(name)) {
                    ((Organic)pet.getValue()).clean();
                    System.out.println(Colors.GREEN+"You cleaned " + name + "'s cage."+Colors.RESET);
                }
            }
        }else{
            System.out.println(warningMessage);
        }
    }

    public void fillOil(String animalToFillOil) {

        if(petList.get(animalToFillOil) instanceof Robotic) {
            ((Robotic) petList.get(animalToFillOil)).maintenance();
            System.out.println(Colors.GREEN+"Maintenance successful!"+Colors.RESET);
        }else{
            System.out.println(Colors.RED+animalToFillOil + " is not Robotic"+Colors.RESET);
        }
    }

    public void walkAPet(String animalToWalk) {
        if(petList.get(animalToWalk) instanceof Robotic) {
            ((Robotic) petList.get(animalToWalk)).walk();
            System.out.println(Colors.GREEN+"You walked your robotic pet"+Colors.RESET);
        } else {
            ((Organic) petList.get(animalToWalk)).walk();
            System.out.println(Colors.GREEN+"You walked your organic pet"+Colors.RESET);
        }
    }
}


