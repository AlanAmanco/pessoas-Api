package com.github.alanamanco.citiesapi.countries.Repository;

import com.github.alanamanco.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
