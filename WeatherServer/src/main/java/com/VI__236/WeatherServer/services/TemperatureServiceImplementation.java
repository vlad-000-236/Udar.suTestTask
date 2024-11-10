package com.VI__236.WeatherServer.services;

import com.VI__236.WeatherServer.dto.WeatherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TemperatureServiceImplementation implements TemperatureService{
    private WeatherDto weatherDto;

    @Autowired
    public TemperatureServiceImplementation(WeatherDto weatherDto){
        this.weatherDto = weatherDto;
    }
    @Override
    public List<WeatherDto> temperatureListCreator(int numOfDays) {

        List<WeatherDto> weatherDtoList = new ArrayList<>();
        int date = 1;

        for(int a = 1; a <= numOfDays; a++){
            weatherDto = new WeatherDto();

            if(date <= 31) {
                weatherDto.setDate(date);
            }
            else{
                date = 1;
                weatherDto.setDate(date);
            }
            weatherDto.setTemperature((int)(Math.random() * 70) - 10);

            weatherDtoList.add(weatherDto);

            date++;
        }
        return weatherDtoList;
    }
}
