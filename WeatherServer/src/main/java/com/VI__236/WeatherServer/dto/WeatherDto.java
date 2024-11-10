package com.VI__236.WeatherServer.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class WeatherDto {
    private int date;
    private int temperature;
    private String message;
}
