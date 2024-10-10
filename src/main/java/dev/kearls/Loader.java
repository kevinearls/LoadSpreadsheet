package dev.kearls;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loader {
    private String csvFilename = "";

    public Loader(String csvFilename) {
        this.csvFilename = csvFilename;
    }

    public void load() throws Exception {
        List<Entry> beans = new CsvToBeanBuilder(new FileReader(csvFilename))
                .withSkipLines(1)
                .withType(Entry.class)
                .build()
                .parse();

        beans.forEach(System.out::println);
    }


    public void oldLload() throws Exception {
//        CSVReader reader = new CSVReader(new FileReader(csvFilename));
//        List<String[]> r = reader.readAll();
//        r.forEach(x -> System.out.println(Arrays.toString(x)));

        CSVParser csvParser = new CSVParserBuilder().withSeparator(',').build(); // custom separator
        try(CSVReader reader = new CSVReaderBuilder(
                new FileReader(csvFilename))
                .withCSVParser(csvParser)   // custom CSV parser
                .withSkipLines(2)           // skip the first line, header info
                .build()){
            List<String[]> r = reader.readAll();
            r.forEach(x -> System.out.println(Arrays.toString(x)));
        }
    }

//        List<List<String>> records = new ArrayList<List<String>>();
//        try (CSVReader csvReader = new CSVReader(new FileReader(csvFilename));) {
//            String[] values = null;
//            while ((values = csvReader.readNext()) != null) {
//                records.add(Arrays.asList(values));
//            }
//        }
//
//        System.out.println("Got " + records.size() + " records");

}
