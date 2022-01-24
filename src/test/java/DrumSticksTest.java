import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {
    DrumSticks drumSticks1;

    @Before
    public void before() {
        drumSticks1 = new DrumSticks("DrumstickStyle", 10, 5);
    }

    @Test
    public void getName(){
        assertEquals("DrumstickStyle", drumSticks1.getName());
    }













    @Test
    public void getPriceSold(){
        assertEquals(10, drumSticks1.getPriceSold(), 0.0);
    }

    @Test
    public void getPriceBought(){
        assertEquals(5, drumSticks1.getPriceBought(), 0.0);
    }

    @Test
    public void getCalculateMarkup(){
        assertEquals(5, drumSticks1.calculateMarkup(), 0.0);
    }
}
