package dev.kearls;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.util.List;

public class Loader {
    private String csvFilename = "";

    public Loader(String csvFilename) {
        this.csvFilename = csvFilename;
    }

    public void load() throws Exception {
        List<Entry> beans = new CsvToBeanBuilder(new FileReader(csvFilename))
                //.withSkipLines(1)  Only skip the header line with CsvBindByPosition...I think
                .withType(Entry.class)
                .build()
                .parse();

        beans.forEach(System.out::println);
    }
}
