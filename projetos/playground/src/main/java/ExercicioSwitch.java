import java.util.Scanner;

public class ExercicioSwitch {

    public static void main(String[] args) {

        System.out.println("Informe a nota:");
        int classificacao = new Scanner(System.in).nextInt();


        switch (classificacao) {
            case 0:
                System.out.println("Uma bosta");
            case 1:
                System.out.println("mais ou menos");
                break;
            case 2:
                System.out.println("aprendendo");
                break;
            case 3:
                System.out.println("melhorou");
                break;
            case 4:
                System.out.println("de cair os butias!");
                break;

        }

    }
}