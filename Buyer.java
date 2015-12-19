package Module3_1;

//// AGGREGATION
import java.util.ArrayList;
import java.util.List;

public class Buyer {

public static void main(String[] args) {
 List<Instrument> instruments = new ArrayList<Instrument>();
 instruments.add(new Guitar());
 instruments.add(new Piano());
 instruments.add(new Prumpet());

 Shop shop = new Shop(instruments);
  System.out.print(shop);

 }
}


