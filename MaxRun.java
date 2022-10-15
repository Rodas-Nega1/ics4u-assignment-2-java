/*
* This program calculates the highest run in a string
*
* @author  Rodas Nega
* @version 1.0
* @since   2022-10-12
*/

import java.util.Scanner;

/**
* This program determines the run of a string.
*/
final class MaxRun {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private MaxRun() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The run() function.
    *
    * @param listArray the array of characters in user string
    * @return maxValue is the highest number of a specific character
    */
    public static int lengthRun(final String[] listArray) {
        // process
        final int arraySize = listArray.length;
        int maxValue = 0;
        int count = 0;
        // first loop compares the first value to the adjacent value
        for (int loopCounterOne = 0; loopCounterOne
                       < arraySize; loopCounterOne++) {
            // if count in the first loop is greater than max value,
            //   set count as the new max value
            //   then reset the count back to zero
            if (count > maxValue) {
                maxValue = count;
            }
            count = 0;
            // second loop compares only values that are itself and after
            for (int loopCounterTwo = loopCounterOne; loopCounterTwo
                          < arraySize; loopCounterTwo++) {
                // checks if the two loop indexes are the same
                //   thus increases the counter by 1
                if (listArray[loopCounterOne].equals(
                               listArray[loopCounterTwo])) {
                    count += 1;
                } else {
                    break;
                }
            }
        }
        return maxValue;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // input
        final Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your string: ");
        final String stringInput = userInput.nextLine();

        String[] listArray = new String[stringInput.length()];
        listArray = stringInput.split("");

        final int stringRun = lengthRun(listArray);

        System.out.println("The max run is: " + stringRun);

        System.out.println("\nDone.");
    }
}

