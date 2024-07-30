package SortingCustomerOrders;


public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.00),
            new Order("O002", "Bob", 150.00),
            new Order("O003", "Charlie", 300.00),
            new Order("O004", "David", 100.00)
        };

        System.out.println("Orders before sorting:");
        for (Order order : orders) {
            System.out.println(order);
        }

     
        BubbleSort.bubbleSort(orders);
        System.out.println("\nOrders after Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        orders = new Order[] {
            new Order("O001", "Alice", 250.00),
            new Order("O002", "Bob", 150.00),
            new Order("O003", "Charlie", 300.00),
            new Order("O004", "David", 100.00)
        };

    
        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

