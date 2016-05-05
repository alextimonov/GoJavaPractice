package ua.goit.timonov.practice.practice_3.task_03_4_rectangleSquare;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to find square that is covered by N rectangles
 */
public class RectangleSquare {
    public int measure(int[] x, int[] h, int[] w) {
        List<Column> figure = new ArrayList<>();
        figure.add(new Column(x[0], x[0] + w[0], h[0]));
        for (int i = 1; i < x.length; i++) {
            addColumnToFigure(new Column(x[i], x[i] + w[i], h[i]), figure);
        }
        int square = findSquare(figure);
        return square;
    }

    private void addColumnToFigure(Column nextColumn, List<Column> figure) {
        if (nextColumn.getxRight() < figure.get(0).getxLeft()) {
            figure.add(0, nextColumn);
        }
        else {
            if (nextColumn.getxLeft() > figure.get(figure.size() - 1).getxRight()) {
                figure.add(nextColumn);
            }
            else {
                boolean reachXRight = false;
                boolean reachXLeft = false;
                int i = 0;
                while (i < figure.size() && (!reachXLeft || !reachXRight)) {
                    // found left border column
                    if (!reachXLeft && (nextColumn.getxLeft() <= figure.get(i).getxLeft() ||
                            nextColumn.getxLeft() <= figure.get(i).getxRight())) {
                        reachXLeft = true;
                        // inside current column
                        if (nextColumn.getxLeft() <= figure.get(i).getxRight()) {
                            if (nextColumnIsHigher(nextColumn, figure.get(i))) {
                                if (figure.get(i).getxRight() > nextColumn.getxRight()) {
                                    figure.add(i + 1, new Column(nextColumn.getxRight(),
                                            figure.get(i).getxRight(), figure.get(i).getHeight()));
                                }
                                figure.get(i).setxRight(nextColumn.getxLeft());
                            }
                            else {
                                nextColumn.setxLeft(figure.get(i).getxRight());
                            }
                        }
                        // left from current column
                        if (nextColumn.getxLeft() <= figure.get(i).getxLeft()) {
                            figure.add(i, new Column(nextColumn.getxLeft(), figure.get(i).getxLeft(), nextColumn.getHeight()));
                            i++; // !
                        }
                        i++;
                        continue;
                    }

                    // inner columns
                    if (reachXLeft && !reachXRight && nextColumn.getxRight() > figure.get(i).getxRight()) {
                        if (nextColumnIsHigher(nextColumn, figure.get(i))) {
                            figure.remove(i);
                            i--; // !
                        }
                        else {
                            figure.add(i, new Column(nextColumn.getxLeft(), figure.get(i).getxLeft(),
                                    nextColumn.getHeight()));
                            i++; // !
                            nextColumn.setxLeft(figure.get(i).getxRight());
                        }
                        i++;
                        continue;
                    }

                    // found right border column
                    if (reachXLeft && !reachXRight && nextColumn.getxRight() <= figure.get(i).getxLeft() ||
                            nextColumn.getxRight() <= figure.get(i).getxRight()) {
                        reachXRight = true;
                        // inside current column
                        if (nextColumn.getxLeft() <= figure.get(i).getxRight()) {
                            if (nextColumnIsHigher(nextColumn, figure.get(i))) {
                                figure.get(i).setxLeft(nextColumn.getxRight());
                            }
                            else {
                                nextColumn.setxRight(figure.get(i).getxLeft());
                            }
                        }
                        // left than current column
                        if (nextColumn.getxRight() <= figure.get(i).getxLeft()) {
                            // NOP
                        }
                        figure.add(i, nextColumn);
                        i++; // !
                    }
                    i++;
                }
                if (!reachXRight) {
                    figure.add(figure.size(), nextColumn);
                }
            }
        }
    }

    private boolean nextColumnIsHigher(Column nextColumn, Column currentColumn) {
        return nextColumn.getHeight() > currentColumn.getHeight();
    }

    private int findSquare(List<Column> complexFigure) {
        int square = 0;
        for (Column column : complexFigure) {
            square += column.findSquare();
        }
        return square;
    }
}
