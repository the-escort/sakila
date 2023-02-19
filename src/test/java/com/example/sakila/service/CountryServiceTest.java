package com.example.sakila.service;

import com.example.sakila.domain.Country;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class CountryServiceTest {
    @Autowired
    CountryService countryService;

    @Test
    void selectDetail() {
        Country country = countryService.selectDetail(27);
        log.info("conutry -> {}", country);
    }

    @Test
    void select() {
        Country country = countryService.select(55);
        log.info("country -> {}", country);
    }
}