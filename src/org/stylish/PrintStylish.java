package org.stylish;

/**
 * This class helps to print the stylish text in format on the console
 */
public class PrintStylish {
    /**
     * a string representing a new line
     */
    private static final String NEW_LINE = "\n";
    /**
     * The delay time in milliseconds between printing lines
     */
    private static int delay = 250;


    /**
     * This takes a text and print the text with a delay timer
     *
     * @param text  the text to be printed
     * @param delay the delay time in milliseconds
     */
    public static void printWithDelay(String text, int delay) {
        PrintStylish.delay = delay;
        while (true) {
            int index = text.indexOf(NEW_LINE);
            if (index == -1) {
                printSingleLineWithDelay(text);
                break;
            }
            String currentText = text.substring(0, index);
            printSingleLineWithDelay(currentText);
            text = text.substring(index + 1);
        }
    }

    /**
     * This function takes input text and converts it to stylish format and prints it with delay
     *
     * @param text  the input text
     * @param delay the time by which print is delayed between lines
     */
    public static void generateAndPrint(String text, int delay) {
        PrintStylish.delay = delay;
        printWithDelay(StringGenerator.generate(text), delay);
    }

    /**
     * This function makes the current thread sleep for the delay time and then prints the given text
     *
     * @param text the text to be printed
     */
    private static void printSingleLineWithDelay(String text) {
        try {
            Thread.sleep(delay);
            System.out.println(text);
        } catch (Exception ignored) {

        }
    }

    /**
     * This function takes an input array of text and prints them with a delay
     *
     * @param array the input array
     * @param delay the timer delay in milliseconds
     */
    public static void printImageArray(String[] array, int delay) {
        for (String line : array) {
            if (line != null) {
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(line);
            }
        }
    }
}
