package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("D:\\Работа\\СбеРстажировка\\sber1\\src\\main\\resources\\file_sber.csv"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                if (parts.length >= 5) {
                    String name = parts[0].trim();
                    String region = parts[1].trim();
                    String district = parts[2].trim();
                    String population = parts[3].trim();
                    String foundation = parts[4].trim();

                    City city = new City(name, region, district, population, foundation);
                    cities.add(city);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (City city : cities) {
            System.out.println("City{" + "name=" + "'" + city.getName() + "'" + ", "
                    + "region=" + "'" + city.getRegion() + "'" + ", "
                    + "district=" + "'" + city.getDistrict() + "'" + ", "
                    + "population=" + "'" + city.getPopulation() + "'" + ", "
                    + "foundation=" + "'" + city.getFoundation() + "'" + "}"
            );
        }
    }
}