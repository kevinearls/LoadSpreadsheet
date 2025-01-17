package dev.kearls;

import com.opencsv.bean.CsvBindByName;

public class Entry {
    // Actual names: Number,Continent,Country,State/Province/Territory/etc.,Location,Region,Hint,Climate,Pics Uploaded?,Pictures,TB URL,Notes
    @CsvBindByName(column = "Number")
    private Integer number;

    @CsvBindByName(column = "Continent")
    private String continent;

    @CsvBindByName(column = "Country")
    private String country;

    @CsvBindByName(column = "State/Province/Territory/etc.")
    private String state;

    @CsvBindByName(column = "Location")
    private String location;

    @CsvBindByName(column = "Region")
    private String region;

    @CsvBindByName(column = "Up Front Description")
    private String upFrontDescription;

    @CsvBindByName(column = "Hint # 1")
    private String hint1;

    @CsvBindByName(column = "Description at the end")
    private String descriptionAtTheEnd;

    @CsvBindByName(column = "Wikipedia Link")
    private String wikipediaLink;

    @CsvBindByName(column = "Tourism Link")
    private String tourismLink;

    @CsvBindByName(column = "Climate")
    private String climate;

    @CsvBindByName(column = "Pics Uploaded?")
    private Boolean picsUploaded;

    // FIXME I'm not sure anything after here is relevant

    @CsvBindByName(column = "Pictures")
    private String pictures;

    @CsvBindByName(column = "TB URL")
    private String tbUrl;

    @CsvBindByName(column = "Notes")
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

    public String getUpFrontDescription() {
        return upFrontDescription;
    }

    public void setUpFrontDescription(String upFrontDescription) {
        this.upFrontDescription = upFrontDescription;
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

    public String getHint1() {
        return hint1;
    }

    public String getDescriptionAtTheEnd() {
        return descriptionAtTheEnd;
    }

    public String getWikipediaLink() {
        return wikipediaLink;
    }

    public String getTourismLink() {
        return tourismLink;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "number=" + number +
                ", continent='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", location='" + location + '\'' +
                ", region='" + region + '\'' +
                ", upFrontDescription='" + upFrontDescription + '\'' +
                ", hint1='" + hint1 + '\'' +
                ", descriptionAtTheEnd='" + descriptionAtTheEnd + '\'' +
                ", wikipediaLink='" + wikipediaLink + '\'' +
                ", tourismLink='" + tourismLink + '\'' +
                ", climate='" + climate + '\'' +
                ", picsUploaded=" + picsUploaded +
                ", pictures='" + pictures + '\'' +
                ", tbUrl='" + tbUrl + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
//    @Override
//    public String toString() {
//        return "Entry{" +
//                "number='" + number + '\'' +
//                ", continent='" + continent + '\'' +
//                ", country='" + country + '\'' +
//                ", state='" + state + '\'' +
//                ", location='" + location + '\'' +
//                ", region='" + region + '\'' +
//                ", hint='" + upFrontDescription + '\'' +
//                ", climate='" + climate + '\'' +
//                ", picsUploaded='" + picsUploaded + '\'' +
//                ", pictures='" + pictures + '\'' +
//                ", tbUrl='" + tbUrl + '\'' +
//                ", notes='" + notes + '\'' +
//                '}';
//    }
}
