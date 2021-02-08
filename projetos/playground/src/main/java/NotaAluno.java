import java.util.Scanner;

public class NotaAluno {

    public static void main(String[] args) {

        System.out.println("Informe a nota do aluno:");
        int notaAluno = new Scanner(System.in).nextInt();

        if(notaAluno >=7){
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Bailou na curva!");
        }
    }
}
