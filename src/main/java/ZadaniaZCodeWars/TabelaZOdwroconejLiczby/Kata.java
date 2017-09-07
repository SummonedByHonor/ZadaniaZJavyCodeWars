package ZadaniaZCodeWars.TabelaZOdwroconejLiczby;

/**
 * Created by Mateusz on 2017-09-05.
 */
public class Kata {
    public static int[] digitize(long n) {
        String digits = String.valueOf(n);
        long temp = 0;
        int[] tableOfDigits = new int[digits.length()];
        int counter = 0;
        while (n > 0) {
            temp = n % 10;
            n = n / 10;
            tableOfDigits[counter] = (int) temp;
            if (counter != tableOfDigits.length) {
                counter++;
            }
        }
        return tableOfDigits;
    }

    public static void main(String[] args) {
        int[] table = digitize(35231);

        for (int i : table) {
            System.out.println(i);
        }
    }
}
