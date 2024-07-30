package ProxyPatternExample;

public class TestProxyPattern {
    public static void main(String[] args) {
       
        Image image1 = new ProxyImage("image1.jpg");

        
        image1.display();
        
        
        image1.display();
        
        
        Image image2 = new ProxyImage("image2.jpg");

        
        image2.display();
    }
}
