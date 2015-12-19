package Module3_1;



import java.util.ArrayList;
import java.util.List;

public class Shop {


    private List<Instrument> instruments = new ArrayList<Instrument>();

    public Shop(List<Instrument> instruments) {
        this.instruments = instruments;

    }

    @Override
    public String toString() {
        String output = "Music Shop has following offers 4 u:\n";
        for (Instrument instrument : instruments) {
            output = output + instrument.getType() + "\n";

        }

        return output;
    }
}


