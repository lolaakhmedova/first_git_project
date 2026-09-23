package m28_string_class_part2;

public class TestQuoteWords {
    static void main() {
        QuoteWords quoteWords = new QuoteWords();

        quoteWords.topic1 = "Java";
        quoteWords.topic2 = "SQL";


        System.out.println(" I will learn \"" + quoteWords.topic1 + "\" and \"" + quoteWords.topic2 + "\" at Cydeo" );


    }
}
