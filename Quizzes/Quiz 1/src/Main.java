
public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 74;
        numbers[1] = 23;
        numbers[2] = 3;
        numbers[3] = 55;
        numbers[4] = 32;
        numbers[5] = 13;
        numbers[6] = 78;
        numbers[7] = 24;
        numbers[8] = -5;
        numbers[9] = 88;

        System.out.println("Before bubble sort:");
        printArrayElements(numbers);

        bubbleSort(numbers);

        System.out.println("\n\nAfter bubble sort:");
        printArrayElements(numbers);

        selectionSort(numbers);
        //I was losing my mind then I realized I didn't call it here

        System.out.println("\n\nAfter selection sort:");
        printArrayElements(numbers);
        System.out.println("\n\nNow its flipped!");
    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int smallestIndex = i;

            for(int a = i + 1; a < arr.length; a++)
            {
                if (arr[a] < arr[smallestIndex])
                {
                    smallestIndex = a;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;

        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.println(j);
        }
    }
}