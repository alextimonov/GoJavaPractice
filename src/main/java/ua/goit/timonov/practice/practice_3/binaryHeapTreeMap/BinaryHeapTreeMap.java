package ua.goit.timonov.practice.practice_3.binaryHeapTreeMap;

import java.util.TreeMap;


public class BinaryHeapTreeMap {
    private TreeMap<Integer, Integer> map = new TreeMap<>();

    public BinaryHeapTreeMap(int size) {

    }

    public void insert(int val) {
        map.put(val, val);
    }

    public int poll() {
        if (map.size() > 0) {
            int max = map.lastKey();
            map.remove(max);
            return max;
        }
        return 0;
    }

}
