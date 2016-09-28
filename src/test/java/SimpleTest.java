import com.itextpdf.text.DocumentException;

import java.io.File;
import java.io.IOException;

public class SimpleTest {

    public static final String DEST = "src/main/resources/pdf/multiple_images.pdf";

    public static final String[] IMAGES = {
            "src/main/resources/images/berlin2013.jpg",
            "src/main/resources/images/javaone2013.jpg"
    };

    public static void main(String[] args) throws IOException, DocumentException {

        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new ImgToPdf().createPdf(IMAGES, DEST);
    }
}
