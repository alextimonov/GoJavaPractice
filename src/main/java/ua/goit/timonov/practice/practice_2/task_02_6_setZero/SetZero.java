package ua.goit.timonov.practice.practice_2.task_02_6_setZero;

/**
 * Class that sets i-th bit to zero in given int number
 */
public class SetZero {
    /**
     * sets i-th bit to zero in given int number
     * @param num           integer value
     * @param i             number of bit to set zero, 1 <= i <= 32
     * @return              integer number with sat bit
     */
    public int set(int num, int i) {
        int mask = 1 << i - 1;
        mask = ~mask;
        return num & mask;
    }
}
