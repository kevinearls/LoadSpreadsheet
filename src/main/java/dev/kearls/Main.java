package dev.kearls;

public class Main {
    private static final String csvFilename = "Travle DataBase - Sheet1.csv";
    public static void main(String[] args) throws Exception {
       var loader = new Loader(csvFilename);
       loader.load();
    }
}