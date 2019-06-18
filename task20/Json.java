package ru.bidonov.task20;

import java.io.*;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {

    private int id;
    private String joke;

    public Json (int id, String joke) {
        this.id = id;
        this.joke = joke;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getJoke () {
        return joke;
    }

    public void setJoke (String joke) {
        this.joke = joke;
    }

    @Override
    public String toString () {
        return "Json{" +
                "id=" + id +
                ", joke='" + joke + '\'' +
                '}';
    }

    public static void jsonSerialize () {

        ObjectMapper objectMapper = new ObjectMapper ();
        try {
            URL url = new URL ("http://api.icndb.com/jokes/random");
            {
                Json test = objectMapper.readValue (url, Json.class);
                System.out.println (test);
            }

        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
