public class UrlShortener {

    /**
     * This method converts id to short url using 62 character base
     * @param n
     * @return shortUrl
     */
    public static String idToShortenUrl(int n) {
        // Map to store 62 possible characters
        char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        StringBuffer shortUrl = new StringBuffer();

        // Convert given id to a base 62 number
        while (n > 0)
        {
            // use above map to store actual character in short url
            shortUrl.append(map[n % 62]);
            n = n / 62;
        }

        // Reverse shortURL to complete base conversion
        return shortUrl.reverse().toString();
    }

    /**
     * This method gets id back from a short url
     * @param shortURL
     * @return integer Id
     */
    public static int shortUrlToId(String shortURL) {
        int id = 0;

        // base conversion logic
        for (int i = 0; i < shortURL.length(); i++)
        {
            if ('a' <= shortURL.charAt(i) &&
                    shortURL.charAt(i) <= 'z')
                id = id * 62 + shortURL.charAt(i) - 'a';
            if ('A' <= shortURL.charAt(i) &&
                    shortURL.charAt(i) <= 'Z')
                id = id * 62 + shortURL.charAt(i) - 'A' + 26;
            if ('0' <= shortURL.charAt(i) &&
                    shortURL.charAt(i) <= '9')
                id = id * 62 + shortURL.charAt(i) - '0' + 52;
        }
        return id;
    }
}



