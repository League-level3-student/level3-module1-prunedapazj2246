package _08_California_Weather;

import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 * 
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api
 */

public class CaliforniaWeather {

	String city;	
    void start() {
        HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
        
        // All city keys have the first letter capitalized of each word
      String information= JOptionPane.showInputDialog("Please enter a California city, weather, or temperature ");
        String info = Utilities.capitalizeWords( information );
        WeatherData datum = weatherData.get(info);
System.out.println(info);
      //  if( datum == null ) {
        //    System.out.println("Unable to find weather data for: " + information);
      //  } else {
        //    System.out.println(information + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
        //} 
        
       for (String key: weatherData.keySet()) {
		
		
        	
		
		
			
		
       if(info.equalsIgnoreCase(key)) {
    	   System.out.println(info + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");	
        
       }
         if(info.equalsIgnoreCase(weatherData.get(key).weatherSummary)) {
    
        }
         if(Integer.parseInt(info)== weatherData.get(key).temperatureF) {
        weatherData
         }
}
} 
}
