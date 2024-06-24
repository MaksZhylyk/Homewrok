package lesson43.homework;

import lesson15.Dog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountryManager {
    private List<Country> countries = new ArrayList<>();
    private String countriesFilePath;

    public CountryManager(String countriesFilePath) throws IOException{
        this.countriesFilePath = countriesFilePath;
        loadCountries();
    }
    private void loadCountries()throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(countriesFilePath));
        String line;
        while((line = reader.readLine()) != null){
            String[] parts = line.split(",");
            if(parts.length == 4){
                countries.add(new Country(parts[0].trim(), parts[1].trim(), Long.parseLong(parts[2].trim()), Double.parseDouble(parts[3].trim())));

            }
        }
        reader.close();
    }

    public List<Country> getCountries() {
    return countries;
    }

    public void addCountry(Country country) throws IOException{
        countries.add(country);
        saveCountries();
    }
    public void updateCountry(String name, Country updateCountry) throws IOException{
        for (int i = 0; i < countries.size(); i++) {
            if(countries.get(i).getName().equals(name)){
                countries.set(i, updateCountry);
                saveCountries();
                return;
            }
        }
    }

    public void deleteCountry(String name) throws IOException{
        countries.removeIf(country -> country.getName().equals(name));
        saveCountries();
    }
    private void saveCountries() throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(countriesFilePath));
        for(Country country : countries){
            writer.write(country.toString());
            writer.newLine();
        }
        writer.close();
    }
}
