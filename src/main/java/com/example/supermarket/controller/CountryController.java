package com.example.supermarket.controller;

import com.example.supermarket.domain.Country;
import com.example.supermarket.respository.CountryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@Slf4j
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping(value="/")
    public String test(ModelMap model) {
        List<Country> list = countryRepository.findAll();
        model.addAttribute("countrys", list);
        log.info("lisy[{}]..............",list);
        return "index";
    }

}
