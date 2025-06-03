package dev.kearls;

public class Main {
    private static final String csvFilename = "TravleDataBase.csv";
    public static void main(String[] args) throws Exception {
       var loader = new Loader(csvFilename);
       loader.load();
    }
}