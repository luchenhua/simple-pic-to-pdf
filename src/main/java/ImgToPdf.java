import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImgToPdf {

    public void createPdf(String[] source, String dest) throws IOException, DocumentException {

        File file = new File(dest);
        file.getParentFile().mkdirs();

        Image img = Image.getInstance(source[0]);
        Document document = new Document(img);
        PdfWriter.getInstance(document, new FileOutputStream(dest));

        document.open();

        for (String image : source) {
            img = Image.getInstance(image);
            document.setPageSize(PageSize.A4);
            document.newPage();
            img.setAlignment(Element.ALIGN_CENTER);
            img.scalePercent(100f);
            document.add(img);
        }

        document.close();
    }
}
