package virtual_pet;

public class Robotic extends VirtualPet {
    private int oilLevel;

    public Robotic(String petName, String color) {
        super(petName, color);
    }
    public void maintenance(){

    }
    public void walk(){
        oilLevel-=2;
    }
}
