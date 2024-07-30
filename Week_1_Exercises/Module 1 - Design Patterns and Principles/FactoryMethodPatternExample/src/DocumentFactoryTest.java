
public class DocumentFactoryTest {
    public static void main(String[] args) {
        // Create a Word document using the WordDocumentFactory
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.create();

        // Create a PDF document using the PdfDocumentFactory
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.create();

        // Create an Excel document using the ExcelDocumentFactory
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDocument = excelFactory.createDocument();
        excelDocument.create();
    }
}