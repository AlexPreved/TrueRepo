import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        int size = 20;
        int[] randomMassive = new int[size];
        for (int i=0; i<size; i++) {
            int randomNumber = (int) (Math.random()*21-10);
            randomMassive[i] = randomNumber;
            System.out.println(" " + randomMassive[i]);
        }
        for (int i=0; i<size; i++) {
           


        }
    }
}
