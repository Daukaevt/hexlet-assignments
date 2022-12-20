package exercise;


import java.util.LinkedList;
import java.util.List;

// BEGIN
public class App {

    public static boolean scrabble(String str, String word) {

        List<String> tmpStr = new LinkedList<>();
        for (char c: str.toLowerCase().toCharArray()) {
            tmpStr.add(String.valueOf(c));
        }

        List<String> tmpWord = new LinkedList<>();
        for (char ch: word.toLowerCase().toCharArray()) {
            tmpWord.add(String.valueOf(ch));
            if (tmpStr.contains(String.valueOf(ch))) {
                tmpStr.remove(String.valueOf(ch));
            }
            else {
                return false;
            }
        }
        return true;
    }
}
//END
