package snsors.in.weatherapp;

public class Book {

    public String lon;
    public String lat;


    public Book(){

    }

    public Book(String lon, String lat) {
        this.lon = lon;
        this.lat = lat;

    }

    @Override
    public String toString() {
        return  "lon: " + lon +
                "\nlat: " + lat ;

    }
}
