package virtual_pet;

public class Robotic extends VirtualPet {





    public Robotic(String petName, String color, String species) {
        super(petName, color);
        this.type="Robotic";
        this.species= species;
        this.oilLevel = 5;
    }

    public void maintenance() {

            oilLevel += 2;

    }


    public void walk() {
        oilLevel -= 2;
    }



}