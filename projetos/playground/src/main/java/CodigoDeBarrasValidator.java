
public class CodigoDeBarrasValidator {

    public static void main(String[] args) {

   /*     int[] CodigoDeBarrasValidador = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,0,6};

        int soma = 0;
        for int i = 0; i<[20]; i++;{
            soma+= CodigoDeBarrasValidador[i];
        }
        //System.out.println("" + CodigoDeBarrasValidador[0] + CodigoDeBarrasValidador[1]);

        int soma = 0;
        
        System.out.println("Valores: " + soma/10 + soma%10);*/

        int[] CodigoDeBarrasValidador = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,0,6};;
        int i;
        int soma = 0;
        int tamanho = 20;

        //entrada dos valores randomicos
        CodigoDeBarrasValidador = new int[tamanho];
        for (i = 0; i < tamanho; i++) {
            CodigoDeBarrasValidador[i] = (int) (1 + Math.random() * 10);
        }

        //calculo da soma
        for (i = 0; i < tamanho; i++) {
            soma = soma + CodigoDeBarrasValidador[i];
        }

        //saida de dados
        for (i = 0; i < tamanho; i++) {
            System.out.println("A[" + (i+1) + "] = " + CodigoDeBarrasValidador[i]);
        }

        System.out.println("Soma: " + soma);
    }
}
