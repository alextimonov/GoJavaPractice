package ua.goit.timonov.practice.practice_2.task_02_1_addNumberBase36;

/**
 * Class that adds two numbers with radix 36 (digits should be chars in diapason '0'..'9', 'a'..'z')
 * using class AddStringNumber
 */
public class AddNumberBase36 {

    private AddStringNumber addStringNumber = new AddStringNumber();

    /**
     * adds two numbers with radix equals 36 due to condition of task
     * @param a     addend number #1 as a string
     * @param b     addend number #2 as a string
     * @return      result number as a string
     */
    public String add(String a, String b) {
        return addStringNumber.add(a, b, addStringNumber.MAX_RADIX);
    }
}
