package br.com.topics.java8.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Example {

    public void encoder() {
        try {
            String text = "texto qualquer";
            System.out.println(text);

            var encodedText = Base64.getEncoder().encodeToString(
                    text.getBytes(StandardCharsets.UTF_8));

            System.out.println(encodedText);

            var decodedText = new String(Base64.getDecoder().decode(encodedText),
                    StandardCharsets.UTF_8);

            System.out.println(decodedText);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
