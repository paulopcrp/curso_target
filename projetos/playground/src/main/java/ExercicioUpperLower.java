import java.util.Locale;

public class ExercicioUpperLower {

    public static void main(String[] args) {
/*
        String entrada = "Pimenta nos Olhos dos Outros é Refresco";

        String transformada = entrada.substring(0, 8).toUpperCase();

        System.out.println(transformada);
   */

        String entrada = "Pimenta nos Olhos dos Outros é Refresco";
        String[] palavras = entrada.split("");

        boolean ehAPrimeira = true;

        for (String palavra : palavras) {
            if(ehAPrimeira) {
                System.out.print(palavra.toUpperCase() + "");
                ehAPrimeira = false;
                continue;
            }

            System.out.print(palavra.toLowerCase() + "");
        }
    }
}
