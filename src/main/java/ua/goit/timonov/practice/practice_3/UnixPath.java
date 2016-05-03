package ua.goit.timonov.practice.practice_3;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Class that finds simple file path from full unix path
 */
public class UnixPath {

    public static final String SLASH = "/";
    public static final String EMPTY_STRING = "";
    public static final String CURRENT_DIR = ".";
    public static final String PARENT_DIR = "..";
    public static final String CURRENT_PARENT_DIR = "...";

    /**
     * finds simple path to file from full unix path
     * @param input     given full unix path to file
     * @return          founded simple path
     */
    public String simplify(String input) {
        Deque<String> dirList = makeSimplePath(input);
        return buildPathFromDirList(dirList);
    }

    // makes simplified path as list of directories from full string path
    private Deque<String> makeSimplePath(String input) {
        Deque<String> path = new LinkedList<>();
        String[] fullPath = input.split(SLASH);
        int returnCount = 0;
        for (int i = 0; i < fullPath.length; i++) {
            if (fullPath[i].equals(PARENT_DIR)) {
                returnCount++;
            }
            else {
                if (fullPath[i].equals(CURRENT_PARENT_DIR)) {
                    path.clear();
                    returnCount = 0;
                }
                else {
                    for (int j = 0; j < returnCount; j++) {
                        path.removeLast();
                    }
                    returnCount = 0;
                    if (!(fullPath[i].equals(CURRENT_DIR) || fullPath[i].equals(EMPTY_STRING))) {
                        path.add(fullPath[i]);
                    }
                }
            }
        }
        return path;
    }

    // builds string file path using delimiter SLASH from path as list of directories
    private String buildPathFromDirList(Deque<String> path) {
        if (path.isEmpty()) return SLASH;
        else {
            StringBuilder resultPath = new StringBuilder();
            while (!path.isEmpty()) {
                resultPath.append(SLASH + path.pollFirst());
            }
            return resultPath.toString();
        }
    }
}
