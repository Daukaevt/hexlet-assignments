package exercise;

import com.google.gson.Gson;
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

//    public static String toString(Map wordsCount2) {
//        Gson gson = new Gson();
//        String json = gson.toJson(wordsCount2);
//        if (wordsCount2.isEmpty()) {
//            return wordsCount2.toString();
//        }
//        var str = json
//                .replaceAll(",", "\n\s\s")
//                .replaceAll("\"", "")
//                .replaceAll(":", ":\s\s")
//                .replaceAll("\\{", "{\n\s\s")
//                .replaceAll("}", "\n}");
//        return str;
//    }
    public static String toString(Map wordsCount3) {
        if (wordsCount3.isEmpty()) {
           return wordsCount3.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n");
        for (Object item: wordsCount3.entrySet()) {
            var itemStr = "  " + item;
            stringBuilder.append(itemStr.replace("=", ":  "))
                    .append("\n");
        }
        stringBuilder.append("}");

        return stringBuilder.toString();
    }
}
//END
