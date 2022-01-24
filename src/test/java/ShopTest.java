import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest  {
    Shop shop1;
    ArrayList<ISell> stock;
    DrumSticks drumSticks1;
    Guitar guitar1;
    Piano piano1;

    @Before
    public void before() {
        shop1 = new Shop(stock);
        drumSticks1 = new DrumSticks("DrumstickStyle", 10, 5);
        piano1 = new Piano("Yamaha","Electric",300,500,47);
        guitar1 = new Guitar("Stratocaster","Acoustic",200,450,6);
    }

    @Test
    public void canGetStockSize(){
        assertEquals(0, shop1.getStockSize(), 0.0);
    }

    @Test
    public void canAddStock(){
        assertEquals(0, shop1.getStockSize(), 0.0);
        shop1.addToStock(drumSticks1);
        shop1.addToStock(piano1);
        shop1.addToStock(guitar1);
        assertEquals(3, shop1.getStockSize(), 0.0);
    }

    @Test
    public void canRemoveStock(){
        assertEquals(0, shop1.getStockSize(), 0.0);
        shop1.addToStock(drumSticks1);
        shop1.addToStock(piano1);
        shop1.addToStock(guitar1);
        assertEquals(3, shop1.getStockSize(), 0.0);
        shop1.removeFromStock(drumSticks1);
        shop1.removeFromStock(piano1);
        assertEquals(1, shop1.getStockSize(), 0.0);
    }
}
