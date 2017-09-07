package ZadaniaZCodeWars.ZnajdywanieBrakujacejLiterki;

/**
 * Created by Mateusz on 2017-09-04.
 */
public class Kata {

    public static char findMissingLetter(char[] array) {
        char missingLetter = array[0];
        char result = 'a';
        for (int i = 0; i < array.length; i++) {
            if (array[i] != missingLetter) {
                result = missingLetter;
                break;
            }
            missingLetter++;

        }
        return result;
    }

    public static void main(String[] args) {
        char[] letters = {'O','Q','R','S'};
        System.out.println(findMissingLetter(letters));
    }
}
