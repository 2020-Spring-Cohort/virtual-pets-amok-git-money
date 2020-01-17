package virtual_pet;

public class VirtualPet {
    public String petName = "";
    public String color = "";
    public int weight = 5;
    public int boredomLevel = 0;
    public int health = 10;
    public int hunger = 10;
    public int cleanliness = 10;
    public int thirst = 0;

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
        if(weight < 1){
            weight = 1;
        }
    }
    public void play(){
        boredomLevel-=3;
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

    public int getCleanliness() {
        return cleanliness;
    }
}

