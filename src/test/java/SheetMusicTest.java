import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetmusic1;

    @Before
    public void before() {
        sheetmusic1 = new SheetMusic("Sound of Music", 20, 10);
    }

    @Test
    public void getName(){
        assertEquals("Sound of Music", sheetmusic1.getName());
    }

    @Test
    public void getPriceSold(){
        assertEquals(20, sheetmusic1.getPriceSold(), 0.0);
    }

    @Test
    public void getPriceBought(){
        assertEquals(10, sheetmusic1.getPriceBought(), 0.0);
    }

    @Test
    public void getCalculateMarkup(){
        assertEquals(10, sheetmusic1.calculateMarkup(), 0.0);
    }
}
