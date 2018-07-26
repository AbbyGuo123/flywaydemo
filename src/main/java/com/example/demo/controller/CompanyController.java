package com.example.demo.controller;

import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @GetMapping("/companies")
    public List<Company> all() {
        return companyRepository.findAll();
    }

    @GetMapping("/companies/{id}")
    public Company find(@PathVariable Integer id) {
        return null;
    }

    @PostMapping("/companies")
    public Company add(@RequestBody Company o) {
        return null;
    }

    @DeleteMapping("/companies/{id}")
    public void destroy(@PathVariable Integer id) {

    }

    @PutMapping("/companies")
    public Company update(@RequestBody Company o) {
        return null;
    }

}
