import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Author ant = new Author();

        Quote quote1 = new Quote();

        Quote quote2 = new Quote();

        Album theWall = new Album();

        quote1.setAuthor("ant");
        quote1.setContent("hello from there");

        quote2.setAuthor("anthony");
        quote2.setContent("hello from here");


        ArrayList <Quote> quotes = new ArrayList<>();

        quotes.add(quote1);
        quotes.add(quote2);

        for(Quote quote : quotes){
            System.out.println(quote.getAuthor());
            System.out.println(quote.getContent());
        }





    }

}
