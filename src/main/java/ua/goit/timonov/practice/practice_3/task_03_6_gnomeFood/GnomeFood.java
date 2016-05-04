package ua.goit.timonov.practice.practice_3.task_03_6_gnomeFood;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class that finds solution for the task about food of gnomes
 */
public class GnomeFood {
    /**
     * finds array where indexes of elements from first array gnames correspond to
     * indexes from second array portions if they will be sorted.
     * @param gnames        array with heights of gnomes
     * @param portions      array with weights of food
     * @return              array with key to order the food
     */
    public int[] find(int[] gnames, int[] portions) {
        List<ArrayItem> gnamesList = sortArrayAsList(gnames, Order.DESC);
        List<ArrayItem> portionsList = sortArrayAsList(portions, Order.DESC);
        return makeResultArray(gnamesList, portionsList);
    }

    // makes result array setting dependence from two sorted lists
    private int[] makeResultArray(List<ArrayItem> gnamesList, List<ArrayItem> portionsList) {
        int[] result = new int[gnamesList.size()];
        for (int i = 0; i < gnamesList.size(); i++) {
            int index = gnamesList.get(i).getIndex();
            int value = portionsList.get(i).getIndex();
            result[index] = value;
        }
        return result;
    }

    // returns sorted in given order list with values and indexes from given array
    private List<ArrayItem> sortArrayAsList(int[] array, Order order) {
        List<ArrayItem> listItems = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            listItems.add(new ArrayItem(i, array[i]));
        }
//        listItems.sort(new ItemComparator(order));
        Collections.sort(listItems, new ItemComparator(order));
        return listItems;
    }
}
