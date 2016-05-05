package ua.goit.timonov.practice.practice_3.task_03_4_rectangleSquare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Class to find square that is covered by N rectangles with one side on the axe OX
 */
public class RectangleSquare {
    /**
     * finds square of figure covered by given rectangles
     * @param x         array with left bottom coordinates of rectangles
     * @param h         array with heights of rectangles
     * @param w         array with widths of rectangles
     * @return          square of figure that is covered by given rectangles
     */
    public int measure(int[] x, int[] h, int[] w) {
        List<Column> rectangles = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            rectangles.add(new Column(x[i], x[i] + w[i], h[i]));
        }
        Collections.sort(rectangles, new Comparator<Column>() {
            @Override
            public int compare(Column column1, Column column2) {
                if (column1.getxRight() == column2.getxRight())
                    return column1.getxLeft() - column2.getxLeft();
                return column1.getxRight() - column2.getxRight();
            }
        });
        List<Column> figure = new ArrayList<>();
        figure.add(rectangles.get(0));
        int lastXLeft = rectangles.get(0).getxLeft();
        for (int i = 1; i < rectangles.size(); i++) {
            addColumnToFigure(rectangles.get(i), figure, lastXLeft);
            lastXLeft = rectangles.get(i).getxLeft();
        }
        int square = findSquare(figure);
        return square;
    }

    // checks current figure and adds new column to list of columns if it is matching
    private void addColumnToFigure(Column nextColumn, List<Column> figure, int lastXLeft) {
        Column lastColumn = figure.get(figure.size() - 1);
        if (nextIsOnTheRightOfLast(nextColumn, lastColumn)) {
            figure.add(nextColumn);
        }
        if (nextCrossesAndIsHigherThanLast(nextColumn, lastColumn)) {
            lastColumn.setxRight(nextColumn.getxLeft());
            figure.add(nextColumn);
        }
        if (nextCrossesAndIsLowerThanLast(nextColumn, lastColumn)) {
            nextColumn.setxLeft(lastColumn.getxRight());
            figure.add(nextColumn);
        }
        if (nextBeginsLefterThanLast(nextColumn, lastColumn)) {
            int nStartColumn = findStartColumn(nextColumn, figure);
            Column startColumn = figure.get(nStartColumn);
            if (nextColumnCrossesStart(nextColumn, startColumn)) {
                if (nextColumnIsHigher(nextColumn, startColumn)) {
                    startColumn.setxRight(nextColumn.getxLeft());
                }
                else // nextColumn is lower than current
                {
                    nextColumn.setxLeft(startColumn.getxRight());
                }
                nStartColumn++;
            }
            int i = nStartColumn;
            while (i < figure.size()) {
                Column currentColumn = figure.get(i);
                if (nextColumnIsHigher(nextColumn, currentColumn)) {
                    figure.remove(i);
                    i--;
                }
                else {
                    figure.add(i, new Column(nextColumn.getxLeft(), currentColumn.getxLeft(), nextColumn.getHeight()));
                    i++;
                    nextColumn.setxLeft(currentColumn.getxRight());
                }
                i++;
            }
            figure.add(nextColumn);
        }
    }

    // returns true if left side of new column crosses given column
    private boolean nextColumnCrossesStart(Column nextColumn, Column column) {
        return nextColumn.getxLeft() >= column.getxLeft();
    }

    // finds number of column in figure which is first (left) crossed by new column
    private int findStartColumn(Column nextColumn, List<Column> figure) {
        int i = 0;
        boolean foundStartColumn = false;
        while (i < figure.size() && (!foundStartColumn)) {
            if (nextColumn.getxLeft() <= figure.get(i).getxRight()) {
                foundStartColumn = true;
            }
            else i++;
        }
        return i;
    }

    // returns true if left side of new column is lefter than current (last) column
    private boolean nextBeginsLefterThanLast(Column nextColumn, Column lastColumn) {
        return nextColumn.getxLeft() < lastColumn.getxLeft();
    }

    // returns true if new column crosses current (last) column and is lower than last one
    private boolean nextCrossesAndIsLowerThanLast(Column nextColumn, Column lastColumn) {
        return nextColumn.getxLeft() >= lastColumn.getxLeft() && nextColumn.getxLeft() < lastColumn.getxRight() &&
                nextColumn.getHeight() <= lastColumn.getHeight();
    }

    // returns true if new column crosses current (last) column and is higher than last one
    private boolean nextCrossesAndIsHigherThanLast(Column nextColumn, Column lastColumn) {
        return nextColumn.getxLeft() >= lastColumn.getxLeft() && nextColumn.getxLeft() < lastColumn.getxRight() &&
                nextColumn.getHeight() > lastColumn.getHeight();
    }

    // returns true if whole new column is righter than current (last) column
    private boolean nextIsOnTheRightOfLast(Column nextColumn, Column lastColumn) {
        return nextColumn.getxLeft() >= lastColumn.getxRight();
    }

    // returns true if new column is higher than current column
    private boolean nextColumnIsHigher(Column nextColumn, Column currentColumn) {
        return nextColumn.getHeight() > currentColumn.getHeight();
    }

    // finds square of figure that consists of columns
    private int findSquare(List<Column> complexFigure) {
        int square = 0;
        for (Column column : complexFigure) {
            square += column.findSquare();
        }
        return square;
    }
}
