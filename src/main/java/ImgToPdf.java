import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class ImgToPdf {

    public static final String[] IMAGES = {
            "resources/images/berlin2013.jpg",
            "resources/images/javaone2013.jpg",
            "resources/images/map_cic.png"
    };

    public void createPdf(String dest) throws IOException, DocumentException {

        Image img = Image.getInstance(IMAGES[0]);
        Document document = new Document(img);
        PdfWriter.getInstance(document, new FileOutputStream(dest));

        document.open();

        for (String image : IMAGES) {
            img = Image.getInstance(image);
            document.setPageSize(img);
            document.newPage();
            img.setAbsolutePosition(0, 0);
            document.add(img);
        }

        document.close();
    }
}
