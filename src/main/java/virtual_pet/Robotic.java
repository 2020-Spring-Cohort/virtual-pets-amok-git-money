package virtual_pet;

public class Robotic extends VirtualPet {
    private int oilLevel = 5;





    public Robotic(String petName, String color, String species) {
        super(petName, color);
        this.type="Robotic";
        this.species= species;
    }

    public void maintenance() {

            oilLevel += 2;

    }


    public void walk() {
        oilLevel -= 2;
    }

    public int getOilLevel() {
        return oilLevel;
    }
}