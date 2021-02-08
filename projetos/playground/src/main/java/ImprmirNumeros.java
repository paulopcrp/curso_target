public class ImprmirNumeros {

    public static void main(String[] args) {


        for (int count = 150; count <=300; count = count+1 ){
            System.out.println(count + " ");
        }

        int count = 150;
        while(count <=300){
            System.out.println(count + " ");

        }

        int countDoWhile = 150;
        do {
            System.out.println(countDoWhile + " ");
            countDoWhile = countDoWhile+1;
        }while (countDoWhile <= 300);
    }
}
