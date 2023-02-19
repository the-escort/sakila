package com.example.sakila.service;

import com.example.sakila.domain.City;
import com.example.sakila.mapper.CityMapper;
import com.example.sakila.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    CityMapper cityMapper;

    public City select(int city_id) {
        return cityMapper.select(city_id);
    }

    public City selectDetail(int city_id) {
        return cityMapper.selectDetail(city_id);
    }
}
