package com.example.sakila.service;

import com.example.sakila.domain.City;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class CityServiceTest {
    @Autowired
    CityService cityService;

    @Test
    void selectDetail() {
        City city = cityService.selectDetail(103);
        log.info("city -> {}", city);
    }

    @Test
    void select() {
        City city = cityService.select(76);
        log.info("city -> {}", city);
    }
}