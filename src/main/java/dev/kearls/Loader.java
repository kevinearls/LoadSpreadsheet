package dev.kearls;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Loader {
    private String csvFilename = "";

    public Loader(String csvFilename) {
        this.csvFilename = csvFilename;
    }

    public void load() throws Exception {
        Path path = Paths.get(ClassLoader.getSystemResource(csvFilename).toURI());

        CsvToBeanBuilder csvToBeanBuilder = new CsvToBeanBuilder(new FileReader(path.toFile()));

        List<Entry> beans = new CsvToBeanBuilder(new FileReader(path.toFile()))
                //.withSkipLines(1)  Only skip the header line with CsvBindByPosition...I think
                .withType(Entry.class)
                .withIgnoreEmptyLine(true)
                .build()
                .parse();

       var stuff =  beans.
                stream().filter(b -> b != null && b.getPicsUploaded() && b.getKevinReady())
//               .map(b -> {
//                    return b.getPicsUploaded();
//                })
                .collect(Collectors.toList());

       stuff.forEach(b -> { System.out.println(b); });
        System.out.println(stuff.size());
    }
}
