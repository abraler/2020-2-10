import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class 列表页下载提取 {
    public static void main(String[] args) throws IOException {
        WebClient webClient =new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);

        OutputStream os=new FileOutputStream("唐诗列表");

        String url="https://www.gushiwen.org/gushi/tangshi.aspx";

        HtmlPage page=webClient.getPage(url);
        HtmlElement body=page.getBody();

    }
}
