package Stock;

public class WebApp implements Observer {
    @Override
    public void update(String stock, double price) {
        System.out.println("Web App: Stock " + stock + " price updated to " + price);
    }
}