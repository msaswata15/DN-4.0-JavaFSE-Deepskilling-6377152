package Week1_DataStructuresAndAlgorithms.Exercise2_EcommercePlatformSearchFunction.code;

public class LinearSearch {

    public static int linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) {
                return i;
            }
        }
        return -1;
    }

}
