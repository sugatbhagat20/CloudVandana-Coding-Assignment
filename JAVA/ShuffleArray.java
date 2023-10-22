//A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. 
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        shuffleArray(array);

        System.out.print("Shuffled Array: ");
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        Random rand = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // gives a random number btn 0 and (i+1)
            //System.out.println(j);
            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
