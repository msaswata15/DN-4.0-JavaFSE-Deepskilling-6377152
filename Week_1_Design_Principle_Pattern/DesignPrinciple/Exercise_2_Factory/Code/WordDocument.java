package Week_1_Design_Principle_Pattern.DesignPrinciple.Exercise_2_Factory.Code;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document.");
    }
}
