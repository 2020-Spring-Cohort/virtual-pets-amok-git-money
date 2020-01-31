package virtual_pet;

public class Organic extends VirtualPet {

    private int cleanliness = 0;



    public int getCleanliness() {


        return cleanliness;
    }




    public Organic(String petName, String color, String species) {

        super(petName, color);
        this.cleanliness =5;
        this.type="Organic";
        this.species=species;

    }

    public void walk() {
        cleanliness+=1;
    }

    public void clean(){
        cleanliness+=3;
        if(cleanliness > 10){
            cleanliness = 10;
        }
    }


    @Override

    public void tick() {
        if(weight > 1) {
            weight--;
        }else{
            System.out.println(Colors.RED+petName + " is looking like skin and bones"+Colors.RESET);
        }
        if(hunger < 10) {
            hunger++;
        }else{

            System.out.println(Colors.RED+petName + " has died from your neglect, you monster"+Colors.RESET);
            petDies();
        }
        if(boredomLevel < 10) {
            boredomLevel++;
        }else{
            System.out.println(Colors.RED+petName + " has died of boredom. It's a thing"+Colors.RESET);
            petDies();
        }

        if(thirst < 10) {
            thirst++;
        }else{
            System.out.println(Colors.RED+petName + " has died of thirst"+Colors.RESET);
            petDies();
        }
        if(health < 1){
            System.out.println(Colors.RED+petName + " has died"+Colors.RESET);
            petDies();
        }

        if( cleanliness > 0 )
        {
            cleanliness--;
        }
        else{
            System.out.println(Colors.RED+ petName + " has a dirty cage"+Colors.RESET);
            health--;

        }

    }

}
