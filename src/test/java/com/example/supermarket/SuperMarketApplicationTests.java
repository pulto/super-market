package com.example.supermarket;

import com.example.supermarket.config.JpaCondiguration;
import com.example.supermarket.domain.Country;
import com.example.supermarket.respository.CountryRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {JpaCondiguration.class,SuperMarketApplication.class})
public class SuperMarketApplicationTests {
    @Autowired
    private CountryRepository countryRepository;
    @Before
    public void contextLoads() {
        Country country = new Country();
        country.setCountryCode("82");
        country.setCountryName("美国");
        countryRepository.save(country);
        assert country.getId()>0:"creat error";
    }

    @Test
    public void getData(){
        List<Country> countries = countryRepository.findAll();
        assert countries!=null:"getdata is null";
        for (Country country:countries
             ) {
            log.info("====country name={}",country.getCountryName());
        }
    }

}
