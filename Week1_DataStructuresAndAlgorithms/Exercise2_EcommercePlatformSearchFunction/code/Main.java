package Week1_DataStructuresAndAlgorithms.Exercise2_EcommercePlatformSearchFunction.code;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(3, "Keyboard", "Electronics"),
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Mouse", "Electronics"),
                new Product(5, "T-Shirt", "Apparel"),
                new Product(4, "Shoes", "Footwear")
        };

        int targetId = 5;

        int linearIndex = LinearSearch.linearSearch(products, targetId);
        if (linearIndex != -1) {
            System.out.println("Linear Search: Found " + products[linearIndex].productName);
        } else {
            System.out.println("Linear Search: Product not found.");
        }

        BinarySearch.sortProducts(products);
        int binaryIndex = BinarySearch.binarySearch(products, targetId);
        if (binaryIndex != -1) {
            System.out.println("Binary Search: Found " + products[binaryIndex].productName);
        } else {
            System.out.println("Binary Search: Product not found.");
        }
    }
}
