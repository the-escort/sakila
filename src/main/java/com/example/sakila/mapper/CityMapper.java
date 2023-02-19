package com.example.sakila.mapper;

import com.example.sakila.domain.City;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityMapper {
    City select(int city_id);

    City selectDetail(int city_id);
}
