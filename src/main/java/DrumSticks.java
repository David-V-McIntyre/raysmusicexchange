import behaviours.ISell;

public class DrumSticks implements ISell {
    private String name;
    private double priceSold;
    private double priceBought;

    public DrumSticks(String name, double priceSold, double priceBought){
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
        return priceSold - priceBought;
    }
}
