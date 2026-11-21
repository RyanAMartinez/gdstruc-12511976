import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = { 5, 35, 25, 55, 503, 204, 207, 2, 27, 822 };
        // Sorted order { 2, 5, 25, 27, 35, 55, 204, 207, 503, 822 }

        System.out.println("WELCOME TO 5's & 2's! WATCH IT FIND A NUMBER!\n");
        Arrays.sort(numbers);
        System.out.println("Numbers: " + Arrays.toString(numbers) + " \n");


        System.out.println(confirmSearch(numbers, 503));
        System.out.println(confirmSearch(numbers, 822));
        System.out.println(confirmSearch(numbers, 33));

        System.out.print("What number do you want to find?");
        int userValue = scanner.nextInt();

        int userIndex = confirmSearch(numbers, userValue);

        if (userIndex != -1)
        {
            System.out.println("Found " + userValue + " at index: " + userIndex);
        } else
        {
            System.out.println("Result: " + userIndex);
        }

        scanner.close();
    }

    public static int confirmSearch(int[] input, int value)
    {
        int number2 = confirmed(value, '2');
        int number5 = confirmed(value, '5');

        if (number2 == 0 && number5 == 0)
        {
            System.out.println("Number: " + value + " not found");
            return -1;
        }

        //Sort the proper numbers to begin binary search
        List<Integer> relevantNumbers = new ArrayList<>();

        // If the value has a 2, check how many, then check for a 5
        if (number2 > 0)
        {
            System.out.println("Number: " + value + " has " + number2 + " two(s) and " + number5 + " five(s)");
            for (int i = 0; i < input.length; i++)
            {
                if (confirmed(input[i], '2') == number2 && confirmed(input[i], '5') == number5) {
                    relevantNumbers.add(i);
                }
            }
        }
        else // If the value ONLY has a 5, check how many
        {
            System.out.println("Number: " + value + " only has " + number5 + " five(s)");
            for (int i = 0; i < input.length; i++)
            {
                if (confirmed(input[i], '2') == 0 && confirmed(input[i], '5') == number5) {
                    relevantNumbers.add(i);
                }
            }
        }

        int start = 0;
        int end = relevantNumbers.size() - 1;

        while (start <= end)
        {
            int middle = (start + end) / 2;
            int valueIndex = relevantNumbers.get(middle);

            if (input[valueIndex] == value)
            {
                return valueIndex;
            } else if (value < input[valueIndex])
            {
                end = middle - 1;
            } else if (value > input[valueIndex])
            {
                start = middle + 1;
            }
        }

        return -1;
    }

    //Counts how many times a number appears in a number
    private static int confirmed(int number, char value)
    {
        //Java is handy, I looked this up of course
        String numStr = String.valueOf(Math.abs(number));
        int count = 0;

        for (int i = 0; i < numStr.length(); i++)
        {
            if (numStr.charAt(i) == value)
            {
                count++;
            }
        }
        return count;
    }
}