import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        int size = 20;
        int[] randomMassive = new int[size];
        for (int i=0; i<randomMassive.length; i++) {
            int randomNumber = (int) (Math.random()*21-10);
            randomMassive[i] = randomNumber;
            System.out.println(" " + randomMassive[i]);
        }
        int i, f;
        int minmax = 10;
        int maxmin = -10;
        for (i=0; i<randomMassive.length; i++) {
           if ((randomMassive[i]>0) && (randomMassive[i]<minmax))  minmax = randomMassive[i];
        }
        for (f=0; f<randomMassive.length; f++) {
            if ((randomMassive[f]<0) && (randomMassive[f]>maxmin))  maxmin = randomMassive[f];
        }
        System.out.println("your minmax = " + minmax);
        System.out.println("your maxmin = " + maxmin);

        System.out.println("Теперь меняем местами минимальное положительное и максимальное отрицательное значения в массиве");
        randomMassive[i] = randomMassive[i] + randomMassive[f];
        randomMassive[f] = randomMassive[i] - randomMassive[f];
        randomMassive[i] = randomMassive[i] - randomMassive[f];

        System.out.println("your minmax = " + minmax);
        System.out.println("your maxmin = " + maxmin);

    }
}
