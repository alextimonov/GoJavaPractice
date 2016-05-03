package ua.goit.timonov.practice.practice_3.task_03_3_reversePolishNotation;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Class that finds result of expression in reverse Polish notation
 */
public class ReversePolishNotation {

    public static final String SPACE = " ";
    public static final String PLUS = "+";
    public static final String MINUS = "-";
    public static final String MULTUPLY = "*";
    public static final String DIVIDE = "/";

    /**
     * finds result of expression in reverse Polish notation
     * @param expression    String with expression in reverse Polish notation
     * @return              integer result of given expression
     */
    public int evaluate(String expression) {
        String[] strings = expression.split(SPACE);
        Deque<Integer> operands = new LinkedList<>();
        for (int i = 0; i < strings.length; i++) {
            switch (strings[i]) {
                case PLUS: {
                    int operand2 = operands.pollFirst();
                    int operand1 = operands.pollFirst();
                    operands.addFirst(operand1 + operand2);
                }
                break;
                case MINUS: {
                    int operand2 = operands.pollFirst();
                    int operand1 = operands.pollFirst();
                    operands.addFirst(operand1 - operand2);
                }
                break;
                case MULTUPLY: {
                    int operand2 = operands.pollFirst();
                    int operand1 = operands.pollFirst();
                    operands.addFirst(operand1 * operand2);
                }
                break;
                case DIVIDE: {
                    int operand2 = operands.pollFirst();
                    int operand1 = operands.pollFirst();
                    operands.addFirst(operand1 / operand2);
                }
                break;
                default: {
                    operands.addFirst(Integer.parseInt(strings[i]));
                }
            }
        }
        return operands.pollFirst();
    }
}
