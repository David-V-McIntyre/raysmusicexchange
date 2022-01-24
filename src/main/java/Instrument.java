import behaviours.ISell;

public abstract class Instrument implements ISell {
    protected String model;
    protected String type;
    protected double priceBought;
    protected double priceSold;

    public Instrument(String model, String type, double priceBought, double priceSold){
        this.model = model;
        this.type = type;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getPriceSold() {
        return priceSold;
    }
}
