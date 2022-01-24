import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SaxophoneTest {
    Saxophone saxophone1;

    @Before
    public void before(){
        saxophone1 = new Saxophone("SaxCompany","Brass",150,300,8);
    }

    @Test
    public void hasModel(){
        assertEquals("SaxCompany", saxophone1.getModel());
    }

    @Test
    public void hasType(){
        assertEquals("Brass", saxophone1.getType());
    }

    @Test
    public void hasPriceBought(){
        assertEquals(150, saxophone1.getPriceBought(),0.0);
    }

    @Test
    public void hasPriceSold(){
        assertEquals(300, saxophone1.getPriceSold(),0.0);
    }

    @Test
    public void hasNoOfKeys(){
        assertEquals(8, saxophone1.getNoOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("Saxophone is playing Copacabana", saxophone1.canPlay("Copacabana"));
    }

    @Test
    public void getCalculateMarkup(){
        assertEquals(150, saxophone1.calculateMarkup(), 0.0);
    }
}
