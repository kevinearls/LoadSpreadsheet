package dev.kearls;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String blah = "/Users/kevinearls/sources/docker/LoadSpreadsheet/src/main/resources/Travle DataBase - Sheet1.csv";
    public static void main(String[] args) throws Exception {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       var loader = new Loader(blah);
       loader.load();
    }
}