package Week1_DesignPrinciplesAndPattern.Exercise_2_ImplementingtheFactoryMethodPattern.Code;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel document.");
    }
}