package virtual_pet;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    public static Map<String,VirtualPet> petList = new HashMap<>();

    public static void addANewPet() {
        VirtualPet virtualPet1=new VirtualPet("bob","red");
petList.put(virtualPet1.petName,virtualPet1);
    }


    public static void displayAllPets() {
        for(String id: petList.keySet()) {
            System.out.println("This student's name is " + petList.get(id));
        }
    }

}
