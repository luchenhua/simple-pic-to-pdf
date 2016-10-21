import com.itextpdf.text.DocumentException;

import java.io.IOException;

public class SimpleTest {

    public static void main(String[] args) throws IOException, DocumentException {

        String dest = "src/main/resources/pdf/multiple_images.pdf";
        String[] images = {
                "http://a4.files.theultralinx.com/image/upload/c_fit,cs_srgb,w_620/MTQyMTEwNDY2NzI0OTMwNzI3.png",
                "http://a4.files.theultralinx.com/image/upload/c_fit,cs_srgb,dpr_1.0,q_80,w_620/MTQyMTEwNDY2NDU2ODg4NDg4.jpg"
        };

        ImgToPdf.createPdf(images, dest);
    }
}
