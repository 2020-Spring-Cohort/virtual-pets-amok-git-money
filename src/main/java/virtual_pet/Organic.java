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

        if( cleanliness > 0 )
        {
            cleanliness--;
        }
        else{
            System.out.println( petName + "Has a dirty cage");
            health--;

        }

    }

}
