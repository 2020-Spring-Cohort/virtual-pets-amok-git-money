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
 weight--;
 hunger++;
 boredomLevel++;
 cleanliness-=2;
 thirst++;
    }
}

