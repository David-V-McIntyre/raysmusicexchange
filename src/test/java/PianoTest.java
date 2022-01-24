import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano1;

    @Before
    public void before(){
        piano1 = new Piano("Yamaha","Electric",300,500,47);
    }

    @Test
    public void hasModel(){
        assertEquals("Yamaha", piano1.getModel());
    }

    @Test
    public void hasType(){
        assertEquals("Electric", piano1.getType());
    }

    @Test
    public void hasPriceBought(){
        assertEquals(300, piano1.getPriceBought(),0.0);
    }

    @Test
    public void hasPriceSold(){
        assertEquals(500, piano1.getPriceSold(),0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("Piano is playing Copacabana", piano1.canPlay("Copacabana"));
    }


    @Test
    public void getCalculateMarkup(){
        assertEquals(200, piano1.calculateMarkup(), 0.0);
    }
}
