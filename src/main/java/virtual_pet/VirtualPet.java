package virtual_pet;

public abstract class VirtualPet {
    public String petName = "";
    public String color = "";



    public String species="";
    public int weight = 5;
    public int boredomLevel = 5;
    public int health = 5;
    public int hunger = 5;
    public int cleanliness = 5;
    public int thirst = 5;
    public int oilLevel = 0;


    public String type= "";

    public VirtualPet(String petName, String color) {
        this.petName = petName;
        this.color = color;
    }

    public void feed(){
        hunger-=3;
        if(hunger < 0){
            hunger = 0;
        }
        weight+=2;

    }
    public void play(){
        boredomLevel-=2;
        if(boredomLevel < 0){
            boredomLevel=0;
        }
    }
    public void takeToDoctor(){
        health+=3;
        if(health>10){
            health = 10;
        }
    }
    public void clean(){
        cleanliness+=3;
        if(cleanliness > 10){
            cleanliness = 10;
        }
    }
    public void waterPet(){
        thirst-=3;
        if(thirst < 0){
            thirst = 0;
        }
    }

    public int getHunger(){
        return hunger;
    }

    public String getName(){
        return petName;
    }

    public int getHealth() {
        return health;

    }
    public String getType() {
        return type;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public int getWeight() {
        return weight;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public int getThirst() {
        return thirst;
    }
    public String getSpecies() {
        return species;
    }

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
        if(cleanliness > 0) {
            cleanliness --;
        }else{
            System.out.println(petName + " has become sick and needs a vet");

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
        if(oilLevel < 1){
            System.out.println(petName + " has run out of oil and need maintenance");

        }
    }

    public Object getOilLevel(){
        return oilLevel;
    }


    public void petDies() {

        System.out.println(" Game over your pet died");
        System.exit(0);


    }
}

