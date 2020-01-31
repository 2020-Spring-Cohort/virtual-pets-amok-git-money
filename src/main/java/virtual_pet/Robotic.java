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

            oilLevel += 3;

    }


    public void walk() {
        oilLevel -= 2;
    }

    public Object getOilLevel(){
        return oilLevel;
    }


    @Override
    public void tick() {
//        if(weight > 1) {
//            weight--;
//        }else{
//            System.out.println(Colors.RED+petName + " is looking like skin and bones"+Colors.RESET);
//        }
//        if(hunger < 10) {
//            hunger++;
//        }else{
//
//            System.out.println(Colors.RED+petName + " has died from your neglect, you monster"+Colors.RESET);
//            petDies();
//        }
        if(boredomLevel < 10) {
            boredomLevel++;
        }else{
            System.out.println(Colors.RED+petName + " has died of boredom. It's a thing"+Colors.RESET);
            petDies();
        }

//        if(thirst < 10) {
//            thirst++;
//        }else{
//            System.out.println(Colors.RED+petName + " has died of thirst"+Colors.RESET);
//            petDies();
//        }
        if(health < 1){
            System.out.println(Colors.RED+petName + " has died"+Colors.RESET);
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




