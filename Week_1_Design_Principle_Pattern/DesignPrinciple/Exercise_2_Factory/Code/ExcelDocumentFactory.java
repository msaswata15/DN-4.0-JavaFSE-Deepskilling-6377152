package Week_1_Design_Principle_Pattern.DesignPrinciple.Exercise_2_Factory.Code;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}