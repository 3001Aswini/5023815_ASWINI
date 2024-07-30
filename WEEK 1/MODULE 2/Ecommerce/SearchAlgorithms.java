package Ecommerce;

import java.util.Arrays;

public class SearchAlgorithms {
    
    public static int linearSearch(Product[] products, String targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId().equals(targetId)) {
                return i; 
            }
        }
        return -1; 
    }
    
  
    public static int binarySearch(Product[] products, String targetId) {
        int left = 0;
        int right = products.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductId().compareTo(targetId);
            
            if (comparison == 0) {
                return mid; 
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}
