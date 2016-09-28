import com.itextpdf.text.DocumentException;

import java.io.File;
import java.io.IOException;

public class SimpleTest {

    public static final String DEST = "results/images/multiple_images.pdf";

    public static void main(String[] args) throws IOException, DocumentException {

        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new ImgToPdf().createPdf(DEST);
    }
}
