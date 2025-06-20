package Week_1_Design_Principle_Pattern.DesignPrinciple.Exercise_2_Factory.Code;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document.");
    }
}