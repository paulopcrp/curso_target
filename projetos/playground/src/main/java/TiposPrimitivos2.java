import java.util.Calendar;
import java.util.GregorianCalendar;

public class TiposPrimitivos2 {

    public static void main(String[] args) {

        byte idade = 33;
        System.out.printf("Idade: %d\n", idade);

        short anoAtual = 2021;
        System.out.printf("Ano Atual: %d\n", anoAtual);

        boolean estaChovendo = false;
        System.out.println("Está chovendo?: "+ estaChovendo);

        float pi = 3.141592653589793F;// usem F para indicar que é FLOAT
        System.out.printf("Valor de PI : %.15f\n", pi);

        float piComCast = (float) 3.141592653589793;
        System.out.printf("Valor de PI (com cast) : %.15f \n", piComCast);

        double piDouble = 3.141592653589793D;// D deixa claro que é Double
        System.out.printf("Valor de PI (double) : %.15f \n", piDouble);

        char primeiraLetraNome = 'G';
        System.out.printf("Primeira letra : %s \n", primeiraLetraNome);

        float precoDolarHoje = 5.36F;
        System.out.printf("Preço dólar : %.2f \n", precoDolarHoje);

        int populacaoBrasil = 209_000_000;// Pode usar alternativamente _ (underline) com separador de decimal
        System.out.printf("População Brasil : %d \n", populacaoBrasil);

        long populacaoMundial = 7_700_000_000L; //Usem L para deixar claro que é um Long
        System.out.printf("População Mundial : %d \n", populacaoMundial);

        //Quantidade de vendas de um dia de uma pequena empresa (1023)
        int quantidadeVendas = 1023;

        //Situação de um boleto (pago/não pago)
        boolean situacaoBoleto = true;

        //Tipo de pagamento (Crédito, Débito)
        char tipoPagamento = 'C'; //C = credito D = débito

        //Dados binários, por exemplo, um documento CNPJ
        char[] conteudoArquivoPdf; //= new chaar[]{0 , '2', '3'};

        //Valor de um produto, considerando itens de uma farmácia
        float valorProdutoFarmacia = 1500.00F; //F = float

        //Código de barras de um Produto
        long codigoDeBarras = 466545456456456465L;


    }
}