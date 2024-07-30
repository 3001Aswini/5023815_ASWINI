package Ecommerce;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P004", "Refrigerator", "Home Appliances"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Washing Machine", "Home Appliances"),
            new Product("P001", "Laptop", "Electronics")
        };
        
   
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));
        
        String searchId = "P003";
        
       
        int linearResult = SearchAlgorithms.linearSearch(products, searchId);
        System.out.println("Linear Search Result: " + (linearResult != -1 ? products[linearResult] : "Not found"));
        
        
        int binaryResult = SearchAlgorithms.binarySearch(products, searchId);
        System.out.println("Binary Search Result: " + (binaryResult != -1 ? products[binaryResult] : "Not found"));
    }
}
