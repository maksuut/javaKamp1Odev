public class Main {
    public static void main(String[] args) {

        //for
        for(int i=1;i<10;i+=2) {
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti");


        //while
        int i=2;
        while (i<10){
            System.out.println(i);
            i+=2;

        }

        System.out.println("While Döngüsü Bitti");

        //do-while
        int j=120;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti");
        //do-while'da şartı sağlamasa bile bir kez çalışır.
    }
}