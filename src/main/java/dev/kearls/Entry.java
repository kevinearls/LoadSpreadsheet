package dev.kearls;

import com.opencsv.bean.CsvBindByPosition;

// TODO: Can this be a record?  probably not
public class Entry {
    // Number, Continent, Country, State , Location, Region, Hint, Climate, PicsUploaded, Pictures, TBUrl, Notes
    // NOTE: We can also do  @CsvBindByPosition(position = 1)  see https://www.baeldung.com/opencsv
    @CsvBindByPosition(position = 0)
    private Integer number;

    @CsvBindByPosition(position = 1)
    private String continent;

    @CsvBindByPosition(position = 2)
    private String country;

    @CsvBindByPosition(position = 3)
    private String state;

    @CsvBindByPosition(position = 4)
    private String location;

    @CsvBindByPosition(position = 5)
    private String region;

    @CsvBindByPosition(position = 6)
    private String hint;

    @CsvBindByPosition(position = 7)
    private String climate;

    @CsvBindByPosition(position = 8)
    private Boolean picsUploaded;

    @CsvBindByPosition(position = 9)
    private String pictures;

    @CsvBindByPosition(position = 10)
    private String tbUrl;

    @CsvBindByPosition(position = 11)
    private String notes;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public Boolean getPicsUploaded() {
        return picsUploaded;
    }

    public void setPicsUploaded(Boolean picsUploaded) {
        this.picsUploaded = picsUploaded;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getTbUrl() {
        return tbUrl;
    }

    public void setTbUrl(String tbUrl) {
        this.tbUrl = tbUrl;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "number='" + number + '\'' +
                ", continent='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", location='" + location + '\'' +
                ", region='" + region + '\'' +
                ", hint='" + hint + '\'' +
                ", climate='" + climate + '\'' +
                ", picsUploaded='" + picsUploaded + '\'' +
                ", pictures='" + pictures + '\'' +
                ", tbUrl='" + tbUrl + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
