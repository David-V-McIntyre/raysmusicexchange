import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TrumpetTest {
    Trumpet trumpet1;

    @Before
    public void before(){
        trumpet1 = new Trumpet("TrumpetCompany","Brass",150,300,6);
    }

    @Test
    public void hasModel(){
        assertEquals("TrumpetCompany", trumpet1.getModel());
    }

    @Test
    public void hasType(){
        assertEquals("Brass", trumpet1.getType());
    }

    @Test
    public void hasPriceBought(){
        assertEquals(150, trumpet1.getPriceBought(),0.0);
    }

    @Test
    public void hasPriceSold(){
        assertEquals(300, trumpet1.getPriceSold(),0.0);
    }

    @Test
    public void hasNoOfKeys(){
        assertEquals(6, trumpet1.getNoOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("Trumpet is playing Copacabana", trumpet1.canPlay("Copacabana"));
    }

    @Test
    public void getCalculateMarkup(){
        assertEquals(150, trumpet1.calculateMarkup(), 0.0);
    }
}
