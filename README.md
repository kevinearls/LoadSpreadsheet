# LoadSpreadsheet
This code relies primarily on the OpenCSV library

## Using the Travle Locations speadsheet
As of this writing I don't know how to download this directly, so for a first step in the
spreadsheet do ```File -> Download -> Comma Seperated Values (.csv)```.  

On a Mac this will put a copy of the files in your ~/Downloads directory.  Copy
that to the resources directory in this file.

## Matching columns.
See ```Entry.java```.  For new columns, follow this model:

```
 @CsvBindByName(column = "Number")
 private Integer number;
```
## Running the program
For now open ```Main.java``` in IntelliJ and run it.

