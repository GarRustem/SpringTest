package ru.appline.logic;

public class Compass {

    private String degree;

    // Добавляем конструктор, который позволит избежать возможной Системной ошибки.
    public Compass() {
        super();
    }

    // Комбинацией Alt + Ins  вызываем меню автодобавления конструктора, геттеров и сеттеров.

    public Compass(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    //    private String north = "337-359, 0-21";
//    private String northEast = "22-66";
//    private String east = "67-111";
//    private String southEast = "112-156";
//    private String south = "157-201";
//    private String southWest = "202-246";
//    private String west = "247-291";
//    private String northWest = "292-336";
//
//    // Добавляем конструктор, который позволит избежать возможной Системной ошибки.
//    public Compass() {
//        super();
//    }
//
//    // Комбинацией Alt + Ins  вызываем меню автодобавления конструктора, геттеров и сеттеров.
//    public Compass(String north, String northEast, String east, String southEast, String south, String southWest, String west, String northWest) {
//        this.north = north;
//        this.northEast = northEast;
//        this.east = east;
//        this.southEast = southEast;
//        this.south = south;
//        this.southWest = southWest;
//        this.west = west;
//        this.northWest = northWest;
//    }
//
//    public String getNorth() {
//        return north;
//    }
//
//    public void setNorth(String north) {
//        this.north = north;
//    }
//
//    public String getNorthEast() {
//        return northEast;
//    }
//
//    public void setNorthEast(String northEast) {
//        this.northEast = northEast;
//    }
//
//    public String getEast() {
//        return east;
//    }
//
//    public void setEast(String east) {
//        this.east = east;
//    }
//
//    public String getSouthEast() {
//        return southEast;
//    }
//
//    public void setSouthEast(String southEast) {
//        this.southEast = southEast;
//    }
//
//    public String getSouth() {
//        return south;
//    }
//
//    public void setSouth(String south) {
//        this.south = south;
//    }
//
//    public String getSouthWest() {
//        return southWest;
//    }
//
//    public void setSouthWest(String southWest) {
//        this.southWest = southWest;
//    }
//
//    public String getWest() {
//        return west;
//    }
//
//    public void setWest(String west) {
//        this.west = west;
//    }
//
//    public String getNorthWest() {
//        return northWest;
//    }
//
//    public void setNorthWest(String northWest) {
//        this.northWest = northWest;
//    }
}


