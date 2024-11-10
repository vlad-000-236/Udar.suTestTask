package com.VI__236.UdarSuTestTask.mappers;

import com.VI__236.UdarSuTestTask.dto.WeatherDto;
import com.VI__236.UdarSuTestTask.models.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WeatherMapper {

    WeatherDto weatherDto;
    Weather weather;

    @Autowired
    public WeatherMapper(WeatherDto weatherDto, Weather weather){
        this.weatherDto = weatherDto;
        this.weather = weather;
    }

    public Weather weatherDtoToModel(WeatherDto weatherDto){
        return new Weather(weatherDto.getTemperature(), weatherDto.getDate());
    }

    public WeatherDto weatherModelToDto(Weather weather){
        return new WeatherDto(weather.getTemperature(),
                              weather.getDate(),
                       null);
    }

    public List<Weather> weatherDtoListToModelList(List <WeatherDto> weatherDtos){
        return weatherDtos.stream().map(this::weatherDtoToModel).toList();
    }

    public List<WeatherDto> weatherModelListToDtoList(List <Weather> weatherList){
        return weatherList.stream().map(this::weatherModelToDto).toList();
    }
}
