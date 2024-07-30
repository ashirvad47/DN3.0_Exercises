package Stock;

public class MobileApp implements Observer {
    @Override
    public void update(String stock, double price) {
        System.out.println("Mobile App: Stock " + stock + " price updated to " + price);
    }
}