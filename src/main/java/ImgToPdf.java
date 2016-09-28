import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class ImgToPdf {

    public void createPdf(String[] source, String dest) throws IOException, DocumentException {

        Image img = Image.getInstance(source[0]);
        Document document = new Document(img);
        PdfWriter.getInstance(document, new FileOutputStream(dest));

        document.open();

        for (String image : source) {
            img = Image.getInstance(image);
            document.setPageSize(img);
            document.newPage();
            img.setAbsolutePosition(0, 0);
            document.add(img);
        }

        document.close();
    }
}
