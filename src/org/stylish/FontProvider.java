package org.stylish;

/**
 * The FontProvider class that provides with a boolean matrix that resembles the actual stylish letters
 **/
public class FontProvider {

    /**
     * The matrix that contains the stylish layout of each letter in alphabet in boolean form
     * This matrix holds capital alphabets in stylish format from A to Z
     * each alphabet is represented by a 6 * 5 matrix in stylish form
     * and there are 26 alphabets that resulted in a matrix of size 26 * 6 * 5
     * The matrix contains stylish representation of A at index 0, B at index 1 etc.. and Z at index 25.
     */
    public static final boolean[][][] LETTER_MATRIX = new boolean[36][6][5];


    static {
        fillMatrix();
    }

    /**
     * This method is called at application start when the class is loaded
     * This method fills all the alphabets stylish form matrices
     */
    public static void fillMatrix() {
        boolean[][] aMatrix = {
                {false, true, true, false, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, true, true, true, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
        };
        boolean[][] bMatrix = {
                {true, true, true, false, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, true, true, false, false}
                , {true, false, false, true, false}
                , {true, true, true, true, false}
        };
        boolean[][] cMatrix = {
                {false, true, true, true, false}
                , {true, false, false, false, false}
                , {true, false, false, false, false}
                , {true, false, false, false, false}
                , {true, false, false, false, false}
                , {false, true, true, true, false}
        };
        boolean[][] dMatrix = {
                {true, true, true, false, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, true, true, false, false}
        };
        boolean[][] eMatrix = {
                {true, true, true, true, false}
                , {true, false, false, false, false}
                , {true, false, false, false, false}
                , {true, true, true, false, false}
                , {true, false, false, false, false}
                , {true, true, true, true, false}
        };
        boolean[][] fMatrix = {
                {true, true, true, true, false}
                , {true, false, false, false, false}
                , {true, false, false, false, false}
                , {true, true, true, false, false}
                , {true, false, false, false, false}
                , {true, false, false, false, false}
        };
        boolean[][] gMatrix = {
                {false, true, true, false, false}
                , {true, false, false, true, false}
                , {true, false, false, false, false}
                , {true, false, true, true, false}
                , {true, false, false, true, false}
                , {false, true, true, false, false}
        };
        boolean[][] hMatrix = {
                {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, true, true, true, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
        };
        boolean[][] iMatrix = {
                {true, true, true, true, true}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
                , {true, true, true, true, true}
        };
        boolean[][] jMatrix = {
                {false, true, true, true, false}
                , {false, false, false, true, false}
                , {false, false, false, true, false}
                , {false, false, false, true, false}
                , {true, false, false, true, false}
                , {false, true, true, false, false}
        };
        boolean[][] kMatrix = {
                {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, false, true, false, false}
                , {true, true, false, false, false}
                , {true, false, true, false, false}
                , {true, false, false, true, false}
        };
        boolean[][] lMatrix = {
                {true, false, false, false, false}
                , {true, false, false, false, false}
                , {true, false, false, false, false}
                , {true, false, false, false, false}
                , {true, false, false, false, false}
                , {true, true, true, true, false}
        };
        boolean[][] mMatrix = {
                {true, true, false, true, true}
                , {true, false, true, false, true}
                , {true, false, false, false, true}
                , {true, false, false, false, true}
                , {true, false, false, false, true}
                , {true, false, false, false, true}
        };
        boolean[][] nMatrix = {
                {true, false, false, false, true}
                , {true, false, false, false, true}
                , {true, true, false, false, true}
                , {true, false, true, false, true}
                , {true, false, false, true, true}
                , {true, false, false, false, true}
        };
        boolean[][] oMatrix = {
                {false, true, true, false, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {false, true, true, false, false}
        };
        boolean[][] pMatrix = {
                {true, true, true, false, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, true, true, false, false}
                , {true, false, false, false, false}
                , {true, false, false, false, false}
        };
        boolean[][] qMatrix = {
                {false, true, true, false, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {false, true, true, false, false}
                , {false, false, false, true, false}
        };
        boolean[][] rMatrix = {
                {true, true, true, false, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, true, true, false, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
        };
        boolean[][] sMatrix = {
                {false, true, true, true, false}
                , {true, false, false, false, false}
                , {true, false, false, false, false}
                , {false, true, true, false, false}
                , {false, false, false, true, false}
                , {true, true, true, false, false}
        };
        boolean[][] tMatrix = {
                {true, true, true, true, true}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
        };
        boolean[][] uMatrix = {
                {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {false, true, true, false, false}
        };
        boolean[][] vMatrix = {
                {true, false, false, false, true}
                , {true, false, false, false, true}
                , {true, false, false, false, true}
                , {true, false, false, false, true}
                , {false, true, false, true, false}
                , {false, false, true, false, false}
        };
        boolean[][] wMatrix = {
                {true, false, false, false, true}
                , {true, false, false, false, true}
                , {true, false, false, false, true}
                , {true, false, false, false, true}
                , {true, false, true, false, true}
                , {true, true, false, true, true}
        };
        boolean[][] xMatrix = {
                {true, false, false, false, true}
                , {false, true, false, true, false}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
                , {false, true, false, true, false}
                , {true, false, false, false, true}
        };
        boolean[][] yMatrix = {
                {true, false, false, false, true}
                , {false, true, false, true, false}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
        };
        boolean[][] zMatrix = {
                {true, true, true, true, false}
                , {false, false, false, true, false}
                , {false, false, true, false, false}
                , {false, true, false, false, false}
                , {true, false, false, false, false}
                , {true, true, true, true, false}
        };
        boolean[][] zeroMatrix = {
                {false, true, true, false, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {true, false, false, true, false}
                , {false, true, true, false, false}
        };
        boolean[][] oneMatrix = {
                {false, true, true, false, false}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
                , {false, false, true, false, false}
        };
        boolean[][] twoMatrix = {
                {false, true, true, false, false}
                , {true, false, false, true, false}
                , {false, false, false, true, false}
                , {false, true, true, false, false}
                , {true, false, false, false, false}
                , {true, true, true, true, false}
        };
        boolean[][] threeMatrix = {
                {true, true, true, false, false}
                , {false, false, false, true, false}
                , {false, false, false, true, false}
                , {false, true, true, true, false}
                , {false, false, false, true, false}
                , {true, true, true, false, false}
        };

        LETTER_MATRIX[0] = aMatrix;
        LETTER_MATRIX[1] = bMatrix;
        LETTER_MATRIX[2] = cMatrix;
        LETTER_MATRIX[3] = dMatrix;
        LETTER_MATRIX[4] = eMatrix;
        LETTER_MATRIX[5] = fMatrix;
        LETTER_MATRIX[6] = gMatrix;
        LETTER_MATRIX[7] = hMatrix;
        LETTER_MATRIX[8] = iMatrix;
        LETTER_MATRIX[9] = jMatrix;
        LETTER_MATRIX[10] = kMatrix;
        LETTER_MATRIX[11] = lMatrix;
        LETTER_MATRIX[12] = mMatrix;
        LETTER_MATRIX[13] = nMatrix;
        LETTER_MATRIX[14] = oMatrix;
        LETTER_MATRIX[15] = pMatrix;
        LETTER_MATRIX[16] = qMatrix;
        LETTER_MATRIX[17] = rMatrix;
        LETTER_MATRIX[18] = sMatrix;
        LETTER_MATRIX[19] = tMatrix;
        LETTER_MATRIX[20] = uMatrix;
        LETTER_MATRIX[21] = vMatrix;
        LETTER_MATRIX[22] = wMatrix;
        LETTER_MATRIX[23] = xMatrix;
        LETTER_MATRIX[24] = yMatrix;
        LETTER_MATRIX[25] = zMatrix;
        LETTER_MATRIX[26] = zeroMatrix;
        LETTER_MATRIX[27] = oneMatrix;
        LETTER_MATRIX[28] = twoMatrix;
        LETTER_MATRIX[29] = threeMatrix;
    }
}
