import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class ImgToPdf {

    private ImgToPdf() {
    }

    public static void createPdf(final String[] source, final String dest) throws IOException, DocumentException {

        final File file = new File(dest);
        if (file.getParentFile().mkdirs() || source.length == 0) {
            return;
        }

        Image img = Image.getInstance(source[0]);
        final Document document = new Document(img);
        PdfWriter.getInstance(document, new FileOutputStream(dest));

        document.open();

        for (final String image : source) {
            img = Image.getInstance(image);
            document.setPageSize(PageSize.A4);
            document.newPage();
            img.setAlignment(Element.ALIGN_CENTER);
            img.scaleToFit(PageSize.A4);
            document.add(img);
        }

        document.close();
    }
}
