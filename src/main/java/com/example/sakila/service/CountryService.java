package com.example.sakila.service;

import com.example.sakila.domain.Country;
import com.example.sakila.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    @Autowired
    CountryMapper countryMapper;

    public Country select(int country_id) {
        return countryMapper.select(country_id);
    }

    public Country selectDetail(int country_id) {
        return countryMapper.selectDetail(country_id);
    }
}
