package dev.kearls;

public class Main {
    private static final String blah = "/Users/kevinearls/sources/docker/LoadSpreadsheet/src/main/resources/Travle DataBase - Sheet1.csv";
    public static void main(String[] args) throws Exception {
       var loader = new Loader(blah);
       loader.load();
    }
}