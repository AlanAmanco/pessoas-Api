package com.github.alanamanco.citiesapi.countries;

import com.github.alanamanco.citiesapi.countries.Repository.CountryRepository;
import com.github.alanamanco.citiesapi.countries.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    @GetMapping("/all")
    public List<Country> countries(){
        return repository.findAll();
    }

    @GetMapping("/page")
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public Country getOne(@PathVariable Long id){
        return repository.getById(id);
    }
}
