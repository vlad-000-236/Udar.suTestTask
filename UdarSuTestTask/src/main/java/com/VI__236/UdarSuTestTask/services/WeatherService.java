package com.VI__236.UdarSuTestTask.services;

import com.VI__236.UdarSuTestTask.dto.WeatherDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface WeatherService {

    List<WeatherDto> weatherForecast(List<WeatherDto> weatherDtoList);

}
