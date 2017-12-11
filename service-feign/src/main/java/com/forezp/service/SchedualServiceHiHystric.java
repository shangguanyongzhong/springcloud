package com.forezp.service;

import org.springframework.stereotype.Component;

/**
 * Created by sgyz(上官永忠) on 2017/12/11.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
