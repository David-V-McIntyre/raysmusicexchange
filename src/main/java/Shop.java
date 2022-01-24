import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock){
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }


    public int getStockSize() {
        return stock.size();
    }

    public void addToStock(ISell _item) {
      stock.add(_item);
    }

    public void removeFromStock(ISell _item) {
        stock.remove(_item);
    }
}
