package com.example.sakila.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class Country {
    private Integer countryId;
    private String country;
    private Date lastUpdate;

    private List<City> cities;
}
