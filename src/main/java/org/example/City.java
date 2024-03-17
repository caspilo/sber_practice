package org.example;

public class City {
    private String name;
    private String region;
    private String district;
    private String population;
    private String foundation;

    public City(String name, String region, String district, String population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getRegion(){
        return region;
    }
    public void setRegion(String region){
        this.region = region;
    }
    public String getDistrict(){
        return district;
    }
    public void setDistrict(String district){
        this.district = district;
    }
    public String getPopulation(){
        return population;
    }
    public void setPopulation(String population){
        this.population =population;
    }
    public String getFoundation(){
        return foundation;
    }
    public void setFoundation(String foundation){
        this.foundation = foundation;
    }
}
