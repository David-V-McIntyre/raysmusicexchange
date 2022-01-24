import behaviours.ISell;

public class SheetMusic implements ISell {
    private String name;
    private double priceSold;
    private double priceBought;

    public SheetMusic(String name, double priceSold, double priceBought){
        this.name = name;
        this.priceSold = priceSold;
        this.priceBought = priceBought;
    }

    public String getName() {
        return name;
    }

    public double getPriceSold() {
        return priceSold;
    }

    public double getPriceBought() {
        return priceBought;
    }

    @Override
    public double calculateMarkup() {
        double markup = priceSold - priceBought;
        return markup;
    }
}
