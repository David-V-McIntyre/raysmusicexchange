import behaviours.IPlay;
import behaviours.ISell;

public class Saxophone extends Instrument implements IPlay {

    private int noOfValves;

    public Saxophone(String model, String type, double priceBought, double priceSold, int noOfValves){
        super(model, type, priceBought, priceSold);
        this.noOfValves = noOfValves;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    @Override
    public String canPlay(String _string) {
        String song = _string;
        return "Saxophone is playing " + song;
    }

    @Override
    public double calculateMarkup() {
        double markup = priceSold - priceBought;
        return markup;
    }
}
