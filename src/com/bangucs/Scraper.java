package com.bangucs;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by mitsuo.hangai on 10/6/15.
 */
public class Scraper {
    @SuppressWarnings("unused")
    private Scraper(){
    };

    protected Document document = null;

    public Scraper(String url) throws IOException{
        this.document = Jsoup.connect(url).get();
    }

    public String getWholeHTML(){
        return this.document.html();
    }
    public String getTextByXPATH(String xPath){
        return  document.select(xPath).text();
    }
}
