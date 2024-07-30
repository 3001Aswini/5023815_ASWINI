package ObserverPatternExample;

public class TestObserverPattern {
    public static void main(String[] args) {
       
        StockMarket stockMarket = new StockMarket("TechCorp");

        
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        
        stockMarket.setStockPrice(150.75);

        
        stockMarket.deregisterObserver(mobileApp);

        
        stockMarket.setStockPrice(155.00);
    }
}

