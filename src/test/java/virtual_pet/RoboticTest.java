package virtual_pet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RoboticTest {

    @Test
    public void shoulHaveARoboticClass(){
        RoboticTest underTest = new RoboticTest();
        
    }
    @Test
    public void walkShouldDecreaseOilLevel(){
        Robotic underTest = new Robotic("hun","yellow");
        underTest.walk();
        int result = underTest.getOilLevel();
        assertEquals(3,result);
    }

    @Test
    public void maintenanceShouldIncreaseOilLevelBytwo(){
        Robotic underTest = new Robotic("hun","yellow");
        underTest.maintenance();
        int result = underTest.getOilLevel();
        assertEquals(7,result);
    }
}
