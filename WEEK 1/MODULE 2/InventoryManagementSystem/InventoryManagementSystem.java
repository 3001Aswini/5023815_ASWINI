
import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

 
    public void updateProduct(String productId, Product updatedProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, updatedProduct);
        } else {
            System.out.println("Product not found.");
        }
    }

    
    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found.");
        }
    }

    
    public void displayProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        
        ims.addProduct(new Product("P001", "Laptop", 10, 799.99));
        ims.addProduct(new Product("P002", "Smartphone", 25, 499.99));

      
        System.out.println("Current Inventory:");
        ims.displayProducts();

      
        ims.updateProduct("P001", new Product("P001", "Laptop", 8, 749.99));

        
        System.out.println("\nInventory After Update:");
        ims.displayProducts();

     
        ims.deleteProduct("P002");

        
        System.out.println("\nInventory After Deletion:");
        ims.displayProducts();
    }
}
