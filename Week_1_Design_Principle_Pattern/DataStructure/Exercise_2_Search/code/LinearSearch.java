package Week_1_Design_Principle_Pattern.DataStructure.Exercise_2_Search.code;

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
