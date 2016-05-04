package ua.goit.timonov.practice.practice_3.task_03_6_gnomeFood;

import java.util.Comparator;

/**
 * Comparator for objects of ArrayItem
 */
public class ItemComparator implements Comparator<ArrayItem> {

    private Order order;

    public ItemComparator(Order order) {
        this.order = order;
    }

    @Override
    public int compare(ArrayItem item1, ArrayItem item2) {
        if (order == Order.ASC) {
            return item1.getValue() - item2.getValue();
        }
        else {
            return item2.getValue() - item1.getValue();
        }
    }
}
