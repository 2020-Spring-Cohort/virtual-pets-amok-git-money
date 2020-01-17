package virtual_pet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new VirtualPet("BOB", "black");
    }

    @Test
    public void petShouldHaveAName(){
        VirtualPet underTest = new VirtualPet("BOB", "black");
        String result = underTest.getName();
        assertEquals("BOB", result);
    }
    @Test
    public void petShouldHaveHungerSetToTen(){
        VirtualPet underTest = new VirtualPet("BOB", "black");
        int result = underTest.getHunger();
        assertEquals(10, result);
    }
    @Test
    public void feedingPetShouldDecreaseHungerBy3(){
        VirtualPet underTest = new VirtualPet("BOB", "black");
        underTest.feed();
        int result = underTest.getHunger();
        assertEquals(7, result);
    }
    @Test
    public void feedingNotBelowZero(){
        VirtualPet underTest = new VirtualPet("BOB", "black");

        for(int i = 0; i<5; i++){
            underTest.feed();
        }
        int result = underTest.getHunger();
        assertEquals(0, result);
    }
    @Test
    public void healthShouldBe10(){
        VirtualPet underTest = new VirtualPet("BOB", "black");
        underTest.getHealth();
        int result = underTest.getHealth();
        assertEquals(10, result);
    }
    @Test
    public void cleanlinessShouldBe10() {
        VirtualPet underTest = new VirtualPet("BOB", "black");
        underTest.getCleanliness();
        int result = underTest.getCleanliness();
        assertEquals(10, result);
    }

}
