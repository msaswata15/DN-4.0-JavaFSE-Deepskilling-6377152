package Week_1_Design_Principle_Pattern.Code.Exercise_2_Factory;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document.");
    }
}
