package com.example.supermarket.respository;

import com.example.supermarket.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description: java类作用描述
 * @Author: lic
 * @CreateDate: 2019/7/12 16:52
 */
@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
}
