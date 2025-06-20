package Week1_Design_Principle_Pattern.DesignPrinciple.Exercise_2_Factory.Code;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel document.");
    }
}