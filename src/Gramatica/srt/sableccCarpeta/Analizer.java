Package sableccCarperta
import sableccCarpeta.parser;
import sableccCarpeta.lexer;
import sableccCarpeta.node;
import sableccCarpeta.analaysis;
import java.io.*;

public class Analizer {

    public static void main(String[] args) {

        Scanner tcld = new Scanner(System.in);
        System.out.println("Ingrese ruta de los subtitulos(C:/ruta/a/buscar):");
        String ruta = tcld.next();
        System.out.println("Ingrese nombre del archivo:");
        String arch = tcld.next();

        Analizador.buscarArchivoSubRip(new File(ruta),arch);

    }
}