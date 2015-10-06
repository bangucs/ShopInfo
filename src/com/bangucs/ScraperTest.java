package com.bangucs;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runner.JUnitCore;

import java.io.IOException;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ScraperTest {
    Scraper scraper = null;

    @Before
    public void doBefore() throws IOException {
        this.scraper = new Scraper("http://www.rakuten.co.jp/hi-syokuzaishitu/info.html");
    }

    @Test
    public void testGetWholeHTML(){
        System.out.println(scraper.getWholeHTML());
        assertNotNull(scraper.getWholeHTML());
    }

    @Test
    public void testGetInfo() throws IOException {
        assertEquals("〒135-0033 東京都江東区深川2-23-12　1F\n" +
                "   ", this.scraper.getTextByXPATH("html > body > blockquote:nth-child(22) > table > tbody > tr > td:nth-child(1) > font > dl > dd:nth-child(3)"));
    }
}