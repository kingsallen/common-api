package com.moseeker.vo.search;

public class MyGeoPoint {
    private double lat;
    private double lon;
    public MyGeoPoint() {
    }
    public MyGeoPoint(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
