package Week1_DesignPrinciplesAndPattern.Exercise_2_ImplementingtheFactoryMethodPattern.Code;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}