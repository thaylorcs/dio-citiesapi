package com.thaylorcs.citiesapi.reposoitory;

import com.thaylorcs.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
