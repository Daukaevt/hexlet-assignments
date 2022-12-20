package exercise;

import java.util.Map;

public class Main {
    public static void main(String[] args) {


        String sentence = "java is the best programming language java";
        Map wordsCount = App.getWordCount(sentence);
        System.out.println(wordsCount); // => {the=1, java=2, is=1, best=1, language=1, programming=1}

        sentence = "the java is the best programming language java";
        wordsCount = App.getWordCount(sentence);
        String result = App.toString(wordsCount);
        System.out.println(result); // =>
// {
//   the: 2
//   java: 2
//   is: 1
//   best: 1
//   language: 1
//   programming: 1
// }

        Map wordsCount2 = App.getWordCount("");
        String result2 = App.toString(wordsCount2);
        System.out.println(result2); // => {}


    }
}
