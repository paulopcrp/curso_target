import java.io.IOException;
import java.util.Scanner;

public class ImportadorCsv {

        public static void main(String[] args) throws IOException {
            Scanner ler = new Scanner(System.in);

            String curso = "Imersão Java";

            String[] partes = curso.split(" ");

            System.out.println(partes);


        }

    }