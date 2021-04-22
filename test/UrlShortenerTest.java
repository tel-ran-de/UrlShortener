import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrlShortenerTest {


    @Test
    public void shortUrlToId_test(){
        int res = UrlShortener.shortUrlToId("booking/?23425/confirm.php");
        assertEquals(653178733, res);
    }

    @Test
    public void idToShortenURL_test(){
        String res = UrlShortener.idToShortenUrl(653178733);
        assertEquals("SmPM1", res);
    }

    @Test
    public void shortUrlToId_test_back(){
        int res = UrlShortener.shortUrlToId("SmPM1");
        assertEquals(653178733, res);
    }

}