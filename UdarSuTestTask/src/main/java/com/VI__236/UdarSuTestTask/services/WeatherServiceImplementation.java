package com.VI__236.UdarSuTestTask.services;

import com.VI__236.UdarSuTestTask.dto.WeatherDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WeatherServiceImplementation implements WeatherService{

    private WeatherDto setWeatherDtoMessage(WeatherDto weatherDto) {

        weatherDto.setMessage("Температура в пределах нормы.");

        if(weatherDto.getTemperature() >= 35){
            weatherDto.setMessage("Внимание! Ожидается аномальная жара!");
        } else if (weatherDto.getTemperature() < 30) {
            weatherDto.setMessage("Внимание! Ожидается аномальное похолодание!");
        }
        if(weatherDto.getTemperature() < 5){
            weatherDto.setMessage("Внимание! Ожидаются заморозки!");
        }
        return weatherDto;
    }

    @Override
    public List<WeatherDto> weatherForecast(List<WeatherDto> weatherDtoListNoMessage) {
        return weatherDtoListNoMessage.stream().map(this::setWeatherDtoMessage).toList();
    }
}
