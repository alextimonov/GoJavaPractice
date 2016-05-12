package ua.goit.timonov.practice.practice_4.colorChain;

/**
 *
 */
public class ColorChain {

    public static final int COLOR_NUMBER = 3;

    public int count(int N) {
        int variants[] = new int[COLOR_NUMBER];
        for (int i = 0; i <= N ; i++) {
            if (i > COLOR_NUMBER) {
                variants[i % COLOR_NUMBER] = sumArray(variants);
            }
            else {
                if (i < COLOR_NUMBER) {
                    variants[i] = i;
                }
                else {
                    variants[0] = COLOR_NUMBER + 1;
                }
            }
        }
        return variants[N % COLOR_NUMBER];
    }

    private int sumArray(int[] variants) {
        int sum = 0;
        for (int i = 0; i < variants.length; i++) {
            sum += variants[i];
        }
        return sum;
    }
}
