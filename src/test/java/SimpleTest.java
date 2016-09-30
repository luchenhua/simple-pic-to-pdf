import com.itextpdf.text.DocumentException;

import java.io.IOException;

public class SimpleTest {

    public static void main(String[] args) throws IOException, DocumentException {

        String dest = "src/main/resources/pdf/multiple_images.pdf";
        String[] images = {
                "src/main/resources/images/berlin2013.jpg",
                "src/main/resources/images/javaone2013.jpg"
        };

        ImgToPdf.createPdf(images, dest);
    }
}
