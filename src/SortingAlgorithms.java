import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {

    public int[] intArray;

    public SortingAlgorithms(int arraySize) {
        intArray = fillArray(arraySize);
    }

    public int[] fillArray (int arraySize) {
        Random rand = new Random();
        int[] arrayToReturn = new int[arraySize];
        for(int i = 0; i< arraySize; i++) {
            arrayToReturn[i] = rand.nextInt(1000);
        }
        return arrayToReturn;
    }

    public void insertionSort(){
        int temp = 0;
        for (int currentIndex = 0; currentIndex < intArray.length; currentIndex++) {
            if (currentIndex == 0) continue;

            if (intArray[currentIndex-1] > intArray[currentIndex]) {
                temp = intArray[currentIndex];

                for(int prevIndex = currentIndex-1; prevIndex >= 0; prevIndex--) {

                    if (temp > intArray[prevIndex]) {
                        intArray[prevIndex+1] = temp;
                        break;
                    } else if (prevIndex == 0) {
                        intArray[prevIndex+1] = intArray[prevIndex];
                        intArray[prevIndex] = temp;
                    }
                    else {
                        intArray[prevIndex+1] = intArray[prevIndex];
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(intArray);
    }

    public static void main(String[] args) {
        SortingAlgorithms test = new SortingAlgorithms(4);
        //test.intArray = new int[]{626, 983, 810, 612};
        System.out.println(test);
        test.insertionSort();
        System.out.println(test);
    }
}
