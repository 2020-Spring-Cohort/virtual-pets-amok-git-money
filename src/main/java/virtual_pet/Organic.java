package virtual_pet;

public class Organic extends VirtualPet {



    public Organic(String petName, String color, String species) {
        super(petName, color);
        this.type="Organic";
        this.species=species;

    }

    public void walk() {
        cleanliness+=1;
    }

}
