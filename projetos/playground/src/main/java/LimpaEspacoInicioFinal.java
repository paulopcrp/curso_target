import java.util.Scanner;

public class LimpaEspacoInicioFinal {

    public static void main(String[] args) {
        System.out.println("Informe teu email!");
        String email = new Scanner(System.in).nextLine();
        String emailSemEspacos = email.trim();

        if(emailSemEspacos.isBlank()){
            System.out.println("'E necessario informar teu email");
        }

        if(email.trim().equalsIgnoreCase("paulo.pcrp@gmail.com")){
            System.out.printf("Bem vindo %s", email);
        } else {
            System.out.println("'E necessário informar teu email!");
        }

        System.out.printf("Seu email é %s", email);
    }
}
