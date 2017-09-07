package ZadaniaZCodeWars.SortowanieWyrazowZLiczbami;

/**
 * Created by Mateusz on 2017-09-05.
 */
public class Kata {
    public static String order(String words) {
        if (words == "") {
            return "";
        }

        String[] wordsTable = words.split(" ");
        String[] wordsTableTemp = new String[wordsTable.length];
        char index;
        char oldIndex = 0;
        for (int i = 0; i < wordsTable.length; i++) {

            for (int j = 0; j < wordsTable[i].length(); j++) {
                switch (wordsTable[i].charAt(j)) {
                    case '0': {
                        index = '0';
                        break;
                    }
                    case '1': {
                        index = '1';
                        break;
                    }
                    case '2': {
                        index = '2';
                        break;
                    }
                    case '3': {
                        index = '3';
                        break;
                    }
                    case '4': {
                        index = '4';
                        break;
                    }
                    case '5': {
                        index = '5';
                        break;
                    }
                    case '6': {
                        index = '6';
                        break;
                    }
                    case '7': {
                        index = '7';
                        break;
                    }
                    case '8': {
                        index = '8';
                        break;
                    }
                    case '9': {
                        index = '9';
                        break;
                    }
                    default: {
                        continue;
                    }
                }
                if (wordsTableTemp.length != 0) {
                    if ((int) oldIndex > (int) index) {
                        String temp = wordsTableTemp[i - 1];
                        wordsTableTemp[i - 1] = wordsTable[i];
                        wordsTableTemp[i] = temp;

                    } else {
                        wordsTableTemp[i] = wordsTable[i];
                        oldIndex = index;
                    }
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < wordsTableTemp.length; i++) {
            stringBuilder.append(wordsTableTemp[i]);
            if (i != wordsTableTemp.length - 1) {
                stringBuilder.append(" ");
            }
        }
        String napis = stringBuilder.toString();
        return napis;
    }

    public static void main(String[] args) {
        String words = order("Fo1r the2 g3ood 4of th5e pe6ople");
        System.out.println(words);

    }
}
