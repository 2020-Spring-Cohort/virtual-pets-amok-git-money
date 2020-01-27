package virtual_pet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class OrganicTest {
    @Test
    public void shouldHaveOrganic(){

    }

    @Test
    public void walkShouldDecreaseCleanlinessByOne(){
        Organic underTest = new Organic("shi","purple");
        underTest.walk();
        underTest.tick();
        int result = underTest.getCleanliness();
        assertEquals(4,result);
    }


}
