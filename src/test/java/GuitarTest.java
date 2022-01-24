import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar1;

    @Before
    public void before(){
        guitar1 = new Guitar("Stratocaster","Acoustic",200,450,6);
    }

    @Test
    public void hasModel(){
        assertEquals("Stratocaster", guitar1.getModel());
    }

    @Test
    public void hasType(){
        assertEquals("Acoustic", guitar1.getType());
    }

    @Test
    public void hasPriceBought(){
        assertEquals(200, guitar1.getPriceBought(),0.0);
    }

    @Test
    public void hasPriceSold(){
        assertEquals(450, guitar1.getPriceSold(),0.0);
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(6, guitar1.getNoOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Guitar is playing Copacabana", guitar1.canPlay("Copacabana"));
    }

    @Test
    public void getCalculateMarkup(){
        assertEquals(250, guitar1.calculateMarkup(), 0.0);
    }
}
