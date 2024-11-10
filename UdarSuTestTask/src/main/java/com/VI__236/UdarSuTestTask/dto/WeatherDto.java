package com.VI__236.UdarSuTestTask.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class WeatherDto {

    private int temperature;
    private int date;
    private String message;
}
