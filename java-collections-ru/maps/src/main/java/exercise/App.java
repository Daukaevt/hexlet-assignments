package exercise;


import com.google.gson.Gson;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {

    public static Map getWordCount(String sentence) {
        var words = sentence.split(" ");

        Map<String, Integer> dictionary = new HashMap<>();
        for (String word: words) {
            if (!word.isEmpty()) {
                if (dictionary.containsKey(word)) {
                    dictionary.put(word, dictionary.get(word) + 1);
                } else {
                    dictionary.put(word, 1);
                }
            }
        }
        return dictionary;
    }

    public static String toString(Map wordsCount2) {
        if (wordsCount2.isEmpty()) return wordsCount2.toString();
        var tmpStr = wordsCount2.toString();
        var str = tmpStr
                .replaceAll("\s", "\n\s\s")
                .replaceAll("\\{", "{\n\s\s")
                .replaceAll("\\}", "\n}");
        return str;
    }
}
//END