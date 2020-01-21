package virtual_pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {

    @Test
    public void shouldHaveAVirtualPetShelter(){
        VirtualPetShelter underTest= new VirtualPetShelter();
    }
    @Test
    public void shouldHaveAListOfPet(){

        int result = VirtualPetShelter.petList.size();
        assertEquals(0,result);
    }
    @Test
    public void ShouldBeAbleToAddAPet(){
        VirtualPetShelter underTest= new VirtualPetShelter();
        underTest.addANewPet();
        Boolean result = underTest.petList.containsKey("steve");
        assertEquals(true,result);

    }
//    @Test
//    public void shouldDisplayAllThePets(){
//        VirtualPetShelter underTest= new VirtualPetShelter();;
//        assertEquals("bob",result);
//    }

}
