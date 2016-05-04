package ua.goit.timonov.practice.practice_3.task_03_6_gnomeFood;

/**
 * Class for storage array item while they will be sorted
 */
public final class ArrayItem {
    private int index;
    private int value;

    public ArrayItem(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }
}
