package pdfwritter;

import candidato.Candidato;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class PdfWritter {
    public static void writePDF(Candidato candidato) {

        Document document = new Document();

        try {
            String path = new File("C:\\Users\\Jinbo Jonez\\Desktop\\PROYECTO FIRST COMMIT").getCanonicalPath();
            String FILE_NAME = path + "/CURRICULUM"+candidato.getCandidatoId()+".pdf";

            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
            Image imagen = Image.getInstance("kanj.jpg");

            document.open();

            imagen.scalePercent(20f);
            document.add(imagen);

            Paragraph nombre = new Paragraph();
            nombre.add("NOMBRE \n" + candidato.getNombre() + "\n");
            nombre.setAlignment(Element.ALIGN_JUSTIFIED);

            document.add(nombre);

            Paragraph detalles = new Paragraph();
            detalles.add("DETALLES DE CONTACTO \n" + candidato.getTelefono()+ "\n" + candidato.getEmail() +
                    "\n" + candidato.getCiudad() + "\n" + candidato.getPais());

            document.add(detalles);

            Paragraph experienciaYmovilidad = new Paragraph();
            String movilidad = "";
            String presencialidad = candidato.getPresencialidad().toString().toLowerCase(Locale.ROOT);
            String etiquetas = candidato.etiquetas.toString();
            if (candidato.isMovilidad())
                movilidad= "Sí";
            else movilidad = "No";


            experienciaYmovilidad.add("EXPERIENCIA \n" + etiquetas + "\n MOVILIDAD \n" + movilidad + "\n PRESENCIALIDAD \n" + presencialidad);

            document.add(experienciaYmovilidad);
            document.close();

        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
