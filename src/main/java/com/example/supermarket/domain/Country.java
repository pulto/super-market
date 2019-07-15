package com.example.supermarket.domain;

import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Description: java类作用描述
 * @Author: lic
 * @CreateDate: 2019/7/12 16:02
 */
@Entity
@Data
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String countryName;
    private String countryCode;
}
