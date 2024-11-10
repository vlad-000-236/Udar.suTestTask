package com.VI__236.WeatherServer.controllers;

import com.VI__236.WeatherServer.dto.WeatherDto;
import com.VI__236.WeatherServer.services.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
@RequestMapping("/get_weather")
public class TemperatureController {

    private WeatherDto weatherDto;
    private TemperatureService temperatureService;

    @Autowired
    public TemperatureController(WeatherDto weatherDto, TemperatureService temperatureService){
        this.weatherDto = weatherDto;
        this.temperatureService = temperatureService;
    }

    @GetMapping()
    public List<WeatherDto> temperatureList(@RequestParam(value = "numOfDays", required = false) int numOfDays){
        return temperatureService.temperatureListCreator(numOfDays);
    }
}
