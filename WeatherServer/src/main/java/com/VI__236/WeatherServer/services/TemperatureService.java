package com.VI__236.WeatherServer.services;

import com.VI__236.WeatherServer.dto.WeatherDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TemperatureService {
    List<WeatherDto> temperatureListCreator(int numOfDays);
}
