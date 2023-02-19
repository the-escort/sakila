package com.example.sakila.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class City {
    private Integer cityId;
    private String city;
    private Integer countryId;
    private Date lastUpdate;
    
    private Country country;
}
