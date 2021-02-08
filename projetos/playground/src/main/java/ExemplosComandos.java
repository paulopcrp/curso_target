
import java.awt.*;
import java.util.Scanner;

public class ExemplosComandos {

    public static void main(String[] args) {
       /* //if else - par ou ímpar

        System.out.println("Informe um número");
        int numero = new Scanner(System.in).nextInt();

        boolean isPar = (numero %2 ==0);

        if(isPar){
            System.out.println("Numero é par:");
        }else{
            System.out.println("Número é impar:");
        }

        */

        byte DDD = 51;

        switch (DDD) {
            case 51:
                System.out.println("Região Metropolitana de Porto Alegre");
                break;
            case 53:
                System.out.println("Pelotas e região");
                break;
            case 54:
                System.out.println("Caxias do Sul e região");
                break;
            case 55:
                System.out.println("Santa Maria e região");
                break;
            default:
                System.out.println("Região desconhecida");

        }
    }
}
