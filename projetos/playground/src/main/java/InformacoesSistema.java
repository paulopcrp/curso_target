public class InformacoesSistema {

    //atalho psvm
    public static void main(String[] ars) {

        //atalho sout
        System.out.println("Processadores Disponiveis: ");
        System.out.println(Runtime.getRuntime().availableProcessors());

        //printf ("template %s %d ", "variavel 1", "variavel 2" ....
        System.out.printf("Processadores disponiveis? %d \n", Runtime.getRuntime().availableProcessors());

        System.out.print("Memoria maxima utilizada pela JVM(HEAP): ");
        System.out.printf(" %d MB \n", Runtime.getRuntime().totalMemory()/1024/1024);

        System.out.print("Memoria utilizada pela JVM(HEAP): ");
        System.out.printf(" %d MB \n", Runtime.getRuntime().maxMemory()/1024/1024);


    }
}
