package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

public class Encode_and_Decode_TinyURL_535 {

    int salt = "salt".hashCode();
    Map<Integer,String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int hash = longUrl.hashCode() + salt;
        map.put(hash, longUrl);
        return "http://tinyurl.com/" + Integer.toString(hash, 16);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.replaceFirst(".+/", ""), 16));
    }
}
