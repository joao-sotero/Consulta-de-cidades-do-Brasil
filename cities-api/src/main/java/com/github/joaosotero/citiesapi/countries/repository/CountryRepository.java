package com.github.joaosotero.citiesapi.repository;

import com.github.joaosotero.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
