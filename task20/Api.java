package ru.bidonov.task20;

public class Api {

    private String activity;
    private double accessibility;
    private String type;
    private int participants;
    private double price;
    private int key;

    public String getLink () {
        return link;
    }

    public void setLink (String link) {
        this.link = link;
    }

    private String link;

    public Api (){}

    public String getActivity () {
        return activity;
    }

    public void setActivity (String activity) {
        this.activity = activity;
    }

    public double getAccessibility () {
        return accessibility;
    }

    public void setAccessibility (double accessibility) {
        this.accessibility = accessibility;
    }

    public String getType () {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }

    public int getParticipants () {
        return participants;
    }

    public void setParticipants (int participants) {
        this.participants = participants;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public int getKey () {
        return key;
    }

    public void setKey (int key) {
        this.key = key;
    }

    @Override
    public String toString () {
        return "Api{" +
                "activity='" + activity + '\'' +
                ", accessibility=" + accessibility +
                ", type='" + type + '\'' +
                ", participants=" + participants +
                ", price=" + price +
                ", key=" + key +
                '}';
    }
}