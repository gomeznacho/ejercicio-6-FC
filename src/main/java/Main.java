import candidato.Candidato;
import candidato.Presencialidad;

import etiqueta.Etiqueta;
import pdfwritter.PdfWritter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato(1,"cand1", "Madrid", "España", "666666", "email@email.email", true, Presencialidad.REMOTO, 2,new ArrayList<Etiqueta>());
        Candidato candidato2 = new Candidato(2,"cand2", "Valencia","España",  "666777", "email2@email.email", false, Presencialidad.MIXTO, 1, new ArrayList<Etiqueta>());
        Candidato candidato3 = new Candidato(3,"cand3", "Madrid","España",  "666888", "email3@email.email", true, Presencialidad.REMOTO, 1, new ArrayList<Etiqueta>());
        Candidato candidato4 = new Candidato(4,"cand4", "Barcelona","España",  "666999", "email4@email.email", true, Presencialidad.REMOTO, 3, new ArrayList<Etiqueta>());

        Etiqueta etiqueta1 = new Etiqueta("java", 2);

        candidato1.etiquetas.add(etiqueta1);

        PdfWritter.writePDF(candidato1);

    }
}
