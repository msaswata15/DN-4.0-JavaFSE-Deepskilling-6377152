package Week_1_Design_Principle_Pattern.Exercise_2_Factory.Code;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}