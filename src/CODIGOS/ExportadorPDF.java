package CODIGOS;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ExportadorPDF {

    public static void exportarProcedimientos(
            List<JTextPane> panesSeleccionados,
            List<String> titulos,
            File destinoPDF
    ) throws IOException {
        if (panesSeleccionados.size() != titulos.size()) {
            throw new IllegalArgumentException("Los títulos deben coincidir con los JTextPane seleccionados.");
        }

        // Crear el escritor de PDF
        try (PdfWriter writer = new PdfWriter(destinoPDF); PdfDocument pdf = new PdfDocument(writer); Document document = new Document(pdf)) {

            // Cargar la fuente de negrita
            PdfFont boldFont = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);

            // Iterar sobre los JTextPanes y agregar los contenidos al PDF
            for (int i = 0; i < panesSeleccionados.size(); i++) {
                JTextPane pane = panesSeleccionados.get(i);
                String titulo = titulos.get(i);

                // Capturar imagen del JTextPane
                BufferedImage imagen = capturarImagen(pane);
                File imagenTemp = guardarImagen(imagen, "temp" + i + ".png");

                // Crear el título en negrita
                Text textoTitulo = new Text(titulo).setFont(boldFont).setFontSize(14);
                Paragraph parrafoTitulo = new Paragraph().add(textoTitulo);
                document.add(parrafoTitulo);

                // Agregar la imagen del JTextPane al PDF
                Image img = new Image(com.itextpdf.io.image.ImageDataFactory.create(imagenTemp.getAbsolutePath()));
                document.add(img);

                // Eliminar archivo temporal de la imagen
                imagenTemp.delete();
            }
        }
    }

    private static BufferedImage capturarImagen(JTextPane textPane) {
        Dimension size = textPane.getPreferredSize();
        if (size.width == 0 || size.height == 0) {
            size = textPane.getSize(); // Fallback si no hay preferred size
        }
        BufferedImage image = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = image.createGraphics();
        textPane.paint(g);
        g.dispose();
        return image;
    }

    private static File guardarImagen(BufferedImage img, String nombreArchivo) throws IOException {
        File archivo = new File(System.getProperty("java.io.tmpdir"), nombreArchivo);
        ImageIO.write(img, "png", archivo);
        return archivo;
    }
}
