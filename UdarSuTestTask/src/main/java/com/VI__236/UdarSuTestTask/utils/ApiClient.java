package com.VI__236.UdarSuTestTask.utils;

import com.VI__236.UdarSuTestTask.dto.WeatherDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Component
@PropertySource("classpath:application.properties")
@FeignClient(name = "${feign.client.weather.name}", url = "${feign.client.weather.url}")
public interface ApiClient {

    @RequestMapping(method = GET, consumes = APPLICATION_JSON_VALUE)
    List<WeatherDto> getWeather(@RequestParam("numOfDays") int numOfDays);
}