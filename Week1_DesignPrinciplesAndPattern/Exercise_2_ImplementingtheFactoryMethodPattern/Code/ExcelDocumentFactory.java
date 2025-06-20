package Week1_DesignPrinciplesAndPattern.Exercise_2_ImplementingtheFactoryMethodPattern.Code;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}