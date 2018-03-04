package com.example.check_labels_p;

// import sun.applet.Main;
// import com.sun.javaws.Main;
// import sun.tools.jar.Main;
//
//
//import sun.security.tools.keytool.Main;

/**
 * Created by Maxim.Rumyantsev on 16-Feb-18.
 * Дальше, вам необходимо реализовать три класса, которые реализуют данный интерфейс:
 * SpamAnalyzer,
 * NegativeTextAnalyzer и
 * TooLongTextAnalyzer.
 SpamAnalyzer должен конструироваться от массива строк с ключевыми словами. Объект этого класса должен сохранять в своем состоянии этот массив строк в приватном поле keywords.
 NegativeTextAnalyzer должен конструироваться конструктором по-умолчанию.
 TooLongTextAnalyzer должен конструироваться от int'а с максимальной допустимой длиной комментария. Объект этого класса должен сохранять в своем состоянии это число в приватном поле maxLength.
 */
public class check_label {
//    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
//        for (TextAnalyzer i : analyzers) {
//            Label res = i.processText(text);
//            if (res != Label.OK) return res;
//        }
//        return Label.OK;
//    }
//
//    abstract public class KeywordAnalyzer implements TextAnalyzer {
//        abstract protected String[] getKeywords();
//
//        abstract protected Label getLabel();
//
//        @Override
//        public Label processText(String text) {
//            for (String i : getKeywords()) {
//                if (text.contains(i)) return getLabel();
//            }
//            return Label.OK;
//        }
//    }
//
//    public static class SpamAnalyzer extends KeywordAnalyzer {
//        private final String[] keywords;
//
//        public SpamAnalyzer(String[] keywords) {
//            this.keywords = keywords;
//        }
//
//        @Override
//        protected String[] getKeywords() {
//            return keywords;
//        }
//
//        @Override
//        protected Label getLabel() {
//            return Label.SPAM;
//        }
//    }
//
//    public static class NegativeTextAnalyzer extends KeywordAnalyzer {
//        private final String[] keywords;
//
//        public NegativeTextAnalyzer() {
//            keywords = new String[]{":(", "=(", ":|"};
//        }
//
//        @Override
//        protected String[] getKeywords() {
//            return keywords;
//        }
//
//        @Override
//        protected Label getLabel() {
//            return Label.NEGATIVE_TEXT;
//        }
//    }
//
//    public static class TooLongTextAnalyzer implements TextAnalyzer {
//        private final int maxLength;
//
//        public TooLongTextAnalyzer(int max_length) {
//            this.maxLength = max_length;
//        }
//
//        @Override
//        public Label processText(String text) {
//            return (text.length() > maxLength) ? Label.TOO_LONG : Label.OK;
//        }
//    }
//
//    // тесты
//    public static void main(String[] args) {
//        // инициализация анализаторов для проверки в порядке данного набора анализаторов
//        String[] spamKeywords = {"spam", "bad"};
//        int commentMaxLength = 40;
//        TextAnalyzer[] textAnalyzers1 = {
//                new SpamAnalyzer(spamKeywords),
//                new NegativeTextAnalyzer(),
//                new TooLongTextAnalyzer(commentMaxLength)
//        };
//        TextAnalyzer[] textAnalyzers2 = {
//                new SpamAnalyzer(spamKeywords),
//                new TooLongTextAnalyzer(commentMaxLength),
//                new NegativeTextAnalyzer()
//        };
//        TextAnalyzer[] textAnalyzers3 = {
//                new TooLongTextAnalyzer(commentMaxLength),
//                new SpamAnalyzer(spamKeywords),
//                new NegativeTextAnalyzer()
//        };
//        TextAnalyzer[] textAnalyzers4 = {
//                new TooLongTextAnalyzer(commentMaxLength),
//                new NegativeTextAnalyzer(),
//                new SpamAnalyzer(spamKeywords)
//        };
//        TextAnalyzer[] textAnalyzers5 = {
//                new NegativeTextAnalyzer(),
//                new SpamAnalyzer(spamKeywords),
//                new TooLongTextAnalyzer(commentMaxLength)
//        };
//        TextAnalyzer[] textAnalyzers6 = {
//                new NegativeTextAnalyzer(),
//                new TooLongTextAnalyzer(commentMaxLength),
//                new SpamAnalyzer(spamKeywords)
//        };
//        // тестовые комментарии
//        String[] tests = new String[8];
//        tests[0] = "This comment is so good.";                            // OK
//        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
//        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
//        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
//        tests[4] = "This comment is so bad....";                          // SPAM
//        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
//        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
//        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
//        TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3,
//                textAnalyzers4, textAnalyzers5, textAnalyzers6};
//        //Main testObject = new Main();
//        int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
//        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
//        for (String test : tests) {
//            numberOfAnalyzer = 1;
//            System.out.print("test #" + numberOfTest + ": ");
//            System.out.println(test);
//            for (TextAnalyzer[] analyzers : textAnalyzers) {
//                System.out.print(numberOfAnalyzer + ": ");
//                // System.out.println(testObject.checkLabels(analyzers, test));
//                System.out.println(checkLabels(analyzers, test));
//                numberOfAnalyzer++;
//            }
//            numberOfTest++;
//        }
//    }

}
