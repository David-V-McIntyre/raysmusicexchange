import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int noOfStrings;

    public Guitar(String model, String type, double priceBought, double priceSold, int noOfStrings){
        super(model, type, priceBought, priceSold);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    @Override
    public String canPlay(String _string) {
        String song = _string;
        return "Guitar is playing " + song;
    }

    @Override
    public double calculateMarkup() {
        double markup = priceSold - priceBought;
        return markup;
    }
}
