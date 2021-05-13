package com.github.joaosotero.citiesapi;

import com.github.joaosotero.citiesapi.countries.Country;
import com.github.joaosotero.citiesapi.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repository;

    public CountryResource(CountryRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public Page<Country> country(Pageable page){
        return repository.findAll(page);
    }
}
