package virtual_pet;

public class Robotic extends VirtualPet {

    private int oilLevel =0;





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

    public Object getOilLevel(){
        return oilLevel;
    }


    @Override

    public void tick() {
        if(weight > 1) {
            weight--;
        }else{
            System.out.println(petName + " is looking like skin and bones");
        }
        if(hunger < 10) {
            hunger++;
        }else{

            System.out.println(petName + " has died from your neglect, you monster");
            petDies();
        }
        if(boredomLevel < 10) {
            boredomLevel++;
        }else{
            System.out.println(petName + " has died of boredom. It's a thing");
            petDies();
        }

        if(thirst < 10) {
            thirst++;
        }else{
            System.out.println(petName + " has died of thirst");
            petDies();
        }
        if(health < 1){
            System.out.println(petName + " has died");
            petDies();
        }

        if(oilLevel >0 ) {
            oilLevel--;
        }else{
            System.out.println( petName + " Oil is low");
            health--;
        }

    }




}