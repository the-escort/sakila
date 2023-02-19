package com.example.sakila.mapper;

import com.example.sakila.domain.Country;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CountryMapper {
    Country select(int country_id);

    Country selectDetail(int country_id);
}
