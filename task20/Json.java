package ru.bidonov.task20;

import java.io.*;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {


    public static void jsonSerialize () {

        ObjectMapper objectMapper = new ObjectMapper ();
        try {
            URL url = new URL ("http://www.boredapi.com/api/activity/");
            {
                Api test = objectMapper.readValue (url, Api.class);
                System.out.println (test);
            }

        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
