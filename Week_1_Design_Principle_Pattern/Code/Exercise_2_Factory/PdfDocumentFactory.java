package Week_1_Design_Principle_Pattern.Code.Exercise_2_Factory;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}