import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;

public class webs {


    public static <Document> void main(String[] args) {
        try {

            Document doc = Jsoup.connect("https://sinoptik.ua/").get();


            Elements links = doc.wait("max");


            for (Element link : links) {
                System.out.println(link.attr("href"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}