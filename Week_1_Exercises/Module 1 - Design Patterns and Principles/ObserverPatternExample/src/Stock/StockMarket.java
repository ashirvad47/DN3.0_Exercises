package Stock;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers;
    private String stock;
    private double price;

    public StockMarket() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stock, double price) {
        this.stock = stock;
        this.price = price;
        for (Observer observer : observers) {
            observer.update(stock, price);
        }
    }

    public void setStockPrice(String stock, double price) {
        notifyObservers(stock, price);
    }
}