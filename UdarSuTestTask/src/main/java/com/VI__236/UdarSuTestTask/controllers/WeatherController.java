package com.VI__236.UdarSuTestTask.controllers;

import com.VI__236.UdarSuTestTask.dto.NumOfDays;
import com.VI__236.UdarSuTestTask.dto.WeatherDto;
import com.VI__236.UdarSuTestTask.services.WeatherService;
import com.VI__236.UdarSuTestTask.utils.ApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Component
@RestController
@RequestMapping("/weather_app")
public class WeatherController {

    ApiClient apiClient;
    WeatherService weatherService;

    NumOfDays numOfDays;

    @Autowired
    public WeatherController(ApiClient apiClient, WeatherService weatherService, NumOfDays numOfDays){
        this.apiClient = apiClient;
        this.weatherService = weatherService;
        this.numOfDays = numOfDays;
    }

    @GetMapping("/weather")
    public Collection <WeatherDto> getWeather(@RequestParam (value = "numOfDays", required = false) int numOfDays){
            return weatherService.weatherForecast(apiClient.getWeather(numOfDays));
    }
}