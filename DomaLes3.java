import java.util.Random;

public class DomaLes3 {
    public static void main(String[] args) {
        int min = 5;
        int max = 155;
        int diff = max - min ;
        Random random =new Random () ;
        int f = random.nextInt(diff+1);
        f+=min ;
        if (f>25&&f<100) {
            System.out.println("Число " + f + " содержится в диапазоне от (25:100)") ;}
            else {
                System.out.println("Число "+ f +" не содержится в диапазоне от (25:100)" );

    }
}}
