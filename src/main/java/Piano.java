import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private int noOfKeys;

    public Piano(String model, String type, double priceBought, double priceSold, int noOfKeys){
        super(model, type, priceBought, priceSold);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }
    @Override
    public String canPlay(String _string) {
        String song = _string;
        return "Piano is playing " + song;
    }

    @Override
    public double calculateMarkup() {
        double markup = priceSold - priceBought;
        return markup;
    }
}
