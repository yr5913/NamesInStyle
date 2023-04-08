package org.stylish;

/**
 * The class that generates the text in style
 */
public class StringGenerator {

    /**
     * The starting alphabet
     */
    private static final char INITIAL_CAPITAL_LETTER = 'A';

    /**
     * The starting number
     */
    private static final char INITIAL_NUMBER = '0';


    /**
     * The line indentation from the left
     */
    private static int INDENT = 0;

    /**
     * The starting number
     */
    private static final char TOTAL_NUMBER_OF_ALPHABETS = 26;

    /**
     * The single space character
     */
    private static final char SINGLE_SPACE = ' ';


    /**
     * The single tab
     */
    private static final String TAB = "    ";
    /**
     * The new line comes in two forms, this represents the new line that is in from \r\n
     */
    private static final String NEW_LINE_ONE = "\r\n";
    /**
     * The new line comes in two forms, this represents the new line that is in from \n
     */
    private static final String NEW_LINE_TWO = "\n";
    /**
     * The font used is a video game font, which lacks on uniformity such as a 5*5 pixel matrix is used for letter A
     * whereas a 6 * 5 pixel matrix is used for letter Y in this font.
     * To overcome this when this flag is set true, this converts all the letters' pixel matrix into 6 * 5 and gives a
     * uniform look
     */
    private static boolean UNIFORM_FLAG = false;

    /**
     * If the text wants to be justified, set this to true, by default it is set to false
     */
    private static boolean JUSTIFY = false;

    /**
     * This function takes a text and returns the text in style
     * currently this function supports the strings that contain english alphabets(A to Z, a to Z) and numbers(0 to 9) only
     *
     * @param text the input string
     * @return the stylish string
     */
    public static String generate(String text) {
        text = text.replaceAll("\\n", "\n");
        text = NEW_LINE_TWO + text;
        String[] textArray = convertToArray(text);
        if (JUSTIFY)
            justifyTheString(textArray);
        StringBuilder stringBuilder = new StringBuilder();
        for (String line : textArray) {
            line = addIndent(line);
            stringBuilder.append(generateSingleLine(line.toUpperCase()));
            stringBuilder.append(NEW_LINE_ONE + NEW_LINE_ONE);
        }
        return stringBuilder.toString();
    }

    /**
     * This function adds the left indent spaces to make the text print at the center of console
     *
     * @param line the line for which indentation is added
     * @return the line after adding indentation
     */
    private static String addIndent(String line) {
        return String.valueOf(SINGLE_SPACE).repeat(Math.max(0, INDENT)) +
                line;
    }

    /**
     * This function takes a string and splits the text at new line
     *
     * @param text the input text
     * @return the array that has strings split at new line
     */
    private static String[] convertToArray(String text) {
        if (text.contains(NEW_LINE_ONE)) {
            return text.split(NEW_LINE_ONE);
        }
        return text.split(NEW_LINE_TWO);
    }

    /**
     * This function justifies string by adding required spaces front of them
     * It works as similar to justify in the Word document
     *
     * @param text the array containing input text
     */
    private static void justifyTheString(String[] text) {
        int maxLength = 0;
        for (String line : text) {
            maxLength = Math.max(line.length(), maxLength);
        }
        for (int i = 0; i < text.length; i++) {
            String sb = String.valueOf(SINGLE_SPACE).repeat(Math.max(0, (maxLength - text[i].length() + 1) / 2 + 3)) +
                    text[i];
            text[i] = sb;
        }
    }

    /**
     * This function converts a single line text to a pretty format
     *
     * @param text the input text
     * @return the converted stylish text
     */
    private static String generateSingleLine(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < FontProvider.LETTER_MATRIX[0].length; i++) {
            stringBuilder.append(formSingleLine(text, i));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    /**
     * This function gets a single line of a stylish text
     *
     * @param text    the input text
     * @param lineNum current ine number
     * @return the string in stylish format
     */
    private static String formSingleLine(String text, int lineNum) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current == SINGLE_SPACE) {
                stringBuilder.append(TAB + TAB);
                continue;
            }
            int matrixIndex = (current - (current < INITIAL_CAPITAL_LETTER ? (INITIAL_NUMBER - TOTAL_NUMBER_OF_ALPHABETS) : INITIAL_CAPITAL_LETTER));
            boolean[][] matrix = FontProvider.LETTER_MATRIX[matrixIndex];
            for (int j = 0; j < matrix[lineNum].length; j++) {
                if (matrix[lineNum][j])
                    stringBuilder.append(current);
                else
                    stringBuilder.append(SINGLE_SPACE);
                stringBuilder.append(SINGLE_SPACE);
            }
            stringBuilder.append(TAB);
        }
        return stringBuilder.toString();
    }

    /**
     * This function sets the uniform flag
     * if set to true all letters will have similar width
     *
     * @param flag the flag
     */
    public static void setUniformFlag(boolean flag) {
        if (UNIFORM_FLAG == flag)
            return;
        UNIFORM_FLAG = flag;
        for (int i = 0; i < FontProvider.LETTER_MATRIX.length; i++) {
            boolean[][] matrix = FontProvider.LETTER_MATRIX[i];
            if (!isLengthFive(matrix))
                moveMatrix(matrix);
        }
    }

    /**
     * This function sets to justify flag
     *
     * @param flag the flag
     */
    public static void setJustifyFlag(boolean flag) {
        JUSTIFY = flag;
    }

    /**
     * This function returns if the length of stylish matrix is 5 or not
     *
     * @param letterMatrix the input letter matrix
     * @return true if the length of stylish matrix is 5
     */
    private static boolean isLengthFive(boolean[][] letterMatrix) {
        for (boolean[] matrix : letterMatrix) {
            if (matrix[matrix.length - 1])
                return true;
        }
        return false;
    }

    /**
     * This function sets the indent length
     *
     * @param indent the length of the indent
     */
    public static void setIndent(int indent) {
        INDENT = indent;
    }

    /**
     * This function changes the matrix
     *
     * @param letterMatrix the input matrix containing the stylish schema
     */
    private static void moveMatrix(boolean[][] letterMatrix) {
        for (boolean[] matrix : letterMatrix) {
            if (matrix.length - 1 - 1 >= 0)
                System.arraycopy(matrix, 1, matrix, 2, matrix.length - 2);
        }
    }
}
