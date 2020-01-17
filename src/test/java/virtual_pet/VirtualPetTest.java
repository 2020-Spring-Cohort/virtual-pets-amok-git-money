package virtual_pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    private VirtualPet underTest;

    @BeforeEach
    void setUp() {
        underTest = new VirtualPet("BOB", "black");
    }

    @Test
    public void shouldBeAbleToCreatePet() {

    }

    @Test
    public void petShouldHaveAName(){
        String result = underTest.getName();
        assertEquals("BOB", result);
    }
    @Test
    public void petShouldHaveHungerSetToTen(){

        int result = underTest.getHunger();
        assertEquals(10, result);
    }
    @Test
    public void feedingPetShouldDecreaseHungerBy3(){

        underTest.feed();
        int result = underTest.getHunger();
        assertEquals(7, result);
    }
    @Test
    public void feedingNotBelowZero(){

        for(int i = 0; i<5; i++){
            underTest.feed();
        }
        int result = underTest.getHunger();
        assertEquals(0, result);
    }
    @Test
    public void healthShouldBe10(){
        underTest.getHealth();
        int result = underTest.getHealth();
        assertEquals(10, result);
    }
    @Test
    public void cleanlinessShouldBe10() {
        underTest.getCleanliness();
        int result = underTest.getCleanliness();
        assertEquals(10, result);
    }
    @Test
    public void weightShouldBeFiveByDefault(){

        int result = underTest.getWeight();
        assertEquals(5,result);
    }
    @Test
    public void feedShouldIncreaseWeightByTwo(){
       underTest.feed();
       int result = underTest.getWeight();
       assertEquals(7,result);

    }
    @Test
    public void boredomLevelShouldBeFive(){

        int result = underTest.getBoredomLevel();
        assertEquals(5,result);
    }
    @Test
    public void playShouldLowerBoredomLevel(){
underTest.play();
        int result = underTest.getBoredomLevel();
        assertEquals(3,result);
    }
    @Test
    public void healthShouldNeverBeMoreThanTen(){
        for(int i =0; i<6;i++){
            underTest.takeToDoctor();
        }
        int result = underTest.getHealth();
        assertEquals(10,result);
    }

}
